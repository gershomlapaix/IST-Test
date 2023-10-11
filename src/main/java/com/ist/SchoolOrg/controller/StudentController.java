package com.ist.SchoolOrg.controller;

import com.ist.SchoolOrg.errorHandler.InvalidInputException;
import com.ist.SchoolOrg.errorHandler.ResourceNotFoundException;
import com.ist.SchoolOrg.model.GroupMember;
import com.ist.SchoolOrg.model.Student;
import com.ist.SchoolOrg.model.StudentSubject;
import com.ist.SchoolOrg.services.GroupMemberService;
import com.ist.SchoolOrg.services.StudentService;
import com.ist.SchoolOrg.services.StudentSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;
    private final StudentSubjectService studentSubjectService;
    private final GroupMemberService groupMemberService;

    @Autowired
    public StudentController(StudentService studentService, StudentSubjectService studentSubjectService, GroupMemberService groupMemberService){
        this.studentService = studentService;
        this.studentSubjectService = studentSubjectService;
        this.groupMemberService = groupMemberService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Object> getStudentById(@PathVariable UUID studentId) {
        try {
            Optional<Student> student = studentService.getSingleStudent(studentId);
            return ResponseEntity.ok(student);
        } catch (ResourceNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error");
        }
    }

    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        try {
            // Validate student data (replace this with your actual validation logic)
            if (student.getName() == null || student.getName().isEmpty()) {
                throw new InvalidInputException("Student name is required.");
            }

            // If validation succeeds, create the student
            Student createdStudent = studentService.CreateStudent(student);

            // Return a 201 Created response with the created student
            return ResponseEntity.status(HttpStatus.CREATED).body(String.valueOf(createdStudent));
        } catch (InvalidInputException ex) {
            // Handle validation failure: Return a 400 Bad Request response with the error message
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        } catch (Exception ex) {
            // Handle other exceptions (e.g., database errors) as needed
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error");
        }
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<String> deleteStudent(@PathVariable UUID studentId) {
        try {
            studentService.deleteStudent(studentId);
            return ResponseEntity.noContent().build(); // Return 204 No Content on success
        } catch (RuntimeException ex) {
            // Handle exceptions (e.g., database errors) as needed
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Deletion Error");
        }
    }

    // getting the enrolled subject
    @GetMapping("/{studentId}/enrolled-subjects")
    public ResponseEntity<Object> getEnrolledSubjects(@PathVariable UUID studentId) {
        try {
            List<StudentSubject> enrolledSubjects = studentSubjectService.getEnrolledSubjectsByStudentId(studentId);
            return ResponseEntity.ok(enrolledSubjects);
        } catch (ResourceNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error");
        }
    }

    // getting the membership groups
    @GetMapping("/{studentId}/member-groups")
    public ResponseEntity<Object> getMemberGroups(@PathVariable UUID studentId) {

        try {
            List<GroupMember> memberGroups = groupMemberService.getMemberGroups(studentId);
            return new ResponseEntity<>(memberGroups, HttpStatus.OK);
        } catch (ResourceNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error");
        }
    }
}

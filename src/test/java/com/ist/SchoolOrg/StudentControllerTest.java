package com.ist.SchoolOrg;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ist.SchoolOrg.controller.StudentController;
import com.ist.SchoolOrg.model.Student;
import com.ist.SchoolOrg.services.GroupMemberService;
import com.ist.SchoolOrg.services.StudentService;
import com.ist.SchoolOrg.services.StudentSubjectService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@WebMvcTest(StudentController.class)
public class StudentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private StudentService studentService;
    @MockBean
    private StudentSubjectService studentSubjectService;
    @MockBean
    private GroupMemberService groupMemberService;

    @BeforeEach
    public void setup() {
        // Mock data or behavior for the StudentService
    }

    @Test
    public void testGetAllStudents() throws Exception {
        // Mock data or behavior for the StudentService

        List<Student> students = new ArrayList<>();
        // Add some mock students to the list

        Mockito.when(studentService.getAllStudents()).thenReturn(students);

        mockMvc.perform(MockMvcRequestBuilders.get("/students")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(students.size()));
    }

    @Test
    public void testGetStudentById() throws Exception {
        // Mock data or behavior for the StudentService

        Student student = new Student();
        UUID studentId = UUID.fromString("00fef7de-5ae9-11ee-8c99-0242ac120002");
        student.setId(studentId);

        Mockito.when(studentService.getSingleStudent(studentId)).thenReturn(Optional.of(student));

        mockMvc.perform(MockMvcRequestBuilders.get("/students/{studentId}", studentId.toString())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(studentId.toString()));
    }

    @Test
    public void testDeleteStudent() throws Exception {
        UUID studentId = UUID.randomUUID();

        // Mock behavior for the StudentService's deleteStudent method to throw an exception
        Mockito.doThrow(new RuntimeException("Deletion Error")).when(studentService).deleteStudent(studentId);

        mockMvc.perform(MockMvcRequestBuilders.delete("/students/{studentId}", studentId.toString())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isInternalServerError()) // Expect a 500 Internal Server Error
                .andExpect(MockMvcResultMatchers.content().string("Deletion Error")); // Expect the error message
    }

    // Error cases
    // for invalid input

    @Test
    public void testCreateStudentInvalidInput() throws Exception {
        // Create a student with missing required fields (e.g., name)
        Student invalidStudent = new Student();

        mockMvc.perform(post("/students")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(invalidStudent)))
                .andExpect(MockMvcResultMatchers.status().isBadRequest()) // Expect a 400 Bad Request
                .andExpect(MockMvcResultMatchers.content().string("Student name is required.")); // Expect the error message
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void testGetStudentByIdInternalServerError() throws Exception {
        UUID studentId = UUID.randomUUID();

        // Mock behavior for the StudentService's getStudentById method to throw an exception
        Mockito.when(studentService.getSingleStudent(studentId)).thenThrow(new RuntimeException("Internal Server Error"));

        mockMvc.perform(MockMvcRequestBuilders.get("/students/{studentId}", studentId.toString())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isInternalServerError()) // Expect a 500 Internal Server Error
                .andExpect(MockMvcResultMatchers.content().string("Internal server error")); // Expect the error message
    }
}

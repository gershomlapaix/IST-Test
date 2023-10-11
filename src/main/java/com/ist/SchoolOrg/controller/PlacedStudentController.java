package com.ist.SchoolOrg.controller;

import com.ist.SchoolOrg.model.GroupMember;
import com.ist.SchoolOrg.services.PlacedStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/placed-students")
public class PlacedStudentController {
    private final PlacedStudentService placedStudentService;

    @Autowired
    public PlacedStudentController(PlacedStudentService placedStudentService) {
        this.placedStudentService = placedStudentService;
    }

    @GetMapping("/placed")
    public ResponseEntity<List<GroupMember>> getPlacedStudents() {
        List<GroupMember> placedStudents = placedStudentService.getAllPlacedStudents();
        return new ResponseEntity<>(placedStudents, HttpStatus.OK);
    }

    @GetMapping("/unplaced")
    public ResponseEntity<List<GroupMember>> getUnPlacedStudents() {
        List<GroupMember> unplacedStudents = placedStudentService.getAllUnPlacedStudents();
        return new ResponseEntity<>(unplacedStudents, HttpStatus.OK);
    }
}

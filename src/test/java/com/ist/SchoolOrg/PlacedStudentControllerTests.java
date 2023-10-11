package com.ist.SchoolOrg;
import com.ist.SchoolOrg.controller.PlacedStudentController;
import com.ist.SchoolOrg.model.GroupMember;
import com.ist.SchoolOrg.services.PlacedStudentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// ...

@WebMvcTest(PlacedStudentController.class)
public class PlacedStudentControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PlacedStudentService placedStudentService;

    @Test
    public void testGetPlacedStudents_Success() throws Exception {
        // Mock data: Create a list of placed students
        List<GroupMember> placedStudents = new ArrayList<>();

        // Mock the service method to return the list of placed students
        Mockito.when(placedStudentService.getAllPlacedStudents()).thenReturn(placedStudents);

        // Perform the GET request to retrieve placed students
        mockMvc.perform(get("/placed-students/placed")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(0)); // Expect one placed student
    }

    @Test
    public void testGetUnPlacedStudents() throws Exception {
        // Mock data: Create an empty list of placed students
        List<GroupMember> unPlacedStudents = Collections.emptyList();

        // Mock the service method to return an empty list
        Mockito.when(placedStudentService.getAllUnPlacedStudents()).thenReturn(unPlacedStudents);

        // Perform the GET request to retrieve placed students
        mockMvc.perform(get("/placed-students/unplaced")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(0)); // Expect no placed students
    }
}

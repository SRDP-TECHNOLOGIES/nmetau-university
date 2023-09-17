package com.pdrs.nmetau.service;

import com.pdrs.nmetau.model.Faculty;
import com.pdrs.nmetau.model.dto.FacultyDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface FacultyService {
    Optional<FacultyDTO> findFacultyById(int id);
    List<FacultyDTO> findAllFaculties();
    void createFaculty(Faculty faculty);
    void updateFacultyById(int id, Faculty faculty);
    void removeFacultyById(int id);
}

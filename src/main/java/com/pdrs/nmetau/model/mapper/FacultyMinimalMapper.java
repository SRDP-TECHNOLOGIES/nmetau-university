package com.pdrs.nmetau.model.mapper;

import com.pdrs.nmetau.model.Faculty;
import com.pdrs.nmetau.model.dto.FacultyMinimalDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FacultyMinimalMapper {
    FacultyMinimalMapper INSTANCE = Mappers.getMapper(FacultyMinimalMapper.class);
    FacultyMinimalDTO facultyToFacultyMinimalDTO(Faculty faculty);
    Faculty facultyMinimalDTOToFaculty(FacultyMinimalDTO facultyMinimalDTO);
}

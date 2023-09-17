package com.pdrs.nmetau.model.mapper;

import com.pdrs.nmetau.model.Faculty;
import com.pdrs.nmetau.model.dto.FacultyDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FacultyMapper {
    FacultyMapper INSTANCE = Mappers.getMapper(FacultyMapper.class);
    Faculty facultyDTOToFaculty(FacultyDTO facultyDTO);
    FacultyDTO facultyToFacultyDTO(Faculty faculty);
}

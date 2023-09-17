package com.pdrs.nmetau.model.dto;

import com.pdrs.nmetau.model.Faculty;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewsDTO {
    private Integer id;
    private String title;
    private String description;
    private String iconPath;
    private List<FacultyMinimalDTO> facultyList;
}

package com.pdrs.nmetau.model.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FacultyDTO {
    private Integer id;
    private String title;
    private String description;
    private String iconPath;
}

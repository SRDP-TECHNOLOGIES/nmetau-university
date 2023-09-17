package com.pdrs.nmetau.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FacultyMinimalDTO {
    private Integer id;
    private String title;
    private String iconPath;
}

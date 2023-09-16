package com.pdrs.nmetau.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String iconPath;

    @ManyToMany
    @JoinTable(name = "faculty_news",
    joinColumns = {@JoinColumn(name = "FACULTY_ID", referencedColumnName = "ID")},
    inverseJoinColumns = {@JoinColumn(name = "NEWS_ID", referencedColumnName = "ID")})
    List<News> newsList;
}

package com.pdrs.nmetau.service;

import com.pdrs.nmetau.model.News;
import com.pdrs.nmetau.model.dto.NewsDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface NewsService {
    List<NewsDTO> findAll();
    List<NewsDTO> findAll(Pageable pageable);
    List<NewsDTO> findAllByFacultyId(int facultyId);
    List<NewsDTO> findAllByFacultyId(Pageable pageable);
    Optional<NewsDTO> findById();
    void create(NewsDTO newsDTO);
    void removeById(int id);
    void updateById(int id, NewsDTO newsDTO);
}
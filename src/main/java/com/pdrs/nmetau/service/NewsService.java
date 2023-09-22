package com.pdrs.nmetau.service;

import com.pdrs.nmetau.model.News;
import com.pdrs.nmetau.model.dto.NewsDTO;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface NewsService {
    List<NewsDTO> findAllNews();
    List<NewsDTO> findAllNews(Pageable pageable);
    List<NewsDTO> findAllNewsByFacultyId();
    List<NewsDTO> findAllNewsByFacultyId(Pageable pageable);
    Optional<NewsDTO> findNewsById();
    void createNews(NewsDTO newsDTO);
    void removeNewsById(int id);
    void updateNewsById(int id, NewsDTO newsDTO);
}
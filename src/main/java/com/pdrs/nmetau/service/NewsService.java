package com.pdrs.nmetau.service;

import com.pdrs.nmetau.model.News;
import com.pdrs.nmetau.model.dto.NewsDTO;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface NewsService {
    List<News> findAllNews();
    List<News> findAllNews(Pageable pageable);
    List<News> findAllNewsByFacultyId();
    List<News> findAllNewsByFacultyId(Pageable pageable);
    Optional<News> findNewsById();
    void createNews(NewsDTO newsDTO);
    void removeNewsById(int id);
    void updateNewsById(int id, NewsDTO newsDTO);
}
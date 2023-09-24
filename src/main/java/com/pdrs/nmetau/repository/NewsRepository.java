package com.pdrs.nmetau.repository;

import com.pdrs.nmetau.model.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NewsRepository extends PagingAndSortingRepository<News, Integer> {
    List<News> findAll();
    @Query("SELECT n from News n JOIN n.facultyList f where f.id = :facultyId")
    List<News> findAllByFacultyId(@Param("facultyId") int facultyId);
}

package com.pdrs.nmetau.repository;

import com.pdrs.nmetau.model.News;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NewsRepository extends PagingAndSortingRepository<News, Integer> {
}

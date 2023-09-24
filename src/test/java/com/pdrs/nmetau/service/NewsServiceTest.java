package com.pdrs.nmetau.service;

import com.pdrs.nmetau.model.Faculty;
import com.pdrs.nmetau.model.News;
import com.pdrs.nmetau.model.dto.NewsDTO;
import com.pdrs.nmetau.model.mapper.NewsMapper;
import com.pdrs.nmetau.repository.NewsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class NewsServiceTest {
    final int pageSize = 1;
    NewsMapper newsMapper = NewsMapper.INSTANCE;
    @Mock
    NewsRepository newsRepository;

    @InjectMocks
    NewsService newsService;

    News news1;
    NewsDTO news1DTO;
    News news2;
    NewsDTO news2DTO;
    List<News> allNewsList;
    Page<News> newsFirstPage;
    List<NewsDTO> allNewsDTOList;
    List<NewsDTO> newsFirstPageDTOList;

    @BeforeEach
    void setUp() {
        Faculty itFaculty = Faculty.builder()
                .id(1)
                .title("IT")
                .description("It description")
                .iconPath("it-icon.png")
                .build();
        Faculty biologyFaculty = Faculty.builder()
                .id(2)
                .title("Biology")
                .description("Biology description")
                .iconPath("biology-icon.png")
                .build();

        news1 = News.builder()
                .id(1)
                .title("New year party IT")
                .description("The new year party in the IT faculty")
                .iconPath("news1-icon.png")
                .facultyList(List.of(itFaculty))
                .build();
        news1DTO = newsMapper.newsToNewsDTO(news1);
        news2 = News.builder()
                .id(2)
                .title("New professor")
                .description("We got a new biology professor who loves IT")
                .iconPath("news2-icon.png")
                .facultyList(List.of(itFaculty, biologyFaculty))
                .build();
        news2DTO = newsMapper.newsToNewsDTO(news1);
        allNewsList = List.of(news1, news2);
        newsFirstPage = new PageImpl<>(allNewsList, PageRequest.of(0, pageSize), allNewsList.size());
        allNewsDTOList = allNewsList.stream()
                .map(news -> newsMapper.newsToNewsDTO(news))
                .collect(Collectors.toList());
        newsFirstPageDTOList = newsFirstPage.stream()
                .map(news -> newsMapper.newsToNewsDTO(news))
                .collect(Collectors.toList());
    }

    @Test
    void FindAll_ReturnNewsDTOList() {
        when(newsRepository.findAll())
                .thenReturn(allNewsList);
        assertEquals(allNewsDTOList, newsService.findAll());
    }

    @Test
    void FindAll_WhenFirstPageRequested_ThenReturnFirstPage() {
        Pageable pageRequest = PageRequest.of(0, pageSize);
        when(newsRepository.findAll(pageRequest))
                .thenReturn(newsFirstPage);
        assertEquals(newsFirstPageDTOList, newsService.findAll(pageRequest));
    }

    @Test
    void FindAllByFacultyId_ThenReturnNewsList() {
        when(newsRepository.findAllByFacultyId(anyInt()))
                .thenReturn(List.of(news1));
        assertEquals(news1DTO, newsService.findAllByFacultyId(1));
    }
}
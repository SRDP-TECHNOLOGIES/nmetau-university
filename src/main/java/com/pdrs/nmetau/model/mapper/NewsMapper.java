package com.pdrs.nmetau.model.mapper;

import com.pdrs.nmetau.model.News;
import com.pdrs.nmetau.model.dto.NewsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = FacultyMinimalMapper.class)
public interface NewsMapper {
    NewsMapper INSTANCE = Mappers.getMapper(NewsMapper.class);
    NewsDTO newsToNewsDTO(News news);
    News newsDTOToNews(NewsDTO newsDTO);
}

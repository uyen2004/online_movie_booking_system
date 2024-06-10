package com.eticket.webclient.mapper;

import com.eticket.entity.Movie;
import com.eticket.webclient.dto.FetchedMovie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FetchedMovieMapper {
    @Mapping(source = "original_title", target = "title")
    @Mapping(source = "original_language", target = "language")
    @Mapping(source = "poster_path", target = "posterUrl")
    Movie toMovie(FetchedMovie fetchedMovie);
}

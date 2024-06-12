package com.eticket.webclient.service;

import com.eticket.repository.MovieRepository;
import com.eticket.webclient.dto.FetchMoviePage;
import com.eticket.webclient.dto.FetchedMovie;
import com.eticket.webclient.mapper.FetchedMovieMapper;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@Slf4j
public class FetchMovieService {
    private WebClient webClient;
    private MovieRepository movieRepository;
    private FetchedMovieMapper mapper;

    public FetchMovieService(MovieRepository movieRepository, FetchedMovieMapper mapper) {
        this.webClient = WebClient.builder()
                .baseUrl("https://jsonfakery.com/")
                .build();
        this.movieRepository = movieRepository;
        this.mapper = mapper;
    }

    @PostConstruct
    public void fetchMovie() {
        log.info("fetching movie data");
        Mono<List<FetchedMovie>> data = webClient
                .get()
                .uri("/movies/paginated?page=1")
                .retrieve()
                .bodyToMono(FetchMoviePage.class)
                .flatMap(fetchMovie -> Mono.just(fetchMovie.getData()));

        data.subscribe(movieDatas ->
                movieDatas.forEach(movieData -> movieRepository.save(mapper.toMovie(movieData)))
        );
    }
}

package com.sridhar.exp4.Service;

import com.sridhar.exp4.Entity.Movie;
import com.sridhar.exp4.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
     @Autowired
     private MovieRepository repo;
    public List<Movie> getAllMovies() {
        return repo.findAll();
    }

    public void addMovie(Movie movie) {
        repo.save(movie);
    }

    public Optional<Movie> getMovie(int id) {
        return repo.findById(id);
    }

    public void updateMovie(int id, Movie movie) {
        Movie movie1=repo.findById(id).orElseThrow();
        movie1.setTitle(movie.getTitle());
        movie1.setGenre(movie.getGenre());
        movie1.setYear(movie.getYear());
        movie1.setRating(movie.getRating());
        repo.save(movie1);
    }

    public void deleteMovie(int id) {
        repo.deleteById(id);
    }
}

package com.sridhar.exp4.Controller;

import com.sridhar.exp4.Entity.Movie;
import com.sridhar.exp4.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService service;
    @GetMapping("/get")
    public List<Movie> getAllMovies(){
        return service.getAllMovies();

    }
    @PostMapping("/add")
    public String addMovie(@RequestBody Movie movie){
        service.addMovie(movie);
        return "Movie Added Successfully🎥🎥";
    }
    @GetMapping("/{id}")
    public Optional<Movie> getMovie(@PathVariable int id){
        return service.getMovie(id);
    }
    @PutMapping("/{id}")
    public String updateMovie(@PathVariable int id,@RequestBody Movie movie){
        service.updateMovie(id,movie);
        return "Movie Updated Successfully.📽️🎦🍿";
    }
    @DeleteMapping("/{id}")
    public String deleteMovie(@PathVariable int id){
        service.deleteMovie(id);
        return  "Movie with ID " + id + " deleted successfully!";

    }
}

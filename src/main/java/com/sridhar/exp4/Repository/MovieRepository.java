package com.sridhar.exp4.Repository;

import com.sridhar.exp4.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

}

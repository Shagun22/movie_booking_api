package com.springbootdemo.moviebooking.controller;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.util.ArrayList;
import java.util.*;
import com.springbootdemo.moviebooking.model.Movie;
import org.springframework.web.bind.annotation.CrossOrigin;





@RestController
@RequestMapping(path = "/api/movies")
public class MovieController
{

    List<Movie> movieList = new ArrayList<>();

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path="/getMovies", produces = "application/json")
    public List<String> getMovies()
    {
        List<String> output =  new ArrayList<>();
        Iterator i = movieList.iterator();
        System.out.println("The ArrayList elements are:"+movieList.size());

        while (i.hasNext()) {
            output.add(((Movie)(i.next())).getTitle());

        }
        System.out.println("output"+output);
        return output;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path= "/bookMovie", consumes = "application/json")
    public ResponseEntity<String> bookMovie(@RequestBody Movie movie)
    {

        movieList.add(movie);
        System.out.println("movieList"+movieList);

        return new ResponseEntity<>("{status: OK}", HttpStatus.FOUND);

    }
}


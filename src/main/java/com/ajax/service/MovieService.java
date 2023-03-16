package com.ajax.service;

import org.springframework.stereotype.Service;

import com.ajax.Entity.Movie;
import com.ajax.dto.MovieDTO;

import com.ajax.repository.MovieRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {
	
	private final MovieRepository movieRepository; 
	
	public String movieInsert(MovieDTO movieDTO ) {
		
		Movie movie = movieDTO.createMovie(); 
		
		movieRepository.save(movie); 
		
		return "DB Insert 성공"; 
	}
	

}

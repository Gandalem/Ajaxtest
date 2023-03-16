package com.ajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajax.Entity.Movie;


public interface MovieRepository extends JpaRepository<Movie, Long> {

}

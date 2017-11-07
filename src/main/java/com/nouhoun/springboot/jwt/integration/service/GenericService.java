package com.nouhoun.springboot.jwt.integration.service;

import com.nouhoun.springboot.jwt.integration.domain.RandomCity;
import com.nouhoun.springboot.jwt.integration.domain.User;
import com.nouhoun.springboot.jwt.integration.domain.Match;

import java.util.List;

public interface GenericService {

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
    
    Match findByIdMatch(Long idMatch);
    
    User findByUsername(String username);

    List<Match> findAll();

    Match save(Match match);

    void delete(Long idMatch);

    void deleteAll(); 
}

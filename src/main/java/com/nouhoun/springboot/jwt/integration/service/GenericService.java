package com.nouhoun.springboot.jwt.integration.service;

import com.nouhoun.springboot.jwt.integration.domain.RandomCity;
import com.nouhoun.springboot.jwt.integration.domain.User;
import com.nouhoun.springboot.jwt.integration.domain.Match;

import java.util.List;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface GenericService {

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
    
    List<Match> findByIdMatch(Integer idMatch);
    
    User findByUsername(String username);

    List<Match> findAll();

    Match save(Match match);

    void delete(Integer idMatch);

    void deleteAll(); 
}

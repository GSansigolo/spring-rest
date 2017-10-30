package com.nouhoun.springboot.jwt.integration.service;

import com.nouhoun.springboot.jwt.integration.domain.User;
import com.nouhoun.springboot.jwt.integration.domain.Match;

import java.util.List;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface GenericService {
	
    User findByUsername(String username);

    List<Match> findByIdMatch(Integer idMatch);

    List<Match> findAll();

    Match save(Match match);

    void delete(Integer idMatch);

    void deleteAll(); 
}

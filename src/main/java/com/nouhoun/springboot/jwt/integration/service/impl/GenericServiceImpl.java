package com.nouhoun.springboot.jwt.integration.service.impl;

import com.nouhoun.springboot.jwt.integration.domain.Match;
import com.nouhoun.springboot.jwt.integration.domain.RandomCity;
import com.nouhoun.springboot.jwt.integration.domain.User;
import com.nouhoun.springboot.jwt.integration.repository.RandomCityRepository;
import com.nouhoun.springboot.jwt.integration.repository.UserRepository;
import com.nouhoun.springboot.jwt.integration.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nouhoun.springboot.jwt.integration.repository.*;

import java.util.List;

/**
 * Created by nydiarra on 07/05/17.
 */
@Service
public class GenericServiceImpl implements GenericService {
	
    @Autowired
    private UserRepository userRepository;
    private MatchRepository repository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return (List<RandomCity>)randomCityRepository.findAll();
    }
    
    @Override
    public List<Match> findByIdMatch(Integer idMatch){
        return repository.findByIdMatch(idMatch);
    }

    @Override
    public List<Match> findAll(){
        return (List<Match>) repository.findAll(); 
    }
    
    @Override
    public Match save(Match match){
        return repository.save(match);
    }
    
    @Override
    public void delete(Integer idMatch){
        repository.delete(idMatch);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

}

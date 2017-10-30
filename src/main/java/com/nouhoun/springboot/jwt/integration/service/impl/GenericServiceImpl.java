package com.nouhoun.springboot.jwt.integration.service.impl;

import com.nouhoun.springboot.jwt.integration.domain.Match;
import com.nouhoun.springboot.jwt.integration.domain.MatchRepository;
import com.nouhoun.springboot.jwt.integration.domain.User;
import com.nouhoun.springboot.jwt.integration.repository.UserRepository;
import com.nouhoun.springboot.jwt.integration.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import javax.inject.Inject;

@Service
public class GenericServiceImpl implements GenericService {
    @Autowired

    private GenericService repository;

    private UserRepository userRepository;


    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Inject
    public void setRepository(GenericService repository) {
        this.repository = repository;
    }

    @Override
    public List<Match> findByIdMatch(Integer idMatch){
        return repository.findByIdMatch(idMatch);
    }

    @Override
    public List<Match> findAll(){
        return repository.findAll(); 
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


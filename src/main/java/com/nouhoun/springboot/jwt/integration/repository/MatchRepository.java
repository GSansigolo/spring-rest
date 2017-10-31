package com.nouhoun.springboot.jwt.integration.repository;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.domain.User;
import com.nouhoun.springboot.jwt.integration.domain.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match, Integer> {
    
	List<Match> findByIdMatch(Integer idMatch);
    
}

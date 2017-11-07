package com.nouhoun.springboot.jwt.integration.repository;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.domain.Match;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match, Long> {
    
	Match findByIdMatch(Long idMatch);
}

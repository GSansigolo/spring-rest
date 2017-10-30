package com.nouhoun.springboot.jwt.integration.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Integer> {
    List<Match> findByIdMatch(Integer idMatch);
}

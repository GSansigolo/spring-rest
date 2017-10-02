package com.kaluzny.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface MatchRepository extends JpaRepository<Match, Integer> {
    List<Match> findByIdMatch(Integer idMatch);
}

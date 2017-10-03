package com.kaluzny.web;

import java.util.List;
import com.kaluzny.domain.*;

public interface MatchService {

        public List<Match> findByIdMatch(Integer idMatch);

        public List<Match> findAll();

        public Match save(Match match);

        public void delete(Integer idMatch);

        public void deleteAll(); 
}


package com.kaluzny.web;

import com.kaluzny.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.inject.Inject;

@Service("MatchService")
public class MatchServiceImpl implements MatchService{
    
    private MatchRepository repository;

    @Inject
    public void setRepository(MatchRepository repository) {
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



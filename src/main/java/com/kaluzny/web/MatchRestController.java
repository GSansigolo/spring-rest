package com.kaluzny.web;

import com.kaluzny.domain.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/matchs")
public class MatchRestController {

    private MatchService service;

    @Inject
    public void setMatchService(MatchService service) {
        this.service = service;
    }

    @RequestMapping(
            method = RequestMethod.GET)
    public ResponseEntity<Collection<Match>> getAllMatch() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @RequestMapping(
            value = "/{idMatch}",
            method = RequestMethod.GET)
    public ResponseEntity<List<Match>> findByIdMatch(@PathVariable Integer idMatch) {
        return new ResponseEntity<>(service.findByIdMatch(idMatch), HttpStatus.OK);
    }

    
    @RequestMapping(
            method = RequestMethod.POST)
    public ResponseEntity<?> addMatch(@RequestBody Match match) {
    	service.save(match);
        return new ResponseEntity<>(service.save(match), HttpStatus.CREATED);
    }	
    
    @RequestMapping(
            value = "/{idMatch}",
            method = RequestMethod.DELETE)
    public void deleteMatchWithId(@PathVariable Integer idMatch) {
        service.delete(idMatch);
    }

    @RequestMapping(
            method = RequestMethod.DELETE)
    public void deleteAllMatchs() {
        service.deleteAll();
    }
}

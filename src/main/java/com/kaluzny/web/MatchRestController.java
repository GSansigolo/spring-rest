package com.kaluzny.web;

import com.kaluzny.domain.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.Collection;

@RestController
@RequestMapping("/api/matchs")
public class MatchRestController {

    private MatchRepository repository;

    @Inject
    public void setRepository(MatchRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(
            method = RequestMethod.POST)
    public ResponseEntity<?> addMatch(@RequestBody Match match) {
        return new ResponseEntity<>(repository.save(match), HttpStatus.CREATED);
    }

    @RequestMapping(
            method = RequestMethod.GET)
    public ResponseEntity<Collection<Match>> getAllMatch() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(
            value = "/{idMatch}",
            method = RequestMethod.GET)
    public ResponseEntity<Match> getMatchWithIdMatch(@PathVariable Integer idMatch) {
        return new ResponseEntity<>(repository.findOne(idMatch), HttpStatus.OK);
    }

    @RequestMapping(
            value = "/{idMatch}",
            method = RequestMethod.PUT)
    public ResponseEntity<Match> updateMatchFromDB(@PathVariable("idMatch") Integer idMatch, @RequestBody Match match) {
        
        Match currentMatch = repository.findOne(idMatch);
        currentMatch.setIdMatch(match.getIdMatch());
        currentMatch.setNumberPlayers(match.getNumberPlayers());
        currentMatch.setWinner(match.getWinner());
        currentMatch.setScore(match.getScore());
        currentMatch.setNumberSpike(match.getNumberSpike());
        currentMatch.setNumberFireball(match.getNumberFireball());
        currentMatch.setNumberNuke(match.getNumberNuke());

        Match currentMatch1 = repository.findOne(idMatch);



        return new ResponseEntity<>(repository.save(currentMatch1), HttpStatus.OK);
    }

    @RequestMapping(
            value = "/{idMatch}",
            method = RequestMethod.DELETE)
    public void deleteMatchWithId(@PathVariable Integer idMatch) {
        repository.delete(idMatch);
    }

    @RequestMapping(
            method = RequestMethod.DELETE)
    public void deleteAllMatchs() {
        repository.deleteAll();
    }
}

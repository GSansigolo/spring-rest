package com.nouhoun.springboot.jwt.integration.controller;

import com.nouhoun.springboot.jwt.integration.domain.*;
import com.nouhoun.springboot.jwt.integration.domain.Match;
import com.nouhoun.springboot.jwt.integration.service.GenericService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;

@RestController
@RequestMapping("/api/matchs")
public class ResourceController {

    private GenericService service;

    @Inject
    public void setMatchService(GenericService service) {
        this.service = service;
    }

    @RequestMapping(
            method = RequestMethod.GET)
    //@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public ResponseEntity<Collection<Match>> getAllMatch() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @RequestMapping(
            value = "/{idMatch}",
            method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public ResponseEntity<List<Match>> findByIdMatch(@PathVariable Integer idMatch) {
        return new ResponseEntity<>(service.findByIdMatch(idMatch), HttpStatus.OK);
    }

    
    @RequestMapping(
            method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public ResponseEntity<?> addMatch(@RequestBody Match match) {
        service.save(match);
        return new ResponseEntity<>(service.save(match), HttpStatus.CREATED);
    }   
    
    @RequestMapping(
            value = "/{idMatch}",
            method = RequestMethod.DELETE)
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public void deleteMatchWithId(@PathVariable Integer idMatch) {
        service.delete(idMatch);
    }

    @RequestMapping(
            method = RequestMethod.DELETE)
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public void deleteAllMatchs() {
        service.deleteAll();
    }
}

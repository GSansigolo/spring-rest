package com.nouhoun.springboot.jwt.integration.controller;

import com.nouhoun.springboot.jwt.integration.domain.RandomCity;
import com.nouhoun.springboot.jwt.integration.domain.User;
import com.nouhoun.springboot.jwt.integration.domain.Match;
import com.nouhoun.springboot.jwt.integration.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * Created by nydiarra on 06/05/17.
 */
@RestController
@RequestMapping("/api/matchs")
public class ResourceController {
    @Autowired
    private GenericService userService;
    
    @Autowired
    private GenericService service;
    
    public void setMatchService(GenericService service) {
        this.service = service;
    }

    @RequestMapping(value ="/users", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<User> getUsers(){
        return userService.findAllUsers();
    }
        @RequestMapping(
            method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
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
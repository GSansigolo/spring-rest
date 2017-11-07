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

    public void setMatchService(GenericService userService) {
        this.userService = userService;
    }
    

    @RequestMapping(value ="/users", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<User> getUsers(){
        return userService.findAllUsers();
    }

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<Match> getAllMatch() {
        return userService.findAll();
    }

    @RequestMapping(value = "/{idMatch}", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public Match findByIdMatch(@PathVariable Long idMatch) {
        return userService.findByIdMatch(idMatch);
    }

    @RequestMapping(value = "/{idMatch}", method = RequestMethod.DELETE)
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public void deleteById(@PathVariable Long idMatch) {
        userService.delete(idMatch);
    }

    @RequestMapping( method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public void addMatch(@RequestBody Match match) {
        userService.save(match);
    }   

    @RequestMapping(method = RequestMethod.DELETE)
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public void deleteAllMatchs() {
        userService.deleteAll();
    }
}
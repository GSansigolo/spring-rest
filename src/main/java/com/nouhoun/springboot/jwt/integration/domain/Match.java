package com.nouhoun.springboot.jwt.integration.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonView;
import com.nouhoun.springboot.jwt.integration.service.GenericService;

@Entity
@Table(name = "match")

public class Match {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

     @Column(name="id_match")
	 //@JsonView(GenericService.class)
	 private Integer idMatch;

	 @Column(name="number_players")
	 //@JsonView(GenericService.class)
    private Integer numberPlayers;

     @Column(name="winner")
     //@JsonView(GenericService.class)
	private String winner;
    
     @Column(name="score")
     //@JsonView(GenericService.class)
	private Integer score;
    
     @Column(name="number_spike")
     //@JsonView(GenericService.class)
	private Integer numberSpike;
    
     @Column(name="number_fireball")
     //@JsonView(GenericService.class)
	private Integer numberFireball;
    
     @Column(name="number_nuke")
     //@JsonView(GenericService.class)
	private Integer numberNuke;
    
    
    public Match(Integer idMatch, Integer numberPlayers, String winner, Integer score, Integer numberSpike, Integer numberFireball, Integer numberNuke) {
        this.idMatch = idMatch;
	    this.numberPlayers = numberPlayers;
	    this.winner = winner;
	    this.score = score;
	    this.numberSpike = numberSpike;
	    this.numberFireball = numberFireball;
	    this.numberNuke = numberNuke;
    }

    public Match() {
    }

    public void setIdMatch(Integer idMatch){
        this.idMatch = idMatch;
    }

    public Integer getIdMatch() {
        return idMatch;
    }

    public void setNumberPlayers(Integer numberPlayers){
        this.numberPlayers = numberPlayers;
    }

    public Integer getNumberPlayers(){
        return numberPlayers;
    }

    public void setWinner(String winner){
        this.winner = winner;
    }

    public String getWinner(){
        return winner;
    }

    public void setScore(Integer score){
        this.score = score;
    }

    public Integer getScore(){
        return score;
    }

    public void setNumberSpike(Integer numberSpike){
        this.numberSpike = numberSpike;
    }

    public Integer getNumberSpike(){
        return numberSpike;
    }

    public void setNumberFireball(Integer numberFireball){
        this.numberFireball = numberFireball;
    }

    public Integer getNumberFireball(){
        return numberFireball;
    }

    public void setNumberNuke(Integer numberNuke){
        this.numberNuke = numberNuke;
    }

    public Integer getNumberNuke(){
        return numberNuke;
    }

    @Override
    public String toString() {
        return "Partida{" +
            "Indentificador Partida: " + numberPlayers + '\'' +
            "Numero Jogadores: " + numberPlayers + '\'' +
            "Vencedor: "+ winner  + '\'' +
            "Pontuação: " + score + '\'' +
            "Numero de Espinhos: " + numberSpike + '\'' +
            "Numero de Fireball" + numberFireball + '\'' +
            "Numero de Nukes" + numberNuke + '}';
    }
}

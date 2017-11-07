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
	 private long idMatch;

	 @Column(name="number_players")
    private String numberPlayers;

     @Column(name="winner")
	private String winner;
    
     @Column(name="score")
	private String score;
    
     @Column(name="number_spike")
	private String numberSpike;
    
     @Column(name="number_fireball")
	private String numberFireball;
    
     @Column(name="number_nuke")
	private String numberNuke;
    
    
    public Match(Long idMatch, String numberPlayers, String winner, String score, String numberSpike, String numberFireball, String numberNuke) {
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

    public void setIdMatch(Long idMatch){
        this.idMatch = idMatch;
    }

    public Long getIdMatch() {
        return idMatch;
    }

    public void setNumberPlayers(String numberPlayers){
        this.numberPlayers = numberPlayers;
    }

    public String getNumberPlayers(){
        return numberPlayers;
    }

    public void setWinner(String winner){
        this.winner = winner;
    }

    public String getWinner(){
        return winner;
    }

    public void setScore(String score){
        this.score = score;
    }

    public String getScore(){
        return score;
    }

    public void setNumberSpike(String numberSpike){
        this.numberSpike = numberSpike;
    }

    public String getNumberSpike(){
        return numberSpike;
    }

    public void setNumberFireball(String numberFireball){
        this.numberFireball = numberFireball;
    }

    public String getNumberFireball(){
        return numberFireball;
    }

    public void setNumberNuke(String numberNuke){
        this.numberNuke = numberNuke;
    }

    public String getNumberNuke(){
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

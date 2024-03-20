package com.example.entities;

public class Players {
	    private String Name;
	    private  int Health,Strength,Attack,Strike;

	    public Players(){

	    }
	    public Players(String Name,int Health,int Strength,int Attack){
	        this.Name=Name;
	        this.Health=Health;
	        this.Strength=Strength;
	        this.Attack=Attack;
	    }
	    
	    public String getName(){
	        return this.Name;
	    }
	    public int getHealth(){
	        return this.Health;
	    }
	    public int getStrength(){
	        return this.Strength;
	    }
	    public int getAttack(){
	        return this.Attack;
	    }
	    public int getStrike(){
	        return this.Strike;
	    }

	    public void setHealth(int Health){
	        this.Health=Health;
	    }
	    public void setStrike(int Strike){
	        this.Strike=Strike;
	    }
	    
	}




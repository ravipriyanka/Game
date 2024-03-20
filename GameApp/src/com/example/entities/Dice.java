package com.example.entities;
import java.util.Random;

	public class Dice {
	    static Shortcut s=new Shortcut();
	    private static Players Player;
	    static Random R = new Random();

	    public Dice(){

	    }
	    public Dice(Players player){
	        Player=player;
	    }

	    public int Attack(){
	        int power=Player.getAttack();
	       power*= R.nextInt(6) + 1;
	        return power>0? power/10:0;
	    }

	    public int Defend(){
	        int power=Player.getStrength();
	       power*= R.nextInt(6) + 1;
	        return power>0? power/10:0;
	    }
	}





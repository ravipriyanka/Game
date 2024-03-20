package com.example.main;
import java.util.Scanner;

import com.example.entities.Create;
import com.example.entities.Game;
import com.example.entities.Players;

public class Main {
	
	   
	    public static void main(String[] args) {
	    	 Scanner sc=new Scanner(System.in);

	      
	        // creating players
	        Players Player1=Create.CreatePlayer();
	        Players Player2=Create.CreatePlayer();
	       
	        Game G=new Game(Player1,Player2);
	        G.SetGame();
	        G.StartGame();
	        G.EndGame();


	    
	   
	}

}

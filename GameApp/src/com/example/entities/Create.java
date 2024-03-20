package com.example.entities;

	import java.util.Scanner;

	public class Create {
	   static  Shortcut s=new Shortcut();
	    static Scanner sc = new Scanner(System.in);

	    public static Players CreatePlayer() {
	        Players play=null;
	        String name = "";
	        int health = 0, strength = 0, attack = 0, point = 0;
	        point = 300;
	        s.Clear();
	        System.out.println("Create Player");
	        System.out.println("Enter Name");
	        name = sc.nextLine();

	        System.out.println("Enter Health[0-" + point + "]");
	        health = sc.nextInt();
	        point -= health;

	        System.out.println("Enter Strength[0-" + point + "]");
	        strength = sc.nextInt();
	        point -= strength;
	        
	        System.out.println("Enter Attach[0-" + point + "]");
	        attack = sc.nextInt();
	        sc.nextLine();
	        point -= attack;

	// for validation

	        if (health + strength + attack > 300) {
	            System.out.println("ERROR!-Input Out of Range");
	            s.Wait(1000);
	            play=CreatePlayer();
	        }else{
	            play=new Players(name, health, strength, attack);
	            System.out.println("player Created Sucessfully");
	        }
	        s.Wait(1000);
	        return play;
	    }

	}




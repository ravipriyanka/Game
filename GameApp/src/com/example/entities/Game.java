package com.example.entities;
	
	import java.util.Scanner;


	public class Game {
	    static Shortcut s=new Shortcut();
	    static Players Player1;
	    static Players Player2;
	    static  Dice D1;
	    static  Dice D2;
	    static Scanner sc=new Scanner(System.in);
	    public Game(){

	    }
	    public Game(Players player1,Players player2){
	        Player1=player1;
	        Player2=player2;
	    }

	    public void SetGame(){
	        // creating dice's
	        D1=new Dice(Player1);
	        D2=new Dice(Player2);
	        FitstStrike();
	    }

	    public void StartGame(){
	        while (Player1.getHealth()>0&&Player2.getHealth()>0) {
	            s.Clear();
	            ScoreBoard();
	            if(Player1.getStrike()!=0){
	            System.out.println(Player1.getName()+" Enter to Attack");
	            sc.nextLine();
	               int A=D1.Attack(); 
	               System.out.println("\tATTACK:"+A);
	               s.Wait(1000);
	               System.out.println("\n"+Player2.getName()+" Enter to Defend");
	               sc.nextLine();
	               int D=D2.Defend();
	               System.out.println("\tDEFEND:"+D);
	               s.Wait(1000);

	               int H= Damage(A,D,Player2.getHealth());

	               Player2.setHealth(H);
	               Player1.setStrike(0);
	            }else{
	                System.out.println(Player2.getName()+" Enter to Attack");
	                sc.nextLine();
	                int A=D2.Attack(); 
	                System.out.println("\tATTACK:"+A);
	               s.Wait(1000);
	                System.out.println(Player1.getName()+" Enter to Defend");
	                sc.nextLine();
	                int D=D1.Defend();
	                System.out.println("\tDEFEND:"+D);
	               s.Wait(1000);
	                int H= Damage(A,D,Player1.getHealth());
	                Player1.setHealth(H);
	                Player1.setStrike(1);
	            }
	        }
	    }

	    void ScoreBoard(){
	        System.out.println(Player1.getName()+"'s Health : "+Player1.getHealth()+"\t\t\t"+Player2.getName()+"'s Health : "+Player2.getHealth());
	        System.out.println("```````````````````````````````````````````````````````````````````````````````````````````````````````");
	    }

	    public void EndGame(){
	        s.Clear();
	        if(Player1.getHealth()>Player2.getHealth()){
	            System.out.println("\n\n\n\n\n\t\t\tMatch WON by "+Player1.getName()+"(^_^)\n\n\n\n\n");
	        }else
	        System.out.println("\n\n\n\n\n\t\t\tMatch WON by "+Player2.getName()+"(^_^)\n\n\n\n\n");
	    }

	    void FitstStrike(){
	        if(Player1.getHealth()>Player2.getHealth()){
	            Player1.setStrike(1);
	        }else{
	            Player2.setStrike(1);
	        }
	    }

	    int Damage(int A,int D,int H){
	      if (D-A<0) {
	        return H+(D-A);
	      }else{
	        return H;
	      }
	    }
	          
	   
	}




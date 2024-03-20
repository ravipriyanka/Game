package com.example.entities;

	
	import java.lang.Thread;
	public class Shortcut {
	    public   void Wait(long msec){
	        try {
	            Thread.sleep(msec);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	    public void Clear(){
	        System.out.print("\033c");
	    }
	}




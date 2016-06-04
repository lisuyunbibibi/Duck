package model;

import dao.FlyWithRocket;
import dao.Squeak;

public class RedheadDuck extends Duck { 
 	public RedheadDuck(){ 
 		setQuackBehavior(new Squeak());	 
		setFlyBehavior(new FlyWithRocket());		 
 	} 
 	@Override 
 	public void display(){ 
 		System.out.println("RedheadDuck"); 
 	} 
 } 


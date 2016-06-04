package model;

import dao.FlyWithWings;
import dao.Quack;

public class MallardDuck extends Duck { 
 	public MallardDuck(){ 
 		setQuackBehavior(new Quack());	 
 		setFlyBehavior(new FlyWithWings());		 
 	} 
 	@Override 
 	public void display(){ 
 		System.out.println("MallardDuck"); 
 	} 
 } 


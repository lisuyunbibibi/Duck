package model;

import dao.FlyNoWay;
import dao.MuteQuack;

public class RubberDuck extends Duck { 
 	public RubberDuck(){ 
 		setQuackBehavior(new MuteQuack());	 
 		setFlyBehavior(new FlyNoWay());		 
 	} 
 	@Override 
 	public void display(){ 
 		System.out.println("RubberDuck"); 
 	} 
 } 

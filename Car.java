package com.vstl.inheritance;
//multilevel inheritance
public class Car {
	public String strprocess="start";
	public String strendprocess="stop";
	public String strRefule="Diesel";
	
	public void start() {
		System.out.println("car start:"+strprocess);
	}
	public void Stop() {
		System.out.println("car stop:"+strendprocess);
	}
	public void Refule() {
		System.out.println(" car refule :"+strRefule);
	}

}

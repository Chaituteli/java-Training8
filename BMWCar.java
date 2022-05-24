package com.vstl.inheritance;

public class BMWCar extends Car {
	public String strengine="four stroak Engine";
	public String strlockbrekes="anti lock brakes";
	
	public void Engine() {
		System.out.println("Engine:"+strengine);
	}
	public void lockbrake() {
		System.out.println(" lock brake:"+strlockbrekes);
	}
	
	public void GetCarDetails() {
		this.start();
		this.Stop();
		this.Refule();
	}

}

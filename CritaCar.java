package com.vstl.inheritance;

public class CritaCar extends BMWCar {
	public String strWheel="Four Wheel Drive";
	
	public void WheelDrive() {
		System.out.println("Wheel Drive:"+strWheel);
	}
	public void getCarTest() {
		this.Engine();
		this.lockbrake();
		this.GetCarDetails() ;
	}

}

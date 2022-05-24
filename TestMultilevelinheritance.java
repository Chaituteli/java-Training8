package com.vstl.inheritance;

public class TestMultilevelinheritance {

	public static void main(String[] args) {
		 Car objCar=new  Car();
		 objCar.start();
		 objCar.Stop();
		 objCar.Refule();
		 
		 BMWCar objBMWCar =new BMWCar ();
		 objBMWCar.Engine();
		 objBMWCar.lockbrake();
		 
		 CritaCar objCritaCar= new CritaCar();
		 objCritaCar. WheelDrive();

	}

}

package com.polymorphism;

public abstract class Vehical1 
{
	public abstract void startEngine();

	  public abstract void stopEngine();
}
class Car extends Vehical1
{
	 public void startEngine() 
	 {
	    System.out.println("Car engine started with a key.");
	  }

	  public void stopEngine() 
	  {
	    System.out.println("Car engine stopped when the key was turned off.");
	  }
	}
class Motorcycle extends Vehical1
{
	 public void startEngine() 
	 {
		    System.out.println("Motorcycle engine started with a kick-start.");
		  }
		  public void stopEngine() 
		  {
		    System.out.println("Motorcycle engine stopped when ignition was turned off.");
		  }
public static void main(String[] args) 
{
	Vehical1 car = new Car();
	Vehical1 motorcycle = new Motorcycle();

    startAndStopEngine(car);
    startAndStopEngine(motorcycle);
  }

  public static void startAndStopEngine(Vehical1 vehicle) {
    vehicle.startEngine();
    vehicle.stopEngine();
  }
  }
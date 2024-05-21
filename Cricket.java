package com.accessspecifier;

class Game
{
	void type()
	{
		System.out.println("Indoor game and outdoor game");
	}
}
public class Cricket extends Game{
	void type()
	{
		System.out.println("Indoor game and outdoor game");
	}
	public static void main(String[] args) {
		//Game g = new Game();
		//g.type();
		Cricket c= new Cricket();
		c.type();
		c.type();
	}
}

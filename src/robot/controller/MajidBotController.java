package robot.controller;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import robot.model.MajidBot;

public class MajidBotController 
{
	private MajidBot myBot;
	
	public MajidBotController()
	{
		myBot = new MajidBot();
	}

	public void start() { 
		Motor.B.setSpeed(180);
		Motor.B.forward();
		if (Button.waitForAnyPress() == Button.ID_ESCAPE)
		{
			System.exit(0);
		}
		}
	{
		while( Button.waitForAnyPress() != Button.ID_ESCAPE)
		{
			
			
				myBot.drawShape(1, 1);
		}
	}
	


public void start1() { 
	Motor.B.setSpeed(360);
	Motor.B.forward();
	if (Button.waitForAnyPress() == Button.ID_ESCAPE)
	{
		System.exit(0);
	}
	{
	}
	}




public void start11() { 
	Motor.B.setSpeed(90);
	Motor.B.forward();
	if (Button.waitForAnyPress() == Button.ID_ESCAPE)
	{
		System.exit(0);
	}
	}




public void start111() { 
	Motor.B.setSpeed(720);
	Motor.B.forward();
	if (Button.waitForAnyPress() == Button.ID_ESCAPE)
	{
		System.exit(0);
	}
	}



public void start1111() { 
	Motor.B.setSpeed(1080);
	Motor.B.forward();
	if (Button.waitForAnyPress() == Button.ID_ESCAPE)
	{
		System.exit(0);
	}
	}
}

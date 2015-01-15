package robot.model;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;

public class MajidBot<mySonar> 
{
	private UltrasonicSensor mySonar;
	private TouchSensor frontTouch;
	private TouchSensor backTouch;
	private SoundSensor microphone;
	
	public MajidBot()
	{
		setMySonar(new UltrasonicSensor(SensorPort.S1));
		setFrontTouch(new TouchSensor(SensorPort.S2));
		setBackTouch(new TouchSensor(SensorPort.S3));
		setMicrophone(new SoundSensor(SensorPort.S4));
	}
	
	/**
	 * Uses the SoundSensor Object microphone to dance
	 * microphone.readValue() will be the method used to determine danceness
	 */
	public void danceRobotDance()
	{
	
	}
	
	/**
	 * Uses the TouchSensor, specifically the isPressed() method to move away from objects and continue moving	 
	 */                                                                                                                                                                                                                                                                              
	public void hasHaphephobia() 
	{
	}
	
	
	/**
	 *  Use this method and the mySonar object to avoid objects and drive around the room
	 * You should stay about 8-12 inches away from the objects
	 * and use the mySonar.getDistance() method to calculate that.
	 * 
	 */
	public void driveAroundRoom() 
	{
	}
	
	
	public void drawShape(int vertexCount, int length)
	{
		int angle = calculateAngle(vertexCount);
		
		for(int drawCount = 0; drawCount < vertexCount; drawCount++)
		{
			try
			{
				Motor.A.forward();
				Motor.B.forward();
				Thread.sleep(length* 1000);
				Motor.A.stop();
				Motor.B.stop();
				Motor.A.rotate(-angle);
				Motor.B.rotate(angle);
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}
		
	private int calculateAngle(int vertexCount)
	{
		int currentAngle = (int) 0.000;
		
		if(vertexCount != 0)
		{
			currentAngle = (int) (360.00/vertexCount);
		}
		
		return currentAngle;
		}

	public TouchSensor getFrontTouch() {
		return frontTouch;
	}

	public void setFrontTouch(TouchSensor frontTouch) {
		this.frontTouch = frontTouch;
	}

	public SoundSensor getMicrophone() {
		return microphone;
	}

	public void setMicrophone(SoundSensor microphone) {
		this.microphone = microphone;
	}

	public TouchSensor getBackTouch() {
		return backTouch;
	}

	public void setBackTouch(TouchSensor backTouch) {
		this.backTouch = backTouch;
	}

	public UltrasonicSensor getMySonar() {
		return mySonar;
	}

	public void setMySonar(UltrasonicSensor mySonar) {
		this.mySonar = mySonar;
	}
	}






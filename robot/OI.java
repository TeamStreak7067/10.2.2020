/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;    //may the force be with you, young programmer

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.AlighnByVision;
import frc.robot.commands.AutonomousCommand;
import frc.robot.commands.ClimbCommand;
//import frc.robot.commands.Level2ColorCommand;
import frc.robot.commands.TalonShootingTest;
//import frc.robot.commands.limeLightCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */ 
public class OI {

  public static final double DeadZone = 0.15;
  
  Joystick DriveJoystick = new Joystick(RobotMap.joystick.value);
  Joystick SecondJoystick = new Joystick(RobotMap.secondJoystick.value);

  JoystickButton elevatorButton = new JoystickButton(SecondJoystick, 4);
  JoystickButton talonButton = new JoystickButton(DriveJoystick, 3);
  JoystickButton limeLightCommand = new JoystickButton(SecondJoystick, 1);
  JoystickButton elevatorButtonLow = new JoystickButton(SecondJoystick, 2);
  JoystickButton level2Button = new JoystickButton(DriveJoystick, 1);
  JoystickButton level1Button = new JoystickButton(DriveJoystick, 2);
  

  public OI(){
   // level2Button.whileHeld(new Level2ColorCommand());
  // limeLightCommand.whileHeld(new limeLightCommand());
    talonButton.whileHeld(new AlighnByVision());
  }


  public double getY() {
		if (Math.abs(DriveJoystick.getY()) < DeadZone) 
		{
			return 0.0;
		} 
		else 
		{
			return DriveJoystick.getY();
		}
	}
	
	public double getZ() {
		if (Math.abs(DriveJoystick.getZ()) < DeadZone) 
		{
			return 0.0;
		} 
		else 
		{
			return DriveJoystick.getZ();
		}
	}


  public Joystick getJoystick() {
		return DriveJoystick;
	}
	public Joystick getSecondJoystick(){
		return SecondJoystick;
	}
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}

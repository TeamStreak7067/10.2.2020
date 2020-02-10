/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;    //may the force be with you, young programmer

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/*
public class Level1ColorCommand extends Command {       //add- works only if FMS says we finished the first level
  public Level1ColorCommand() {
    requires(Robot.colorSensorSystem);
    Boolean TimeOut;
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {                  //activating motor until sees startColor 7 times
    String startColor = getSensorColor(); 
    Robot.colorSensorSystem.SetSpeed(1);      //need to find the real command and limit with time/rottation
int i=0;
    while (i<7)                 //option 1
    {
Robot.colorSensorSystem.SetSpeed(1);
      if(startColor.equals(getSensorColor()))
      {
        i++;
        setTimeout(2);  //while the motor keeps going(?)
if(isTimedOut())
System.out.println(" ");
      }
    }

          

    for ( i = 0; i < 7; i++)     //option 2
    {
      while (!startColor.equals(getSensorColor()))
      {
        Robot.colorSensorSystem.SetSpeed(1);
      }  
      System.out.println(i);
     Robot.colorSensorSystem.SetSpeed(1);
  
    }
   



  }

  private String getSensorColor() {
    return null;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    System.out.println("end");
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
*/
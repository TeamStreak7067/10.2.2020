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
public class Level2ColorCommand extends Command {                      //add- works only if FMS says we finished the 2nd level
  public Level2ColorCommand() {
    requires(Robot.colorSensorSystem);
    Boolean TimeOut;
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
setTimeout(1);
if(isTimedOut())
System.out.println(" ");
   final String FMSColor = "green"; // need to find the real command
   if (FMSColor.equals("blue"))                          //if get from FMS blue, activating motor until sees red (blue-2)
   {
     while(!Robot.colorSensorSystem.getSensorColor().equals("red"))
     {
    Robot.colorSensorSystem.SetSpeed(1);      //need to find the real command and limit with time/rottation
     }
   }
  else if (FMSColor.equals("yellow"))                    //if get from FMS yellow, activating motor until sees green (yellow-2)
   {
     while(!Robot.colorSensorSystem.getSensorColor().equals("green"))
     {
       Robot.colorSensorSystem.SetSpeed(1);  
     }
   }
   else if (FMSColor.equals("red"))                   //if get from FMS red, activating motor until sees blue (red-2)
   {
     while(!Robot.colorSensorSystem.getSensorColor().equals("blue"))
     {
       Robot.colorSensorSystem.SetSpeed(1);     
    }
   }
   else if (FMSColor.equals("green"))                      //if get from FMS green, activating motor until sees yellow (green-2)
   {
     while(!Robot.colorSensorSystem.getSensorColor().equals("yellow"))
     {
       Robot.colorSensorSystem.SetSpeed(1);  
         }
   }
   else
       System.out.println("damn"); 
   
   
       
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
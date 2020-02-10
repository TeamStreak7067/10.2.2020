/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;    //may the force be with you, young programmer

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/*
public class limeLightCommand extends Command {
  public boolean s1;
  public boolean s2;
  
  public limeLightCommand() {
    requires(Robot.driveBase);
  
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
  
  NetworkTableEntry tx = table.getEntry("tx");
  NetworkTableEntry ty = table.getEntry("ty");
  NetworkTableEntry ta = table.getEntry("ta");

  //read values periodically
  double x = tx.getDouble(0.0);
  double y = ty.getDouble(0.0);
  double area = ta.getDouble(0.0);


  
  if(x > 5){
    Robot.driveBase.ArcadeDrive(-0.2, 0.32);
  }
  else if(x<-5){ 
    Robot.driveBase.ArcadeDrive(-0.2, -0.32);
  }
  else if(x<5 && x>-5){
    setTimeout(2);
    if(isTimedOut()){ 
      Robot.hatchBase.setSpeed(0.5);
      
    }
  }
  else{
    Robot.driveBase.ArcadeDrive(0, 0);
    Robot.hatchBase.setSpeed(0);
  }




  
  
    


  /* 
 if (x > 6)
  {
    Robot.driveBase.ArcadeDrive(0.2, 0.32);
  }
  else if (-20 <x && x < 5)
  {
    Robot.driveBase.ArcadeDrive(0.2, -0.32);
  
  }
  else if(x <-15){
    Robot.driveBase.ArcadeDrive(0.4, 0);
  }
  else
  {
    Robot.driveBase.ArcadeDrive(0.4, 0);
  }
  }
*/
/* //
}
  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.driveBase.ArcadeDrive(0, 0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
*/
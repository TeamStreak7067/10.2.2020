/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;    //may the force be with you, young programmer

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class driveCommand extends Command {
  public driveCommand() {
    requires(Robot.driveBase);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time9
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() { 
    if (Math.abs(Robot.oi.getJoystick().getRawAxis(1)) > 0.2 || Math.abs(Robot.oi.getJoystick().getRawAxis(2)) > 0.2){
      Robot.driveBase.ArcadeDrive(-Robot.oi.getJoystick().getRawAxis(1)*0.65, Robot.oi.getJoystick().getRawAxis(2)*0.4);
    }else if((Math.abs(Robot.oi.getJoystick().getRawAxis(1)) > 0.2 || Math.abs(Robot.oi.getJoystick().getRawAxis(2)) > 0.2)&& Robot.oi.getJoystick().getRawButton(7)){
      Robot.driveBase.ArcadeDrive(-Robot.oi.getJoystick().getRawAxis(1)*0.1, Robot.oi.getJoystick().getRawAxis(2)*0.1);
    }
  
	else{
  Robot.driveBase.ArcadeDrive(0, 0);
}

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

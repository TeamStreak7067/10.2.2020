/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ClimbCommand extends Command {
  public ClimbCommand() {
    requires(Robot.ClimbSubSystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  if (Robot.oi.getSecondJoystick().getRawButtonPressed(1)){
    Robot.ClimbSubSystem.ClimbPistol(true);
  }
  else if (Robot.oi.getSecondJoystick().getRawButtonPressed(1)){
    Robot.ClimbSubSystem.ClimbPistol(false);
  }
   Robot.ClimbSubSystem.SetSpeed(Robot.oi.getSecondJoystick().getRawAxis(1),Robot.oi.getSecondJoystick().getRawAxis(1));
}

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.ClimbSubSystem.SetSpeed(0, 0);
    Robot.ClimbSubSystem.resetEncoder1();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}

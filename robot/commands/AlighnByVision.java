/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;    //may the force be with you, young programmer

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

public class AlighnByVision extends Command {
  public AlighnByVision() {
    requires(Robot.driveBase);
    
    SmartDashboard.setDefaultNumber("P", 0);
    SmartDashboard.setDefaultNumber("I", 0);
    SmartDashboard.setDefaultNumber("D", 0);
    SmartDashboard.setDefaultNumber("Amount", 0);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    Robot.driveBase.disable();
    Robot.driveBase.setAbsoluteTolerance(2.5);
    double p = SmartDashboard.getNumber("P", 0);
    double i = SmartDashboard.getNumber("I", 0);
    double d = SmartDashboard.getNumber("D", 0);
    double amount = SmartDashboard.getNumber("Amount", 0);
    Robot.driveBase.setSetpoint(amount);
    Robot.driveBase.setOutputRange(-0.5 , 0.5);
    Robot.driveBase.getPIDController().setPID(p, i, d);
    Robot.driveBase.enable();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    System.out.println(Robot.pid_shooter_system.getPIDController().get());
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Robot.driveBase.onTarget();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.driveBase.disable();
    Robot.driveBase.ArcadeDrive(0,0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}

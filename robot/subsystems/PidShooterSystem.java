/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;    //may the force be with you, young programmer

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import frc.robot.RobotMap;
//import frc.robot.commands.TalonShootingTest;

/**
 * Add your docs here.
 */

public class PidShooterSystem extends PIDSubsystem {
  WPI_TalonSRX talonShooter;
  double kp, kd, ki;

  public PidShooterSystem(){
    super(0,0,0);
    talonShooter = new WPI_TalonSRX(RobotMap.talonShooter.value);
    this.kp = 0.0;
    this.kd = 0.0;
    this.ki = 0.0;
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public double getTalonPosition()
  {
    return this.talonShooter.getSelectedSensorPosition();
  }

  public void setTalonSpeed(double speed)
  {
    this.talonShooter.set(speed);
  }

  @Override
  protected double returnPIDInput() {
    // Return your input value for the PID loop
    // e.g. a sensor, like a potentiometer:
    // yourPot.getAverageVoltage() / kYourMaxVoltage;
    return this.getTalonPosition();
  }

  @Override
  protected void usePIDOutput(double output) {
    this.talonShooter.set(-output);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

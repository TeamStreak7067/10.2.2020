/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ClimbCommand;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

/**
 * Add your docs here.
 */
public class ClimbSystem extends Subsystem {
  public DoubleSolenoid lockClimbe;
  public WPI_TalonFX ClimbUp;
  public WPI_TalonFX ClimbUp2;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

public ClimbSystem(){
  lockClimbe = new DoubleSolenoid(2, 3);
  lockClimbe.set(Value.kReverse);
  ClimbUp = new WPI_TalonFX(RobotMap.FalconClimbMotor1.value);
  ClimbUp2 = new WPI_TalonFX(RobotMap.FalconClimbMotor2.value);
}

public void SetSpeed(double UpSide, double UpSide2){
  ClimbUp.set(UpSide);
  ClimbUp2.set(UpSide2);
}
public void ClimbPistol(boolean open) {
  if(open){
    lockClimbe.set(Value.kForward);
  } else {
    lockClimbe.set(Value.kReverse);
  }

}
public double getposition(){
return ClimbUp2.getSelectedSensorPosition();
}
public void resetEncoder1(){
  this.ClimbUp2.setSelectedSensorPosition(0, 0, 100);
}
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ClimbCommand());
  }
}

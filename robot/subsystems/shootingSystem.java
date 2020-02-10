/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;



/**
 * Add your docs here.
 */
public class shootingSystem extends Subsystem {
  public WPI_TalonFX falcon1;
  public WPI_TalonFX falcon2;

  public double Ymax;
  private NetworkTable table;

  public shootingSystem(){
    this.Ymax=20.0;
    this.table = NetworkTableInstance.getDefault().getTable("limelight");

    falcon1= new WPI_TalonFX(RobotMap.FalconShootMotor.value);
    falcon2= new WPI_TalonFX(RobotMap.FalconShootMotor2.value);
  }

  public void setSpeed(double falcon1,double falcon2){
    this.falcon1.set(falcon1);
    this.falcon2.set(falcon2);


  }

  public double retinpercents(double ycurrent){
    return ycurrent/Ymax;
  }

  public double retDistance(){
    System.out.println(this.table.getEntry("ty").getDouble(0.0));
    return this.table.getEntry("ty").getDouble(0.0);
  }

  
    // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;    //may the force be with you, young programmer
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.driveCommand;

/**
 * Add your docs here.
 */
public class driveSystem extends PIDSubsystem {
  private CANSparkMax sparkRightf;
  private CANSparkMax sparkRightb;
  private CANSparkMax sparkLeftf;
  private CANSparkMax sparkLeftb;
  private NetworkTable table;


 // private CANEncoder sparkRightfEncoder;

  private SpeedControllerGroup leftController,rightController;
  private DifferentialDrive drive;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public driveSystem(){
    super(0.12, 0.0, 0.0, 0.0);

    this.table = NetworkTableInstance.getDefault().getTable("limelight");
   /* 
    sparkRightf = new Spark(RobotMap.sparkRightF.value);
    sparkRightb = new Spark(RobotMap.sparkRightB.value);

    sparkLeftf = new Spark(RobotMap.sparkLeftF.value);
    sparkLeftb = new Spark(RobotMap.sparkLeftB.value);
*/
  
    sparkRightf = new CANSparkMax(RobotMap.sparkRightF.value, MotorType.kBrushless);
    sparkRightb = new CANSparkMax(RobotMap.sparkRightB.value, MotorType.kBrushless);

    sparkLeftf = new CANSparkMax(RobotMap.sparkLeftF.value, MotorType.kBrushless);
    sparkLeftb = new CANSparkMax(RobotMap.sparkLeftB.value, MotorType.kBrushless);

    //sparkRightfEncoder = sparkRightf.getEncoder(); 

    rightController = new SpeedControllerGroup(sparkRightf, sparkRightb);
    leftController = new SpeedControllerGroup(sparkLeftf, sparkLeftb);
    drive = new DifferentialDrive(sparkRightf, sparkLeftf);

  }

  @Override
  protected double returnPIDInput() {
    // Return your input value for the PID loop
    // e.g. a sensor, like a potentiometer:
    // yourPot.getAverageVoltage() / kYourMaxVoltage;
    System.out.println(this.table.getEntry("tx").getDouble(0.0));
    return this.table.getEntry("tx").getDouble(0.0);
  }

  @Override
  protected void usePIDOutput(double output) {
    this.ArcadeDrive(0.0, output);
  }


  public void setSpeed(double leftSide,double rightSide) {
    sparkRightf.set(-rightSide);
    sparkRightb.set(-rightSide);
    sparkLeftf.set(leftSide);
    sparkLeftb.set(leftSide);
  }

  public void ArcadeDrive(double speed, double rotation){
    this.drive.arcadeDrive(-speed, rotation);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new driveCommand());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

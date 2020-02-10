/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;    //may the force be with you, young programmer

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.intakeCommand;
 
/**
 * Add your docs here.
 */

 
public class CollectorSystem extends Subsystem {
  public WPI_VictorSPX collector;
  public WPI_VictorSPX tunnel1;

  DoubleSolenoid s;
  
  public CollectorSystem(){
    this.collector=new WPI_VictorSPX(RobotMap.victorCollector.value);
    this.tunnel1=new WPI_VictorSPX(RobotMap.victorTunnel.value);
    s = new DoubleSolenoid(0, 1);
    s.set(Value.kReverse);
  }


  public void setSpeed(double speed1, double speed2){
    collector.set(speed1);
    tunnel1.set(speed2);
  }
 

  public void collectPistol(boolean open) {
    if(open){
      s.set(Value.kForward);
    } else {
      s.set(Value.kReverse);
    }

  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new intakeCommand());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

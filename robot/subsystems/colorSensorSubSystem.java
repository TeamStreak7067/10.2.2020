/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;    //may the force be with you, young programmer

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.util.Color;
//import frc.robot.commands.Level2ColorCommand;
import edu.wpi.first.wpilibj.Timer;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
/*import com.revrobotics.ColorSensorV3;
 
/**
 * Add your docs here.
 */

 /*
public class colorSensorSubSystem extends Subsystem {

public String getSensorColor()                     //setting colors values
{
   String color = " ";

  if ((greenValue>=0.3 && greenValue<=0.45) && (blueValue>=0.1 && blueValue<=0.23)&& (redValue>=0.35 && redValue<=0.55))
  {
    color="red";
  }
  if ((greenValue>=0.5 && greenValue<=0.62) && (blueValue>=0.23 && blueValue<=0.27)&& (redValue>=0.14 && redValue<=0.25))
  {
    color="green";
  }
  if ((greenValue>=0.4 && greenValue<=0.499) && (blueValue>=0.29 && blueValue<=0.5)&& (redValue>=0.09 && redValue<=0.21))
  {
    color="blue";
  }
  if ((greenValue>=0.52 && greenValue<=0.58) && (blueValue>=0.11 && blueValue<=0.2)&& (redValue>=0.28 && redValue<=0.33))
  {
    color="yellow";
  }

  
  //if(color==" ")
  //System.out.println("");                               //buggedr debugger
  //if(color==" ")
  //System.out.println("fucking EROR!");
  
  //else
  System.out.println(color);
  return color;

}

  //double IR = colorSensor.getIR();
  private final I2C.Port i2cPort = I2C.Port.kOnboard;

  private final  ColorSensorV3 colorSensor = new ColorSensorV3(i2cPort);
  
  int proximity = colorSensor.getProximity();
  public Color detectedColor = colorSensor.getColor();
    
 
  double blueValue=detectedColor.blue;
  double greenValue=detectedColor.green;
  double redValue=detectedColor.red;


  public WPI_TalonSRX controlPannelMotor;
  

//  SmartDashboard.putNumber("Proximity", proximity);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
//setDefaultCommand(new Level2ColorCommand());    
  
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
*/
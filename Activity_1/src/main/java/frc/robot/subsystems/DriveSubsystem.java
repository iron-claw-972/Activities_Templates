/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Encoder;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.kauailabs.navx.frc.AHRS;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {

  //TODO: 1. Set the motor to the right type (Talon, CAN, etc.).
  // See https://github.com/iron-claw-972/HowToProgramming for how to do this. 
  // Make sure to set the right amount of motors! (if you only have 2 motors don't make 4)

  CANSparkMax leftMotor1 = new CANSparkMax(1, MotorType.kBrushless);
  CANSparkMax leftMotor2 = new CANSparkMax(2, MotorType.kBrushless);
  
  CANSparkMax rightMotor1 = new CANSparkMax(3, MotorType.kBrushless);
  CANSparkMax rightMotor2 = new CANSparkMax(4, MotorType.kBrushless);
  //Encoder LEncoder = new Encoder(0,1);
  //zEncoder REncoder = new Encoder(2,3);
  


  //how to set up sparkmaxes, if your robot has those
  // CANSparkMax leftMotor1 = new CANSparkMax(DriveConstants.kLeftMotor1Port, MotorType.kBrushless);
  // CANSparkMax leftMotor2 = new CANSparkMax(DriveConstants.kLeftMotor2Port, MotorType.kBrushless);

  // CANSparkMax rightMotor1 = new CANSparkMax(DriveConstants.kRightMotor1Port, MotorType.kBrushless);
  // CANSparkMax rightMotor2 = new CANSparkMax(DriveConstants.kRightMotor2Port, MotorType.kBrushless);
  
  /**
   * Creates a new DriveSubsystem.
   */
  public DriveSubsystem() {
    //TODO: 1. if you have multiple motors per side, you should have one main motor that the others "follow"
    // however if you have 1 motor per side, then remove these
    //leftMotor2.set(ControlMode.Follower, DriveConstants.kLeftMotor1Port);
    //rightMotor2.set(ControlMode.Follower, DriveConstants.kRightMotor1Port);
    leftMotor2.follow(leftMotor1);
    rightMotor2.follow(rightMotor1);
    //how to follow motors with sparkmaxes
    // leftMotor2.follow(leftMotor1);
    // rightMotor2.follow(rightMotor1);

    //TODO: 1. Your robot may need to have the right motors inverted and not the left
    leftMotor1.setInverted(true);
    leftMotor2.setInverted(true);
  
  }


  /**
   * Drives the robot using tank drive controls
   * Tank drive is slightly easier to code but less intuitive to control, so this is here as an example for now
   * @param leftPower the commanded power to the left motors
   * @param rightPower the commanded power to the right motors
   */

  public void tankDrive(double leftPower, double rightPower) {
    leftMotor1.set(leftPower);
    rightMotor1.set(rightPower);

    //if using a sparkmax
    // leftMotor1.set(leftPower);
    // rightMotor1.set(rightPower);
  }
  /**
   * Drives the robot husing arcade controls.
   *
   * @param forward the commanded forward movement
   * @param turn the commanded turn rotation
   */
  public void arcadeDrive(double lTrigger, double rTrigger, double turn) {
    leftMotor1.set((lTrigger - rTrigger) - turn);
    rightMotor1.set((lTrigger - rTrigger) + turn);
    //System.out.println("R: " + LEncoder.getDistance() + " L: " + REncoder.getDistance());
  }
  

}


package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {
    TalonSRX leftMotor1 = new TalonSRX(DriveConstants.kLeftMotor1Port);
    TalonSRX leftMotor2 = new TalonSRX(DriveConstants.kLeftMotor1Port);
    TalonSRX leftMotor3 = new TalonSRX(DriveConstants.kLeftMotor1Port);
    TalonSRX rightMotor1 = new TalonSRX(DriveConstants.kRightMotor1Port);
    TalonSRX rightMotor2 = new TalonSRX(DriveConstants.kRightMotor1Port);
    TalonSRX rightMotor3 = new TalonSRX(DriveConstants.kRightMotor1Port);



//public void tankDrive(double leftPower, double rightPower) {
    //leftMotor1.set(ControlMode.PercentOutput, leftPower);
    //leftMotor2.set(ControlMode.PercentOutput, leftPower);
    //leftMotor3.set(ControlMode.PercentOutput, leftPower);
    //rightMotor1.set(ControlMode.PercentOutput, rightPower);
    //rightMotor2.set(ControlMode.PercentOutput, rightPower);
    //rightMotor3.set(ControlMode.PercentOutput, rightPower);

  
 // }


public DriveSubsystem(){
    leftMotor2.set(ControlCode.Follower, DriveConstants.kLeftMotor1Port);
    leftMotor3.set(ControlCode.Follower, DriveConstants.kLeftMotor1Port);
    rightMotor2.set(ControlCode.Follower, DriveConstants.kLeftMotor1Port);
    rightMotor3.set(ControlCode.Follower, DriveConstants.kLeftMotor1Port);
}
public void arcadeDrive(double throttle, double turn) {
    leftMotor1.set(ControlMode.PercentOutput, throttle + turn);
    rightMotor1.set(ControlMode.PercentOutput, throttle - turn);
  }

}


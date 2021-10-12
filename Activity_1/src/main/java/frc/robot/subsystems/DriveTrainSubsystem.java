package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.DriveConstants;

public class DriveTrainSubsystem extends SubsystemBase {
    TalonSRX leftMotor1 = new TalonSRX(DriveConstants.kLeftMotor1Port);
    TalonSRX leftMotor2 = new TalonSRX(DriveConstants.kLeftMotor2Port);
    TalonSRX leftMotor3 = new TalonSRX(DriveConstants.kLeftMotor3Port);
    TalonSRX rightMotor1 = new TalonSRX(DriveConstants.kRightMotor1Port);
    TalonSRX rightMotor2 = new TalonSRX(DriveConstants.kRightMotor2Port);
    TalonSRX rightMotor3 = new TalonSRX(DriveConstants.kRightMotor3Port);

    private double powerModifier = 1;


    public DriveTrainSubsystem(){
        leftMotor2.set(ControlMode.Follower, DriveConstants.kLeftMotor1Port);
        leftMotor3.set(ControlMode.Follower, DriveConstants.kLeftMotor1Port);
        rightMotor2.set(ControlMode.Follower, DriveConstants.kLeftMotor1Port);
        rightMotor3.set(ControlMode.Follower, DriveConstants.kLeftMotor1Port);
    
    
    }


    public void reducePower(){
        powerModifier = 0.5;
    }

    public void powerBack(){
        powerModifier = 1;
    }

    public void speedy(){
        powerModifier= 5;
    }

    public void arcadeDrive(double throttle, double turn) {
        leftMotor1.set(ControlMode.PercentOutput, (throttle + turn)*powerModifier);
        rightMotor1.set(ControlMode.PercentOutput, (throttle - turn)*powerModifier);
    }

}


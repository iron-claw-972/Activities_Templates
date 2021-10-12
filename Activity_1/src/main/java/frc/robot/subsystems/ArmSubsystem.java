package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.DriveConstants;

public class ArmSubsystem extends SubsystemBase {
    TalonSRX LeftArmMotor1 = new TalonSRX(DriveConstants.kLeftArmMotorPort);
    TalonSRX RightArmMotor1 = new TalonSRX(DriveConstants.kRightArmMotorPort);
    TalonSRX LeftIntakeMotor2 = new TalonSRX(DriveConstants.kLeftIntakeMotorPort);
    TalonSRX RightIntakeMotor2 = new TalonSRX(DriveConstants.kRightIntakeMotorPort);
    
    public ArmSubsystem() {
        RightIntakeMotor2.set(ControlMode.Follower, DriveConstants.kLeftIntakeMotorPort);
        RightArmMotor1.set(ControlMode.Follower, DriveConstants.kLeftArmMotorPort);
    
    }

    public void tankDrive(double leftPower, double rightPower) {
        leftMotor1.set(ControlMode.PercentOutput, leftPower);
        rightMotor1.set(ControlMode.PercentOutput, rightPower);
        leftMotor2.set(ControlMode.PercentOutput, leftPower);
        rightMotor2.set(ControlMode.PercentOutput, rightPower);
    }
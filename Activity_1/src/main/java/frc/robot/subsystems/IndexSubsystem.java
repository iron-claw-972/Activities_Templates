/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.DriveConstants;

double indexSpeed = 0;

public class IndexSubsystem extends SubsystemBase {

    
    CANSparkMax indexMotor = new CANSparkMax(DriveConstants.kIndexerMotorPort, MotorType.kBrushless);

    public void toggleIndexRot() {
        // if (index speed == 0){

        // }
        indexMotor.set(indexSpeed);
    }
//   public DriveSubsystem() {
//     leftMotor2.set(ControlMode.Follower, DriveConstants.kLeftMotor1Port);
//     rightMotor2.set(ControlMode.Follower, DriveConstants.kRightMotor1Port);
//     leftMotor1.setInverted(false);
//   }
//   public void arcadeDrive(double turn, double throttle) {
//     //TODO: 2. Add arcade drive here by setting the motors
//     leftMotor1.set(ControlMode.PercentOutput, (throttle - turn) / sensitivity);
//     rightMotor1.set(ControlMode.PercentOutput, (throttle + turn) / sensitivity);
//   }
}

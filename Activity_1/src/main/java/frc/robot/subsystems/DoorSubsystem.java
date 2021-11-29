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

public class DoorSubsystem extends SubsystemBase {

  TalonSRX motor3 = new TalonSRX(8);

  public void doorSpin() {
    motor3.setInverted(false);
    motor3.set(ControlMode.PercentOutput, 0.05);
  }

  public void doorReverse() {
    motor3.setInverted(true);
    motor3.set(ControlMode.PercentOutput, 0.05);
  }

  public void doorStop(){
    motor3.set(ControlMode.PercentOutput, 0);
  }
}
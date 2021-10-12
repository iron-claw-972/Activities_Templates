// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Compressor;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.kForward;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.kReverse;

import frc.robot.Constants.IntakeConstants;

public class IntakeSubsystem extends SubsystemBase {

  private final DoubleSolenoid m_intakeSolenoid =
      new DoubleSolenoid(IntakeConstants.kIntakeSolenoidModule, IntakeConstants.kIntakeSolenoidPorts[0],
                         IntakeConstants.kIntakeSolenoidPorts[1]);

  private final Compressor m_robotCompressor = new Compressor(17);

  /** Creates a new IntakeSubsystem. */
  public IntakeSubsystem() {

    m_robotCompressor.setClosedLoopControl(true);

  }

  public void extendIntake() {
    m_intakeSolenoid.set(DoubleSolenoid.Value.kForward);
  }

  public void retractIntake() {
    m_intakeSolenoid.set(DoubleSolenoid.Value.kReverse);
  }

  public void toggle() {
    // Called when the button was released since last check
			if(m_intakeSolenoid.get().equals(kForward)) {
				  m_intakeSolenoid.set(kReverse);
      } else if(m_intakeSolenoid.get().equals(kReverse)) {
				  m_intakeSolenoid.set(kForward);
			}
  }
}

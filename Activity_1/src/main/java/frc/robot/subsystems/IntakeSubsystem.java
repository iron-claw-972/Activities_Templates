// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.kForward;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.kReverse;

public class IntakeSubsystem extends SubsystemBase {

  private final DoubleSolenoid m_intakeSolenoid =
      new DoubleSolenoid(HatchConstants.kIntakeSolenoidModule, IntakeConstants.kIntakeSolenoidPorts[0],
                         IntakeConstants.kIntakeSolenoidPorts[1]);

  /** Creates a new IntakeSubsystem. */
  public IntakeSubsystem() {}

  public void extendIntake() {
    m_intakeSolenoid.set(IntakeConstants.kForward);
  }

  public void retractIntake() {
    m_intakeSolenoid.set(IntakeConstants.kReverse);
  }

  public void toggle() {
    // Called when the button was released since last check
			if(m_intakeSolenoid.get().equals(kForward)) {
				  m_intakeSolenoid.set(kReverse);
      } else if(m_intakeSolenoid.get().equals(kReverse)) {
				  m_intakeSolenoid.set(kForward);
			}
    // This method will be called once per scheduler run
  }
}

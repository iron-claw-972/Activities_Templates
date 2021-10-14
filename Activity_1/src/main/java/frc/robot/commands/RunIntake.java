package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.RobotContainer;
import frc.robot.Constants.DriveConstants;

public class RunIntake extends CommandBase {
  private final ArmSubsystem m_arm;
  private final double m_power;

  public RunIntake (ArmSubsystem arm, double power) {
    m_arm = arm;
    addRequirements(m_arm);
    m_power = power;
  }

  //Override
  public void initialize () {
    m_arm.run(m_power);
  }

  //override
  public void end(boolean interrupted) {
    m_arm.run(0);
  }
}

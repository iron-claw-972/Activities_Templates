package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.RobotContainer;
import frc.robot.Constants.DriveConstants;

public class RunPIDIntake extends CommandBase {
  private final ArmSubsystem m_arm;
  private final double m_setpoint;
  

  public RunPIDIntake (ArmSubsystem arm, double setpoint) {
    m_arm = arm;
    addRequirements(m_arm);
    m_setpoint = setpoint;
  }

  @Override
  public void execute()
  {
    m_arm.runPID(m_setpoint);
  }
}

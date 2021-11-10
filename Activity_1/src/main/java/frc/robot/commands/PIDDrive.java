package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.RobotContainer;
import frc.robot.Constants.DriveConstants;
import frc.robot.subsystems.ArmSubsystem;

public class PIDDrive extends CommandBase {
    private final DriveSubsystem m_drive;
    private final double m_setpoint;

public PIDDrive (DriveSubsystem arm, double setpoint) {
    addRequirements(m_drive);
    m_setpoint = setpoint;
  }

  @Override
  public void execute()
  {
      m_drive.runPID(m_setpoint);
  }
}
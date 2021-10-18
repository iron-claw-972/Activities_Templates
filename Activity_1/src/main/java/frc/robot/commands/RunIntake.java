
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.RobotContainer;
import frc.robot.Constants.DriveConstants;

public class RunIntake extends CommandBase {
  private final ArmSubsystem m_arm;
  private final double m_power;


  public RunIntake(ArmSubsystem arm, double power) {
    m_arm = arm;
    m_power = power;
    addRequirements(m_arm);
  }
  
  @Override
  public void initialize() {
    m_arm.run(m_power);
  }

  @Override
  public void end(boolean interrupted) {
    m_arm.run(0);
   
    talon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 100);
  }  
}
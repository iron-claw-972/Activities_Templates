package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.RobotContainer;
import frc.robot.Constants.DriveConstants;

public class RunPIDIntake extends CommandBase {
  private final ArmSubsystem m_arm;
  private final double m_setpoint;
  double integral = 0;
  double lastX = 0;
  double deriv = 0;
  double error = 0;
  double setpoint = 0;

  public RunPIDIntake (ArmSubsystem arm, double setpoint) {
    m_arm = arm;
    addRequirements(m_arm);
    m_setpoint = setpoint;
  }

  public double PIDControl(double x, double goal) {
    double p = .001; //change later
    double i = 0; //change later
    double d = 0; //change later

    error = goal - x;
    integral = integral + error;
    deriv = x - lastX;
    lastX = x;

    return ((error * p) + (integral * i) - (deriv * d));
  }

  @Override
  public void execute() {
    m_arm.run(PIDControl(m_arm.getPosition(), m_setpoint));
  }
}

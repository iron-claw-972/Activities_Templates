package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.DriveConstants;

public class ElevatorDrive extends CommandBase {
    private final ElevatorSubsystem elev_drive;

    public ElevatorDrive(ElevatorSubsystem subsystem) {
      elev_drive = subsystem;
      addRequirements(elev_drive);
    }
  
    @Override
    public void execute() {
      elev_drive.run(0.5);
      }

    @Override
    public void end(){
        elev_drive.run(0.0);
    }
  }
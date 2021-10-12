package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.*;

public class ElevatorSubsystem extends SubsystemBase{
    TalonSRX leftMotor1 = new TalonSRX(ElevatorConstants.kElevatorLeftMotor);
    TalonSRX rightMotor1 = new TalonSRX(ElevatorConstants.kElevatorRightMotor);

    public ElevatorSubsystem(){
        leftMotor1.setInverted(true);
    }

    public void run (double throttle){
        leftMotor1.set(ControlMode.PercentOutput, throttle);
        rightMotor1.set(ControlMode.PercentOutput, throttle);
    }
}
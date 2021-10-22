package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.ArmConstants;

public class ArmSubsystem extends SubsystemBase {
    TalonSRX leftArmMotor1 = new TalonSRX(ArmConstants.kLeftArmMotorPort);
    TalonSRX rightArmMotor1 = new TalonSRX(ArmConstants.kRightArmMotorPort);
    TalonSRX leftIntakeMotor2 = new TalonSRX(ArmConstants.kLeftIntakeMotorPort);
    TalonSRX rightIntakeMotor2 = new TalonSRX(ArmConstants.kRightIntakeMotorPort);
    PIDController pid = new PIDController(1, 0, 0);

    public ArmSubsystem() {
        leftArmMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 100);

        rightIntakeMotor2.set(ControlMode.Follower, ArmConstants.kLeftIntakeMotorPort);
        rightArmMotor1.set(ControlMode.Follower, ArmConstants.kLeftArmMotorPort);
    }

    public void run(double armPower) {
        leftArmMotor1.set(ControlMode.PercentOutput, armPower);
        leftIntakeMotor2.set(ControlMode.PercentOutput, armPower);
    }

    public void runPID(double setpoint) {
        double currentPosition = leftArmMotor.getSensorCollection().getQuadraturePosition();
        leftArmMotor1.set(ControlMode.PercentOutput, pid.calculate(currentPosition, setpoint));
        leftIntakeMotor2.set(ControlMode.PercentOutput, 10);
    }
}
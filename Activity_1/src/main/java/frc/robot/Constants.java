/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class DriveConstants {
    //TODO: 1. Set this to the motor ports
    

    //make sure your controller is 0
    public static final int kControllerPort = 0;
    public static final int kRightMotorPort = 0;
    public static final int kLeftMotorPort = 0;
    //TODO: 1. Set the joystick axis
    public static final int kLeftJoyAxis = 1;
    public static final int kRightJoyAxis = 5;
  }

  public static final class ArmConstants {

    public static final int TICKS_PER_ROTATION = 1024;
    public static final int kLeftArmMotorPort = 9;
    public static final int kRightArmMotorPort = 10;
    public static final int kLeftIntakeMotorPort = 11;
    public static final int kRightIntakeMotorPort = 12;
    public static final int kArmMovementDistance = 50;
  }


}
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class DriveConstants {
    public static final int M_L1 = 1;
    public static final int M_L2 = 2;
    public static final int M_R1 = 3;
    public static final int M_R2 = 4;

    public static final int CurrentLimit = 50;
    public static final double ROB_Vol = 12;
    public static final double SLOW_MODE_MOVE = 0.5;
    public static final double SLOW_MODE_TURN = 0.6;
  }

  public static final class RollerConstants {
    public static final int M_RL = 5;
    public static final int CurrentLimit = 50;
    public static final double ROB_Vol = 12;
    public static final double OUTCRL = -.4;
    public static final double INCRL = -0.8;
    public static final double ROLLER_CORAL_STACK = -1;
    public static final double ROLLER_ALGAE_IN = -0.8;
    public static final double ROLLER_ALGAE_OUT = 0.4;
  }

  public static final class ArmConstants {
    public static final int ARM_MOTOR_ID = 6;
    public static final int ARM_MOTOR_CURRENT_LIMIT = 60;
    public static final double ARM_MOTOR_VOLTAGE_COMP = 10;
    public static final double ARM_SPEED_DOWN = 0.4;
    public static final double ARM_SPEED_UP = -0.4;
    public static final double ARM_HOLD_DOWN = 0.1;
    public static final double ARM_HOLD_UP = -0.15;
  }
  
  public static final class ClimberConstants {
    public static final int M_CL = 7;
    public static final int CurrentLimit = 50;
    public static final double ROB_Vol = 12;
    public static final double CLIMBER_SPEED_DOWN = -0.5;
    public static final double CLIMBER_SPEED_UP = 0.5;
  }

  public static final class OperatorConstants {
    public static final int DRIVECON = 0;
    public static final int OPCON = 1;
  }
}
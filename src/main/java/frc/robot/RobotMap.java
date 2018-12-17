/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  
  // ***** Encoder Stuff *****
  public static final int LEFT_ENCODER_PORT_ONE = 0;
  public static final int LEFT_ENCODER_PORT_TWO = 1;
  public static final int RIGHT_ENCODER_PORT_ONE = 2;
  public static final int RIGHT_ENCODER_PORT_TWO = 3;

  public static final int INTAKE_PIVOT_ENCODER_PORT_ONE = 4;
  public static final int INTAKE_PIVOT_ENCODER_PORT_TWO = 5;

  // ***** Limit Switch *****
  public static final int ELEVATOR_LIMIT_SWITCH_PORT = 6;

  // ***** Motor/Speed Controller Ports *****
  public static final int FRONT_LEFT_DRIVE_MOTOR_PORT = 4;
  public static final int REAR_LEFT_DRIVE_MOTOR_PORT = 5;
  public static final int FRONT_RIGHT_DRIVE_MOTOR_PORT = 0;
  public static final int REAR_RIGHT_DRIVE_MOTOR_PORT = 1;

  public static final int CLIMBER_MOTOR_PORT_ONE = 6;
  public static final int CLIMBER_MOTOR_PORT_TWO = 7;

  public static final int INTAKE_LEFT_PORT = 2;
  public static final int INTAKE_RIGHT_PORT = 3;
  public static final int INTAKE_PIVOT_PORT = 8;

  public static final int ELEVATOR_MOTOR_PORT_ONE = 0; // TalonSRX
  public static final int ELEVATOR_MOTOR_PORT_TWO = 1; // TalonSRX

  // ***** Pneumatics Ports *****
  public static final int COMPRESSOR_PORT = 0;

  public static final int SHIFTER_ONE_PORT = 7;
  public static final int SHIFTER_TWO_PORT = 0;

  public static final int INTAKE_SOLENOID_PORT_ONE = 1;
  public static final int INTAKE_SOLENOID_PORT_TWO = 6;
}

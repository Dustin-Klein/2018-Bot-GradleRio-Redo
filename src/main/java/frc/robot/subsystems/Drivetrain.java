/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.ControllerDrive;

/**
 * The wheels and crap that make the robot move and stuff
 */
public class Drivetrain extends Subsystem {

  private static Drivetrain instance;

  private Victor frontLeft;
  private Victor rearLeft;
  private SpeedControllerGroup leftSide;

  private Victor frontRight;
  private Victor rearRight;
  private SpeedControllerGroup rightSide;

  public DifferentialDrive drive;

  private Drivetrain() {
    frontLeft = new Victor(RobotMap.FRONT_LEFT_DRIVE_MOTOR_PORT);
    rearLeft = new Victor(RobotMap.REAR_LEFT_DRIVE_MOTOR_PORT);
    leftSide = new SpeedControllerGroup(frontLeft, rearLeft);

    frontRight = new Victor(RobotMap.FRONT_RIGHT_DRIVE_MOTOR_PORT);
    rearRight = new Victor(RobotMap.REAR_RIGHT_DRIVE_MOTOR_PORT);
    rightSide = new SpeedControllerGroup(frontRight, rearRight);

    drive = new DifferentialDrive(leftSide, rightSide);
    drive.setSafetyEnabled(false);
  }

  public static Drivetrain getInstance() {
    if (instance == null) {
      instance = new Drivetrain();
    }

    return instance;
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ControllerDrive());
  }

  /**
   * System for driving where forward, backward, and rotate are all handled on
   * different inputs.
   * 
   * @param backward Speed given to the motors in the backward direction
   * @param forward  Speed given to the motors in the forward direction
   * @param rotate   speed to turn the robot
   */
  public void worldOfTanksDrive(double backward, double forward, double rotate) {
    double speedModifier = 1;

    backward = backward * speedModifier;
    forward = forward * speedModifier;

    if (backward > 0) {
      drive.arcadeDrive(backward, rotate, true);
    } else if (forward > 0) {
      drive.arcadeDrive(-forward, rotate, true);
    } else {
      drive.arcadeDrive(0, rotate, true);
    }
  }
}

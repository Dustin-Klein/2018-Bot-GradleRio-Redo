/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.Drivetrain;

/**
 * Default command for the {@link Drivetrain} subsytem. Drives the robot
 * based on the operator interface.
 */
public class ControllerDrive extends Command {

  private Drivetrain drivetrain;
  private OI oi;

  public ControllerDrive() {
    drivetrain = Drivetrain.getInstance();
    oi = OI.getInstance();

    requires(drivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double backward = oi.getDriveLeftTrigger();
    double forward = oi.getDriveRightTrigger();
    double rotate = oi.getDriveLeftXAxis();

    drivetrain.worldOfTanksDrive(backward, forward, rotate);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}

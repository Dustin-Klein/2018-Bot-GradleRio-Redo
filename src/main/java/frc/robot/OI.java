/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import frc.robot.util.Constants;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  private static OI instance;

  private static XboxController driveController;
  private static XboxController altController;

  public static OI getInstance() {
    if (instance == null)
      instance = new OI();

    return instance;
  }
 
  private OI() {
    driveController = new XboxController(Constants.DRIVE_CONTROLLER_PORT);
    altController = new XboxController(Constants.ALT_CONTROLLER_PORT);
  }

  public double getDriveRightTrigger() {
    return driveController.getTriggerAxis(Hand.kRight);
  }

  public double getDriveLeftTrigger() {
    return driveController.getTriggerAxis(Hand.kLeft);
  }

  public double getDriveLeftXAxis() {
    return driveController.getX(Hand.kLeft);
  }
}

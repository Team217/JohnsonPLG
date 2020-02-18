/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj2.command.button.*;
import static frc.robot.Constants.*;

public final class OI {
    // Joysticks
    public static final Joystick driver = new Joystick(driverPort);
    public static final Joystick oper = new Joystick(operPort);

    // Buttons
    public static final Button squareOper = new JoystickButton(oper, buttonSquare);
    public static final Button circleOper = new JoystickButton(oper, buttonCircle);
    public static final Button triangleOper = new JoystickButton(oper, buttonTriangle);
    public static final Button xOper = new JoystickButton(oper, buttonX);
    public static final Button leftBumperOper = new JoystickButton(oper, leftBumper);
    public static final Button rightBumperOper = new JoystickButton(oper, rightBumper);
    public static final Button leftTriggerOper = new JoystickButton(oper, leftTrigger);
    public static final Button rightTriggerOper = new JoystickButton(oper, rightTrigger);
    public static final Button leftAnalogOper = new JoystickButton(oper, leftAnalog);

    // Driver Buttons
    public static final Button leftBumperDriver = new JoystickButton(driver, leftBumper);
    public static final Button circleDriver = new JoystickButton(driver, buttonCircle);
    public static final Button triangleDriver = new JoystickButton(driver, buttonTriangle);
    public static final Button squareDriver = new JoystickButton(driver, buttonSquare);
    public static final Button rightBumperDriver = new JoystickButton(driver, rightBumper);
    public static final Button rightTriggerDriver = new JoystickButton(driver, rightTrigger);
    public static final Button leftAnalogDriver = new JoystickButton(driver, leftAnalog);
    public static final Button leftTriggerDriver = new JoystickButton(driver, leftTrigger);
    public static final Button rightAnalogDriver = new JoystickButton(driver, rightAnalog);
    public static final Button touchPadDriver = new JoystickButton(driver, touchPad);
}
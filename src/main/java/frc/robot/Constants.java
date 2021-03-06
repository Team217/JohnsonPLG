/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    // Controllers
    public static final int driverPort = 0;
    public static final int operPort = 1;
    
    // Buttons
    public static final int buttonSquare = 1;
    public static final int buttonX = 2;
    public static final int buttonCircle = 3;
    public static final int buttonTriangle = 4;
    public static final int leftBumper = 5;
    public static final int rightBumper = 6;
    public static final int leftTrigger = 7;
    public static final int rightTrigger = 8;
    public static final int buttonOption = 10;
    public static final int leftAnalog = 11;
    public static final int rightAnalog = 12;
    public static final int touchPad = 14;

    // Axes
    public static final int X_Axis = 0;
    public static final int Y_Axis = 1;
    public static final int Z_Axis = 2;
    public static final int Z_RotateAxis = 5;

    public static final int plg_ID = 9;
    public static final int falconMaster_ID = 1;
    public static final int falconMidSlave_ID = 2;
    public static final int falconBackSlave_ID = 3;

    public static final int plgSensor1_ID = 0;
    public static final int plgSensor2_ID = 1;
}

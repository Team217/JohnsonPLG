/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.auton;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

import static frc.robot.RobotContainer.*;

public class AutonPLG extends CommandBase {
    /**
     * Creates a new TeleopPLG.
     */
    public AutonPLG() {
        // Use addRequirements() here to declare subsystem dependencies.
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        SmartDashboard.setDefaultBoolean("Run PLG", false);
        SmartDashboard.setDefaultNumber("PLG Speed", 0);
        plgEnc.set(0);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        double speed = SmartDashboard.getBoolean("Run PLG", false)
                       ? SmartDashboard.getNumber("PLG Speed", 0)
                       : 0;
        plg.set(speed);
        
        SmartDashboard.putBoolean("Sensor 1", plgEnc.getSensor1Raw());
        SmartDashboard.putBoolean("Sensor 2", plgEnc.getSensor2Raw());
        SmartDashboard.putNumber("Encoder", plgEnc.get());
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        plg.set(0);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}

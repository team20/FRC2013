// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.


package org.usfirst.frc20.Robot;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drivetrainleftForward;
    public static SpeedController drivetrainleftRear;
    public static SpeedController drivetrainrightForward;
    public static SpeedController drivetrainrightRear;
    public static RobotDrive drivetraindrive;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainleftForward = new Talon(1, 1);
	LiveWindow.addActuator("Drivetrain", "leftForward", (Talon) drivetrainleftForward);
        
        drivetrainleftRear = new Talon(1, 2);
	LiveWindow.addActuator("Drivetrain", "leftRear", (Talon) drivetrainleftRear);
        
        drivetrainrightForward = new Talon(1, 3);
	LiveWindow.addActuator("Drivetrain", "rightForward", (Talon) drivetrainrightForward);
        
        drivetrainrightRear = new Talon(1, 4);
	LiveWindow.addActuator("Drivetrain", "rightRear", (Talon) drivetrainrightRear);
        
        drivetraindrive = new RobotDrive(drivetrainleftForward, drivetrainleftRear,
              drivetrainrightForward, drivetrainrightRear);
	
        drivetraindrive.setSafetyEnabled(true);
        drivetraindrive.setExpiration(0.1);
        drivetraindrive.setSensitivity(0.5);
        drivetraindrive.setMaxOutput(1.0);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}

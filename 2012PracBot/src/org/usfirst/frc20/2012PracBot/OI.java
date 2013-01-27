// RobotBuilder Version: 0.0.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
/* 
*
 This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
package org.usfirst.frc20.2012PracBot;
import org.usfirst.frc20.2012PracBot.RobotMap;
import org.usfirst.frc20.2012PracBot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;
public class OI {    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton tIncrementalDown;
    public JoystickButton trigger;
    public JoystickButton sIncrementalUp;
    public JoystickButton sIncrementalDown;
    public JoystickButton tIncrementalUp;
    public Joystick joystick;
    public Joystick xbox;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        xbox = new Joystick(2);
        
        joystick = new Joystick(1);
        
        tIncrementalUp = new JoystickButton(joystick, 6);
        tIncrementalUp.whenReleased(new TiltIncrementalUp());
        sIncrementalDown = new JoystickButton(joystick, 10);
        sIncrementalDown.whenReleased(new ShooterIncrementalDown());
        sIncrementalUp = new JoystickButton(joystick, 11);
        sIncrementalUp.whenReleased(new ShooterIncrementalUp());
        trigger = new JoystickButton(joystick, 1);
        trigger.whileHeld(new Shoot());
        tIncrementalDown = new JoystickButton(joystick, 7);
        tIncrementalDown.whenReleased(new TiltIncrementalDown());
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("ArcadeDrive", new ArcadeDrive());
        SmartDashboard.putData("TiltIncrementalUp", new TiltIncrementalUp());
        SmartDashboard.putData("TiltIncrementalDown", new TiltIncrementalDown());
        SmartDashboard.putData("ShooterIncrementalUp", new ShooterIncrementalUp());
        SmartDashboard.putData("ShooterIncrementalDown", new ShooterIncrementalDown());
        SmartDashboard.putData("Shoot", new Shoot());
        SmartDashboard.putData("TiltDoNothing", new TiltDoNothing());
        SmartDashboard.putData("ShooterDoNothing", new ShooterDoNothing());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick() {
        return joystick;
    }
    public Joystick getXbox() {
        return xbox;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

// RobotBuilder Version: 0.0.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc20.Robot;
import org.usfirst.frc20.Robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton gamepadButton4;
    public JoystickButton gamepadButton3;
    public JoystickButton gamepadButton2;
    public JoystickButton gamepadButton1;
    public Joystick gamepad;
    public Joystick joystick;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        joystick = new Joystick(2);
        
        gamepad = new Joystick(1);
        
        gamepadButton1 = new JoystickButton(gamepad, 1);
        gamepadButton1.whenPressed(new CowcatcherUp());
        gamepadButton2 = new JoystickButton(gamepad, 2);
        gamepadButton2.whenPressed(new CowcatcherDown());
        gamepadButton3 = new JoystickButton(gamepad, 3);
        gamepadButton3.whenPressed(new StingerRelease());
        gamepadButton4 = new JoystickButton(gamepad, 4);
        gamepadButton4.whenPressed(new StingerEngage());
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("BackRollersBackdrive", new BackRollersBackdrive());
        SmartDashboard.putData("BackRollersDrive", new BackRollersDrive());
        SmartDashboard.putData("BackRollersOff", new BackRollersOff());
        SmartDashboard.putData("FrontRollersDrive", new FrontRollersDrive());
        SmartDashboard.putData("FrontRollersOff", new FrontRollersOff());
        SmartDashboard.putData("FrontRollersBackdrive", new FrontRollersBackdrive());
        SmartDashboard.putData("ThroatDrive", new ThroatDrive());
        SmartDashboard.putData("ThroatOff", new ThroatOff());
        SmartDashboard.putData("ThroatBackdrive", new ThroatBackdrive());
        SmartDashboard.putData("TurntableStay", new TurntableStay());
        SmartDashboard.putData("TurntableLeft", new TurntableLeft());
        SmartDashboard.putData("TurntableRight", new TurntableRight());
        SmartDashboard.putData("CowcatcherStay", new CowcatcherStay());
        SmartDashboard.putData("CowcatcherUp", new CowcatcherUp());
        SmartDashboard.putData("CowcatcherDown", new CowcatcherDown());
        SmartDashboard.putData("StingerRelease", new StingerRelease());
        SmartDashboard.putData("StingerStay", new StingerStay());
        SmartDashboard.putData("StingerEngage", new StingerEngage());
        SmartDashboard.putData("DrivetrainArcadeDrive", new DrivetrainArcadeDrive());
        SmartDashboard.putData("DrivetrainStop", new DrivetrainStop());
        SmartDashboard.putData("ShooterKey", new ShooterKey());
        SmartDashboard.putData("ShooterFender", new ShooterFender());
        SmartDashboard.putData("ShooterOff", new ShooterOff());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getgamepad() {
        return gamepad;
    }
    public Joystick getjoystick() {
        return joystick;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

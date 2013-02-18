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

import org.usfirst.frc20.Robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;

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
    public JoystickButton driverAButton;
    public JoystickButton driverBButton;
    public JoystickButton driverXButton;
    public JoystickButton driverYButton;
    public JoystickButton driverLeftBumper;
    public JoystickButton driverRightBumper;
    public JoystickButton driverBackButton;
    public JoystickButton driverStartButton;
    public JoystickButton driverLeftJoystickPush;
    public JoystickButton driverRightJoystickPush;
    public Joystick driver;
    public JoystickButton operatorAButton;
    public JoystickButton operatorBButton;
    public JoystickButton operatorXButton;
    public JoystickButton operatorYButton;
    public JoystickButton operatorLeftBumper;
    public JoystickButton operatorRightBumper;
    public JoystickButton operatorBackButton;
    public JoystickButton operatorStartButton;
    public JoystickButton operatorLeftJoystickPush;
    public JoystickButton operatorRightJoystickPush;
    public Joystick operator;
    public Joystick third;
    public JoystickButton one;
    public JoystickButton two;
    public JoystickButton three;
    public JoystickButton four;
    public JoystickButton five;
    public JoystickButton six;
    public JoystickButton seven;

    public OI() {
        operator = new Joystick(2);

        operatorYButton = new JoystickButton(operator, 10);
        operatorXButton = new JoystickButton(operator, 9);
        operatorBButton = new JoystickButton(operator, 8);
        operatorAButton = new JoystickButton(operator, 7);
        operatorRightJoystickPush = new JoystickButton(operator, 6);
        operatorLeftJoystickPush = new JoystickButton(operator, 5);
        operatorStartButton = new JoystickButton(operator, 4);
        operatorBackButton = new JoystickButton(operator, 3);
        operatorRightBumper = new JoystickButton(operator, 2);
        operatorLeftBumper = new JoystickButton(operator, 1);

        operatorRightJoystickPush.whileHeld(new ShooterAndCollectorOn());
        operatorLeftJoystickPush.whileHeld(new ShooterAndCollectorOff());
        operatorStartButton.whileHeld(new ShooterAndCollectorReverse());
        operatorBackButton.whileHeld(new TrayUp());
        operatorRightBumper.whileHeld(new TrayDownGently());

        driver = new Joystick(1);

        driverRightJoystickPush = new JoystickButton(driver, 10);
        driverLeftJoystickPush = new JoystickButton(driver, 9);
        driverStartButton = new JoystickButton(driver, 8);
        driverBackButton = new JoystickButton(driver, 7);
        driverRightBumper = new JoystickButton(driver, 6);
        driverLeftBumper = new JoystickButton(driver, 5);
        driverYButton = new JoystickButton(driver, 4);
        driverXButton = new JoystickButton(driver, 3);
        driverBButton = new JoystickButton(driver, 2);
        driverAButton = new JoystickButton(driver, 1);
        
        driverRightJoystickPush.whileHeld(new CollectorOn());
        driverLeftJoystickPush.whileHeld(new CollectorOff());
        driverStartButton.whileHeld(new CollectorReverse());
        driverBackButton.whileHeld(new LifterCheckUp());
        driverRightBumper.whileHeld(new LifterDown());
        driverLeftBumper.whileHeld(new LifterIdle());
        driverYButton.whileHeld(new LifterUp());
        driverXButton.whileHeld(new ShooterAndCollectorOff());
        driverBButton.whileHeld(new ShooterAndCollectorOn());
        driverAButton.whileHeld(new ShooterAndCollectorReverse());

        // SmartDashboard Buttons
        /*SmartDashboard.putData("TrayUp", new TrayUp());
        SmartDashboard.putData("TrayDown", new TrayDown());
        SmartDashboard.putData("DrivetrainCheesyDrive", new DrivetrainCheesyDrive());
        SmartDashboard.putData("DrivetrainTankDrive", new DrivetrainTankDrive());
        SmartDashboard.putData("DrivetrainArcadeDrive", new DrivetrainArcadeDrive());
        //SmartDashboard.putData("DrivetrainDrive", new DrivetrainDrive());
        SmartDashboard.putData("CollectorOn", new CollectorOn());
        SmartDashboard.putData("CollectorOff", new CollectorOff());
        SmartDashboard.putData("CollectorReverse", new CollectorReverse());
        SmartDashboard.putData("LifterUp", new LifterUp());
        SmartDashboard.putData("LifterDown", new LifterDown());
        SmartDashboard.putData("ShooterOn", new ShooterOn());
        SmartDashboard.putData("ShooterOff", new ShooterOff());
        SmartDashboard.putData("ShooterCollect", new ShooterCollect());
        SmartDashboard.putData("LifterCheckUp", new LifterCheckUp());
        SmartDashboard.putData("Shoot", new Shoot());
        SmartDashboard.putData("IndexerKickerOut", new IndexerKickerOut());
        SmartDashboard.putData("IndexerKickerIn", new IndexerKickerIn());
        SmartDashboard.putData("IndexerKickerOff", new IndexerKickerOut());
        SmartDashboard.putData("IndexerStopperIn", new IndexerStopperIn());
        SmartDashboard.putData("IndexerStopperOut", new IndexerStopperOut());
        SmartDashboard.putData("IndexerStopperOff", new IndexerStopperIn());*/
    }

    public Joystick getDriver() {
        return driver;
    }

    public Joystick getOperator() {
        return operator;
    }
}

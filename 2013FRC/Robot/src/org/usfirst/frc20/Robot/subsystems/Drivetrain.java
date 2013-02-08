// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc20.Robot.subsystems;
import org.usfirst.frc20.Robot.RobotMap;
import org.usfirst.frc20.Robot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc20.Robot.Robot;
/**
 *
 */
public class Drivetrain extends Subsystem {
    public SpeedController leftFront = RobotMap.drivetrainleftFront;
    public SpeedController leftBack = RobotMap.drivetrainleftBack;
    public SpeedController rightFront = RobotMap.drivetrainrightFront;
    public SpeedController rightBack = RobotMap.drivetrainrightBack;
    
    RobotDrive robotDrive = RobotMap.drivetrainRobotDrive;
    
    Gyro gyro = RobotMap.drivetraingyro;
    Encoder leftEncoder = RobotMap.drivetrainleftEncoder;
    Encoder rightEncoder = RobotMap.drivetrainrightEncoder;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        
        //setDefaultCommand(new DrivetainArcadeDrive(Robot.oi.driver, 2, Robot.oi.driver, 1));
        setDefaultCommand(new DrivetrainCheesyDrive());
    }
    
    public void tankDrive(Joystick leftStick, int leftAxis, Joystick rightStick, int rightAxis){
        robotDrive.tankDrive(leftStick, leftAxis, rightStick, rightAxis);
    }
    
    public void arcadeDrive(){
        //Joystick moveStick, int moveAxis, Joystick rotateStick, int rotateAxis
        //robotDrive.arcadeDrive(moveStick, moveAxis, rotateStick, rotateAxis);
        
        //System.out.println("Before:\t"+leftFront.get());
        //robotDrive.arcadeDrive(moveStick.getRawAxis(moveAxis), rotateStick.getRawAxis(rotateAxis));
        //robotDrive.arcadeDrive(-(moveStick.getRawAxis(2)), -(rotateStick.getRawAxis(4)/1.25));
        robotDrive.arcadeDrive(-(Robot.oi.getDriver().getRawAxis(2)), -(Robot.oi.getDriver().getRawAxis(4)/1.25));
        //robotDrive.arcadeDrive(1.0, 1.0);
        //System.out.println("Arcade Driving.");
    }
    
    public void cheesyDrive(){
        if(Robot.oi.driverLeftBumper.get()){
            robotDrive.arcadeDrive(0, -(Robot.oi.getDriver().getRawAxis(4)));
        }else{
            robotDrive.arcadeDrive(-(Robot.oi.getDriver().getRawAxis(2)), (Robot.oi.getDriver().getRawAxis(2)*Robot.oi.getDriver().getRawAxis(4)));
        }
    }
    
    public void drive(double outputMagnitude, double curve){
        robotDrive.drive(outputMagnitude, curve);
    }
}
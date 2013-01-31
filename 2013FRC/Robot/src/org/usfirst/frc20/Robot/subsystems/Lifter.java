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
public class Lifter extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DoubleSolenoid rightLifterCylinder = RobotMap.lifterrightLifterCylinder;
    DoubleSolenoid leftLifterCylinder = RobotMap.lifterleftLifterCylinder;
    DigitalInput leftLimitSwitch = RobotMap.lifterleftLimitSwitch;
    DigitalInput rightLimitSwitch = RobotMap.lifterrightLimitSwitch;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    //reverse the pneumatics so that the piston contract and hold onto the first pyramid bar
    public void hookUp(){
        
        rightLifterCylinder.set(DoubleSolenoid.Value.kReverse);
        leftLifterCylinder.set(DoubleSolenoid.Value.kReverse);
    }
    public void hookDown(){
        rightLifterCylinder.set(DoubleSolenoid.Value.kForward);
        leftLifterCylinder.set(DoubleSolenoid.Value.kForward);
    }
    public void hookFloatDown(){
        rightLifterCylinder.set(DoubleSolenoid.Value.kOff);
        leftLifterCylinder.set(DoubleSolenoid.Value.kOff);
    }
}

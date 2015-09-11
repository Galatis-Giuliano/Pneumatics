package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 *
 */
public class Pneumatics extends Subsystem {
    
    private Compressor compressor    = new Compressor();
    private DoubleSolenoid leftArm   = new DoubleSolenoid(RobotMap.PNEUMATICS_ARM_LEFT_FWD,  RobotMap.PNEUMATICS_ARM_LEFT_BWD);
    private DoubleSolenoid rightArm  = new DoubleSolenoid(RobotMap.PNEUMATICS_ARM_RIGHT_FWD, RobotMap.PNEUMATICS_ARM_RIGHT_BWD);
    
   

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void ArmsNeutral(){
    	rightArmNeutral();
    	leftArmNeutral();
    }
    
    public void compStart() {
        compressor.start();
    }
    public void compStop() {
        compressor.stop();
    }
    
    public void leftArmOpen(){
    	leftArm.set(DoubleSolenoid.Value.kForward);
    }
    
    public void leftArmClose(){
    	leftArm.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void rightArmOpen(){
    	rightArm.set(DoubleSolenoid.Value.kForward);
    }
    
    public void rightArmClose(){
    	rightArm.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void rightArmNeutral(){
    	rightArm.set(DoubleSolenoid.Value.kOff);
    }
    
    public void leftArmNeutral(){
    	rightArm.set(DoubleSolenoid.Value.kOff);
    }
}


// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//This controls the motors running the drivebase
//we use four Can motors(two on each side)
//using arcade drive
//joystick Y controls throttle(schpeed)
//joystick X contorls rotation
import frc.robot.Constants;
public class DriveBase extends SubsystemBase {
  private final WPI_VictorSPX leftLeader= new WPI_VictorSPX(Constants.FRONT_LEFT_DRIVE);
  private final WPI_VictorSPX rightLeader= new WPI_VictorSPX(Constants.FRONT_RIGHT_DRIVE);
  private final WPI_VictorSPX leftFollower= new WPI_VictorSPX(Constants.BACK_LEFT_DRIVE);
  private final WPI_VictorSPX rightFollower=new WPI_VictorSPX(Constants.BACK_RIGHT_DRIVE);

  private DifferentialDrive drive =new DifferentialDrive(leftLeader, rightLeader);


  /** Creates a new DriveBase. */
  public DriveBase() {
     //follows leader motors
    leftFollower.follow(leftLeader);
    rightFollower.follow(rightLeader);

  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


  //Drives the robot with arcade controls
  public void arcadeDrive(double throttle, double rotation){
    rotation *=-1;
    drive.arcadeDrive(throttle, rotation);
  

  }



public void driveForward(double autonomousSpeed) {
}



public void stop() {
}
}
  


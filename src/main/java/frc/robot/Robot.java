// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import frc.robot.Arm;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */

public class Robot extends TimedRobot {

  Joystick joystick = new Joystick(0);
  






public static CTREConfigs ctreConfigs;

  private Command m_autonomousCommand;

  private RobotContainer m_robotContainer;


 // public void clearAllFaults(){

// WRITTEN BY SEBASTIAN
// THIS METHOD IS VERY IMPORTANT.
// REFERENCE EVERY SINGLE MOTOR IN THE CODE
// INCLUDE THE PDP, PNEUMATIC HUB, AND
// ANY OTHER DEVICE ON THE ROBOT THAT CAN
// BE REFERENCED IN CODE.
// USE EACH MOTOR/DEVICE'S CLEAR FAULTS COMMAND
// DEMONSTRATED BELOW

// USE SEBASTIAN'S CODE FOR REFERENCE.
// It is in Robot.java
// Github.com/CondylesIndustries

// THIS METHOD IS NOT COMPLETE YET. I have started
// writing it for you as an example

   // m_robotContainer.arm.motor1.clearFaults();
   // m_robotContainer.arm.motor7.clearFaults();
   // m_robotContainer.arm.elevatorMotor.clearFaults();

  // THIS METHOD SHOULD BE CALLED IN robotInit()
 // }

  
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    ctreConfigs = new CTREConfigs();
    // Instantiate our RobotContainer.  This will perform all our button bindings, and put our
    // autonomous chooser on the dashboard.
    m_robotContainer = new RobotContainer();
  }

  /**
   * This function is called every robot packet, no matter the mode. Use this for items like
   * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    // Runs the Scheduler.  This is responsible for polling buttons, adding newly-scheduled
    // commands, running already-scheduled commands, removing finished or interrupted commands,
    // and running subsystem periodic() methods.  This must be called from the robot's periodic
    // block in order for anything in the Command-based framework to work.
    CommandScheduler.getInstance().run();
  }

  /** This function is called once each time the robot enters Disabled mode. */
  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  /** This autonomous runs the autonomous command selected by your {@link RobotContainer} class. */
  @Override
  public void autonomousInit() {
   // m_autonomousCommand = m_robotContainer.getAutonomousCommand();

    // schedule the autonomous command (example)
    if (m_autonomousCommand != null) {
      m_autonomousCommand.schedule();
    }
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {

    //  //elevator up and down
   m_robotContainer.arm.setelevatorMotorSpeed(m_robotContainer.operator.getRawAxis(1));
  }

  @Override
  public void testInit() {
    // Cancels all running commands at the start of test mode.
    CommandScheduler.getInstance().cancelAll();
  }
}
  // public DigitalInput openLimitSwitch = new DigitalInput(1);
  // public DigitalInput closedLimitSwitch = new DigitalInput(0);
  // public CANSparkMax squeezeMotor = new CANSparkMax(23, MotorType.kBrushless);
  // public CANSparkMax leftintake = new CANSparkMax(15, MotorType.kBrushed);
  // public CANSparkMax rightIntake = new CANSparkMax(16, MotorType.kBrushed);

  // public DigitalInput testLimit = new DigitalInput(2);

  /** This function is called periodically during test mode. */
//   @Override
//   public void testPeriodic() {
//     if(m_robotContainer.operator.getRawButtonPressed(1)){
//       System.out.println("open limit switch status: " + openLimitSwitch.get());
//     }

//     if(m_robotContainer.operator.getRawButtonPressed(2)){
//       System.out.println("closed limit switch status: " + closedLimitSwitch.get());
//     }

//     if(m_robotContainer.operator.getRawButton(3)){
//       System.out.println("button 3 being pressed");
//       leftintake.set(0.5);
//       rightIntake.set(0.5);
//     }
//     else {
//       leftintake.set(0);
//       rightIntake.set(0);
//     }

//     if(m_robotContainer.operator.getRawButton(4)){
//       System.out.println("button 4 being pressed");
//       leftintake.set(-0.5);
//       rightIntake.set(-0.5);
//     }
//     else {
//       leftintake.set(0);
//       rightIntake.set(0);
//     }
//     // System.out.println(m_robotContainer.arm.openLimitSwitch.get());
//     // while(!closedLimitSwitch.get()){
//     //   System.out.println("limit switch pressed");
//     // }
//     // System.out.println()
//     // System.out.println("openLimitSwitch: " + openLimitSwitch.get());
//     // System.out.println("closedLimitSwitch: " + closedLimitSwitch.get());
//     // System.out.println("------------ " + testLimit.get());

//     if (m_robotContainer.operator.getRawButton(1)){
//       if(!openLimitSwitch.get()) {
//         squeezeMotor.set(0);
//       } else {
//         squeezeMotor.set(.5);
//       }
//     }
//     else if (m_robotContainer.operator.getRawButton(2)){
//       if(!closedLimitSwitch.get()) {
//         squeezeMotor.set(0);
//       } else {
//         squeezeMotor.set(-.5);
//       }
//     }
//     else {
//       squeezeMotor.set(0);
//     }

// ////// good code
//     // if (m_robotContainer.operator.getRawButton(1)){
//     //     squeezeMotor.set(.1);
//     // }
//     // else if (m_robotContainer.operator.getRawButton(2)){
//     //     squeezeMotor.set(-.1);
//     // }
//     // else {
//     //   squeezeMotor.set(0);
//     // }
// //////
//   }
// }




//   // if(!closedLimitSwitch.get()){
//   //   System.out.println("closed limit switch pressed");
//   // } else {
//   //   System.out.println("closed limit switch not pressed");
//   // }

//   // if(!openLimitSwitch.get()) {
//   //   System.out.println("open limit switch pressed");
//   // } else {
//   // System.out.println("open limit switch not pressed");
//   // }
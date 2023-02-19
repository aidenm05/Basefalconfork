package frc.robot;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
//import frc.robot.autos.exampleAuto;
import frc.robot.commands.TeleopSwerve;
//import frc.robot.subsystems.LimelightSubsystem;
import frc.robot.subsystems.Swerve;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

     Arm arm;

    /* Controllers */
    public final Joystick driver = new Joystick(0);
    public final GenericHID operator = new Joystick(1);

    /* Drive Controls */
    // private final int translationAxis = XboxController.Axis.kLeftY.value;
    // private final int strafeAxis = XboxController.Axis.kLeftX.value;
    // private final int rotationAxis = XboxController.Axis.kRightX.value;

    /* Driver Buttons */
    private final JoystickButton moveWheelsCenter = new JoystickButton(operator, XboxController.Button.kRightBumper.value);
    // private final JoystickButton armControl = new JoystickButton(driver, XboxController.Button.kX.value);
    // // private final JoystickButton cubeLevelTwo7 = new JoystickButton (operator, 7);
    // private final JoystickButton coneLevelOne2 = new JoystickButton (operator, 2);
    // private final JoystickButton coneLevelTwo1 = new JoystickButton (operator, 1);
    // private final JoystickButton coneLevelBoth3 = new JoystickButton (operator, 3);
    // private final JoystickButton cubeLevelOne10 = new JoystickButton (operator, 10);
    private final JoystickButton zeroGyro = new JoystickButton (driver, 10);
    private final JoystickButton robotCentric = new JoystickButton (driver, 8);
    // private final JoystickButton presetItemPos19 = new JoystickButton (driver, 10);
    // private final JoystickButton turnLeft17 = new JoystickButton (driver, 17);
    // private final JoystickButton turnRight13 = new JoystickButton (driver, 13);
    // private final JoystickButton miscDebugOne11 = new JoystickButton (driver, 11);
    // private final JoystickButton miscDebugTwo12 = new JoystickButton (driver, 12);
    // private final JoystickButton intakeSuck = new JoystickButton(operator, XboxController.Axis.kLeftTrigger.value);
    // private final JoystickButton elevAxis = new JoystickButton(operator, XboxController.Axis.kLeftY.value);
    // private final JoystickButton armLength = new JoystickButton(operator, XboxController.Axis.kRightY.value);
    // private final JoystickButton intakeSpit = new JoystickButton(operator, XboxController.Axis.kRightTrigger.value);
    // private final JoystickButton sPINAXISXLEFTSTICK = new JoystickButton(driver,  3);
    // private final JoystickButton sPINAXISYLEFTSTICK = new JoystickButton(driver,  2);
    // private final JoystickButton aRMAXISLEFTSPINNY = new JoystickButton(driver,  5);
    // private final JoystickButton eLEVATORAXISRIGHTSPINNY = new JoystickButton(driver,  4);
    // private final JoystickButton sPINAXISXRIGHTSTICK = new JoystickButton(driver,  6);
    // private final JoystickButton sPINAXISYRIGHTSTICK = new JoystickButton(driver,  1);





    
    /* Subsystems */
    private final Swerve s_Swerve = new Swerve();
   //  public Arm arm = new Arm();
    //pr/ivate LimelightSubsystem LimelightSubsystem;

    /** The container for the robot. Contains subsystems, OI devices, and commands. */
    public RobotContainer() {

        
     // Create and configure the subsystems
     arm = new Arm();
        
     // Map the raw axes on the operator controller to the corresponding motor speeds


                
        s_Swerve.setDefaultCommand(
            new TeleopSwerve(
                s_Swerve, 
                () -> driver.getRawAxis(0), 
                () -> driver.getRawAxis(1), 
                () -> -driver.getRawAxis(3), 
                () -> robotCentric.getAsBoolean()
            )
        );

        // Configure the button bindings
        configureButtonBindings(

        );
    }

    /**
     * Use this method to define your button->command mappings. Buttons can be created by
     * instantiating a {@link GenericHID} or one of its subclasses ({@link
     * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
     * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
     */
  private void configureButtonBindings() {
        /* Driver Buttons */
// Unused buttons
// If you want to use any of these buttons for additional functionality, you can create a new command
// or modify an existing command to execute when the button is pressed.

// sPINAXISXLEFTSTICK.onTrue((Command) new MyCommand());
// sPINAXISYLEFTSTICK.onTrue((Command) new MyCommand());
// aRMAXISLEFTSPINNY.onTrue((Command) new MyCommand());
// eLEVATORAXISRIGHTSPINNY.onTrue((Command) new MyCommand());
// sPINAXISXRIGHTSTICK.onTrue((Command) new MyCommand());
// sPINAXISYRIGHTSTICK.onTrue((Command) new MyCommand());


// Operator buttons
//  cubeLevelOne10.onTrue((Command) new MyCommand());
//  coneLevelOne2.onTrue((Command) new MyCommand());
//  coneLevelTwo1.onTrue((Command) new MyCommand());
//  coneLevelBoth3.onTrue((Command) new MyCommand());
//  presetItemPos19.onTrue((Command) new MyCommand());
//  turnLeft17.onTrue((Command) new MyCommand());
//  turnRight13.onTrue((Command) new MyCommand());
//  miscDebugOne11.onTrue((Command) new MyCommand());
//  miscDebugTwo12.onTrue((Command) new MyCommand());


 //  Command example = new RunCommand(() -> a_Arm.setSpeed(driver.getRawAxis(99)), a_Arm);
    // Command IntakeInwards = new RunCommand(() -> a_Arm.setIntakeSpeed(.5), a_Arm);
    // Command IntakeOutwards = new RunCommand(() -> a_Arm.setIntakeSpeed(-.5), a_Arm);

        zeroGyro.onTrue(new InstantCommand(() -> s_Swerve.zeroGyro()));
        moveWheelsCenter.onTrue(new InstantCommand(() -> {
            for (int i = 0; i < 0; i++) {
                s_Swerve.mSwerveMods[0].setDesiredState(new SwerveModuleState(0, new Rotation2d()), true);
            }            
        }));
    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
   // public Command getAutonomousCommand() {
        // An ExampleCommand will run in autonomous
       // return new exampleAuto(s_Swerve,LimelightSubsystem);
    }


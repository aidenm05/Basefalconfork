 package frc.robot;
 import frc.lib.util.CTREModuleState;
 import frc.lib.util.SwerveModuleConstants;
 
 import com.ctre.phoenix.motorcontrol.ControlMode;
 import com.ctre.phoenix.motorcontrol.DemandType;
 import com.ctre.phoenix.motorcontrol.can.TalonFX;
 import com.ctre.phoenix.sensors.CANCoder;
 
 import com.revrobotics.CANSparkMax;
 import com.revrobotics.CANSparkMaxLowLevel.MotorType;
 import com.revrobotics.SparkMaxPIDController;
 import com.revrobotics.RelativeEncoder;
 import com.revrobotics.CANSparkMax.IdleMode;
 import edu.wpi.first.wpilibj.AnalogPotentiometer;
 import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
 import edu.wpi.first.wpilibj2.command.SubsystemBase;
 import frc.robot.Constants;
 import frc.robot.Robot;
 import edu.wpi.first.wpilibj.DigitalInput;

 public class Arm extends SubsystemBase {

    

        
  
     public DigitalInput openLimitSwitch = new DigitalInput(1);
     public DigitalInput closedLimitSwitch = new DigitalInput(0);
    
    //  public CANSparkMax motor1 = new CANSparkMax(97, MotorType.kBrushless);
     public TalonFX elevatorMotor = new TalonFX(4);
    //  public CANSparkMax LeftTriggerMotor = new CANSparkMax(96, MotorType.kBrushless);
    //  public CANSparkMax RightTriggerMotor = new CANSparkMax(99, MotorType.kBrushless);
    //  public CANSparkMax ArmLengthMotor = new CANSparkMax(77, MotorType.kBrushless);
    //  public CANSparkMax ArmLengthXMotor = new CANSparkMax(66, MotorType.kBrushless);
    //  public CANSparkMax motor7 = new CANSparkMax(67, MotorType.kBrushless);
    //   public CANSparkMax FieldOrientYMotor = new CANSparkMax(67, MotorType.kBrushless);
    //  public CANSparkMax SpinYMotor = new CANSparkMax(67, MotorType.kBrushless);
    //  public CANSparkMax SpinXMotor = new CANSparkMax(69, MotorType.kBrushless);
    //  public CANSparkMax ElevatorHeightMotor = new CANSparkMax(4, MotorType.kBrushless);
    //  public CANSparkMax DriverArmLengthMotor = new CANSparkMax(65, MotorType.kBrushless);
    //   public CANSparkMax FieldOrientXMotor = new CANSparkMax(67, MotorType.kBrushless);

         public Arm() {
            
      
         }
    
        //  public void setMotor1Speed(double speed) {
        //      motor1.set(speed);
        //  }
        
         public void setelevatorMotorSpeed(double speed) {
             elevatorMotor.set(ControlMode.PercentOutput,speed);
         }
        
        //  public void setLeftTriggerMotorSpeed(double speed) {
        //      LeftTriggerMotor.set(speed);
        //  }
        
        //  public void setRightTriggerMotorSpeed(double speed) {
        //      RightTriggerMotor.set(speed);
        //  }
        
        //  public void setArmLengthMotorSpeed(double speed) {
        //      ArmLengthMotor.set(speed);
        //  }
        
        //  public void setArmLengthXMotorSpeed(double speed) {
        //      ArmLengthXMotor.set(speed);
        //  }
        
        //   public void setFieldOrientYMotorSpeed(double speed) {
        //       FieldOrientYMotor.set(speed);
        //   }
        
        //  public void setSpinYMotorSpeed(double speed) {
        //      SpinYMotor.set(speed);
        //  }
        
        //  public void setSpinXMotorSpeed(double speed) {
        //      SpinXMotor.set(speed);
        //  }
        
        //  public void setElevatorHeightMotorSpeed(double speed) {
        //      ElevatorHeightMotor.set(speed);
        //  }
        
        //  public void setDriverArmLengthMotorSpeed(double speed) {
        //      DriverArmLengthMotor.set(speed);
        //  }
        
        //   public void setFieldOrientXMotorSpeed(double speed) {
        //       FieldOrientXMotor.set(speed);
        //   }
     }
    
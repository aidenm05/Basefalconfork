package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.TalonFXSensorCollection;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
    final TalonFX elevatorMotor;
    private final TalonFXSensorCollection elevatorEncoder;

    private static final int ELEVATOR_POSITION_0 = 0;
    private static final int ELEVATOR_POSITION_1 = 1000;
    private static final int ELEVATOR_POSITION_2 = 2000;

    private static final double ELEVATOR_K_P = 0.1;
    private static final double ELEVATOR_K_I = 0.0;
    private static final double ELEVATOR_K_D = 0.0;
    private static final double ELEVATOR_K_F = 0.0;

    public Arm() {
        // Initialize elevator motor and encoder
        elevatorMotor = new TalonFX(Constants.ELEVATOR_MOTOR_ID);
        elevatorEncoder = elevatorMotor.getSensorCollection();

        // Set feedback device for closed-loop control
        elevatorMotor.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);

        // Set PIDF gains for closed-loop control
        elevatorMotor.config_kP(0, ELEVATOR_K_P);
        elevatorMotor.config_kI(0, ELEVATOR_K_I);
        elevatorMotor.config_kD(0, ELEVATOR_K_D);
        elevatorMotor.config_kF(0, ELEVATOR_K_F);

        // Set maximum velocity for the elevator
        elevatorMotor.configMotionCruiseVelocity(1000);

        // Set acceleration for the elevator
        elevatorMotor.configMotionAcceleration(500);

        // Set allowable closed-loop error for the elevator
        elevatorMotor.configAllowableClosedloopError(0, 50);
    }
    @Override
    public void periodic(){

        System.out.println("Sensor Pos:" + elevatorMotor.getSelectedSensorPosition());
    }
 
public void setelevatorMotorSpeed(double speed) {
            elevatorMotor.set(ControlMode.PercentOutput,speed);
        }
    public void setElevatorPosition(int position) {
        switch (position) {
            case 0:
                elevatorMotor.set(ControlMode.MotionMagic, ELEVATOR_POSITION_0);
                break;
            case 1:
                elevatorMotor.set(ControlMode.MotionMagic, ELEVATOR_POSITION_1);
                break;
            case 2:
                elevatorMotor.set(ControlMode.MotionMagic, ELEVATOR_POSITION_2);
                break;
            default:
                break;
        }
    }

    public void stopElevator() {
        elevatorMotor.set(ControlMode.PercentOutput, 0);
    }
}

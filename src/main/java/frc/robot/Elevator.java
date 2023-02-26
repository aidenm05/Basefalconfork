package frc.robot;

import frc.lib.util.CTREModuleState;
import frc.lib.util.SwerveModuleConstants;
import com.ctre.phoenix.motorcontrol.ControlMode;

import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.*;
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
import frc.robot.Arm;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj.Encoder;

public class Elevator {
    public Encoder elevatorEncoder;
    private int currentPosition;
    private int targetPosition;
    public Elevator elevator;
 TalonFX elevatorMotor = new TalonFX(4);

    private final int[] presetPositions = {0, 5000, 10000, 15000, 20000}; // Encoder positions for each preset position

    public Elevator() {
        this.elevatorMotor = elevatorMotor;
        this.elevatorEncoder = elevatorEncoder;
        this.currentPosition = 0;
        this.targetPosition = 0;
    }

    public void moveToPresetPosition(int presetIndex) {
        if (presetIndex >= 0 && presetIndex < presetPositions.length) {
            this.targetPosition = presetPositions[presetIndex];
        }
    }

    public void update() {
        int encoderPosition = elevatorEncoder.get();
        if (encoderPosition != currentPosition) {
            currentPosition = encoderPosition;
        }

        int error = targetPosition - currentPosition;
        double motorOutput = error * .01; // kP is a constant for the proportional term in the PID controller
        elevatorMotor.set(ControlMode.PercentOutput, motorOutput);
    }
}

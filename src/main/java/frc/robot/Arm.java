package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {


    public DigitalInput openLimitSwitch = new DigitalInput(1);
    public DigitalInput closedLimitSwitch = new DigitalInput(0);
    private final CANSparkMax leftIntakeMotor;
    private final CANSparkMax rightIntakeMotor;
    public final CANSparkMax squeezeMotor;
    
    public Arm() {
         openLimitSwitch = new DigitalInput(1);
         closedLimitSwitch = new DigitalInput(0);
        leftIntakeMotor = new CANSparkMax(16, MotorType.kBrushed);
        rightIntakeMotor = new CANSparkMax(15, MotorType.kBrushed);    
        squeezeMotor = new CANSparkMax(17, MotorType.kBrushless);
    }
    
    public void stopSqueeze() {
        leftIntakeMotor.set(0.0);
        rightIntakeMotor.set(0.0);
    }
    public void startSqueeze() {
        leftIntakeMotor.set(.5);
        rightIntakeMotor.set(.5);
    }
    
    public void closeintake() {

        if (openLimitSwitch.get() || closedLimitSwitch.get()){
            squeezeMotor.set(0.0);
        } else {
            squeezeMotor.set(0.5);
        }
    }
    public void openintake() {
        if (openLimitSwitch.get() || closedLimitSwitch.get()){
            squeezeMotor.set(-0.5);
        } else {
            squeezeMotor.set(0.0);
        }
    }
}

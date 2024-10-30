// Created By Aaron Nayki 
package team3647.frc2024.subsystems;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.DifferentialDrive.WheelSpeeds;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import team3647.lib.PeriodicSubsystem;

public class Drivetrain implements PeriodicSubsystem {
    
    public static class PeriodicIO {
        public double leftSpeed=0;
        public double rightSpeed=0;
    }

    private final CANSparkMax leftMotor;
    private final CANSparkMax rightMotor;
    private final PeriodicIO periodicIO = new PeriodicIO();

    public Drivetrain(CANSparkMax leftMotor, CANSparkMax rightMotor) {
        this.leftMotor = leftMotor;
        this.rightMotor = rightMotor;
    }
    @Override
    public void writePeriodicOutputs() {
        leftMotor.set(periodicIO.leftSpeed);
        rightMotor.set(periodicIO.rightSpeed);
    }
    public void drive(double speed, double rotation) {
        WheelSpeeds wheelSpeeds = DifferentialDrive.arcadeDriveIK(speed,rotation,false);
        periodicIO.leftSpeed = wheelSpeeds.left;
        periodicIO.rightSpeed = wheelSpeeds.right;
    }
    @Override
    public void periodic(){
        writePeriodicOutputs();
    }
    @Override
    public String getName() {
        return "drivetrain";
    }
}

package team3647.frc2024.constants;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

public class DriveTrainConstants {
    public static final CANSparkMax leftMotor = new CANSparkMax(4, MotorType.kBrushless);
    public static final CANSparkMax rightMotor = new CANSparkMax(5, MotorType.kBrushless);
}

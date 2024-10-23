package team3647.frc2024.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import team3647.frc2024.subsystems.Drivetrain;

public class DrivetrainCommands {
    private final Drivetrain drivetrain;
    public DrivetrainCommands(Drivetrain drivetrain){
        this.drivetrain = drivetrain;
    }

    public Command drive(double speed, double rotation) {
        return Commands.run(() -> drivetrain.drive(speed, rotation), drivetrain);
    }
}

package team3647.frc2024.Commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.networktables.Publisher;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import team3647.frc2024.subsystems.Drivetrain;

public class DrivetrainCommands {
    private final Drivetrain drivetrain;
    public DrivetrainCommands(Drivetrain drivetrain){
        this.drivetrain = drivetrain;
    }

    public Command drive(DoubleSupplier speed, DoubleSupplier rotation) {
        return Commands.run(() -> drivetrain.drive(speed.getAsDouble(), rotation.getAsDouble()), drivetrain);

    }



}



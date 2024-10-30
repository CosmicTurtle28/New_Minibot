// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team3647.frc2024.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.Commands;
import team3647.frc2024.Commands.DrivetrainCommands;
import team3647.frc2024.constants.DriveTrainConstants;
import team3647.frc2024.subsystems.Drivetrain;
import team3647.lib.inputs.Joysticks;

public class RobotContainer {
  CANSparkMax leftMotor = DriveTrainConstants.leftMotor;
  CANSparkMax rightMotor = DriveTrainConstants.rightMotor;
  Drivetrain dt = new Drivetrain(leftMotor, rightMotor);
  DrivetrainCommands dtc = new DrivetrainCommands(dt);
  Joysticks controller = new Joysticks(0);
  public RobotContainer() {
    CommandScheduler.getInstance().registerSubsystem(dt);
    configureBindings();
  }

  private void configureBindings() {
    dt.setDefaultCommand(dtc.drive(controller::getLeftStickY,controller::getRightStickX));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}

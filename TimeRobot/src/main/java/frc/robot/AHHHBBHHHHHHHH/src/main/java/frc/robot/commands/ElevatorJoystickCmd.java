package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ElevatorSubsystem;

public class ElevatorJoystickCmd extends CommandBase {

  private final ElevatorSubsystem elecatorSubsystem = new ElevatorSubsystem();

  public ElevatorJoystickCmd(ElevatorSubsystem elevatorSubsystem) {
    this.elevatorSubsystem = elevatorSubsystem; 
  }
 
  public ElevatorJoystickCmd() {
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
  }

  @Override
  public void end(boolean interrupted) {
  }
  @Override
  public boolean isFinished() {
    return false;
  }
 }
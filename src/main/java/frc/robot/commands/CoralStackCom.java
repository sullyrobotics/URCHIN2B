package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Roller;
import frc.robot.Constants.RollerConstants;

public class CoralStackCom extends Command {
    private final Roller m_roller;

    public CoralStackCom(Roller roller) {
        m_roller= roller;
        addRequirements(roller);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        m_roller.runRoller(RollerConstants.ROLLER_CORAL_STACK);
    }

    @Override
    public void end(boolean interrupted) {
        m_roller.runRoller(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}  

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.ClimberConstants;
import frc.robot.subsystems.Climb;

public class ClimberDownCom extends Command{
    private final Climb m_climber;

    public ClimberDownCom(Climb climber) {
        m_climber = climber;
        addRequirements(climber);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        m_climber.runClimber(ClimberConstants.CLIMBER_SPEED_DOWN);
    }

    @Override
    public void end(boolean interrupted) {
        m_climber.runClimber(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}

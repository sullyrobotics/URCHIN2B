package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.ArmConstants;
import frc.robot.subsystems.Arm;

public class ArmUpCom extends Command{
    private final Arm m_arm;

    public ArmUpCom(Arm arm) {
        m_arm = arm;
        addRequirements(arm);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        m_arm.runArm(ArmConstants.ARM_SPEED_UP);
    }

    @Override
    public void end(boolean interrupted) {
        m_arm.runArm(ArmConstants.ARM_HOLD_UP);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}

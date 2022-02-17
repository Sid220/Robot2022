// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.util.Units;
import frc.robot.util.TunableNumber;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static final boolean tuningMode = false;
  public static final int zero = 0; // in case you need a zero :)

  public static final class RobotMap {
    // MOTORS
    public static final int frontLeftMotorPort = 1; // NEEDS TO BE CHECKED WHEN PORTS ARE OFFICIAL
    public static final int backLeftMotorPort = 2; // NEEDS TO BE CHECKED WHEN PORTS ARE OFFICIAL
    public static final int frontRightMotorPort = 3; // NEEDS TO BE CHECKED WHEN PORTS ARE OFFICIAL
    public static final int backRightMotorPort = 4; // NEEDS TO BE CHECKED WHEN PORTS ARE OFFICIAL

    // Climber
    public static final int telescope = 7; // Needs to probably changed when the whole ports are set and like maybe the
                                           // climber will need a second one for a winch motor idk.
    public static final int flywheelLeftPort = 5;
    public static final int flywheelRightPort = 6;

    public static final int intakeMotorRollers = 7; // NEEDS TO BE CHECKED WHEN PORTS ARE OFFICIAL
    public static final int intakeMotorFourBar = 8; // NEEDS TO BE CHECKED WHEN PORTS ARE OFFICIAL

    public static final int lowerSnek = 9;
    public static final int upperSnek = 10;
    // DIO
    public static final int snekLowerSwitch = Constants.zero;
    public static final int snekUpperSwitch = 1;

    // Climber
    public static final int telescope =
        7; // Needs to probably changed when the whole ports are set and like maybe the climber will
    // need a second one for a winch motor idk.
  }

  public static final class DriveConstants {
    public static final double kJoystickTurnDeadzone = 0.04;
    public static final double wheelDiameter = 4;
    public static final double gearRatio = 60.0 / 10.0;
    public static final double distPerPulse = (1.0 / gearRatio) * Units.inchesToMeters(wheelDiameter) * Math.PI;

    private static final double bumperlessRobotLength = Units.inchesToMeters(26);
    private static final double bumperlessRobotWidth = Units.inchesToMeters(24);
    private static final double bumperThickness = Units.inchesToMeters(3);

    public static final double fullRobotWidth = bumperlessRobotWidth + bumperThickness * 2;
    public static final double fullRobotLength = bumperlessRobotLength + bumperThickness * 2;
  }

  public static final class IntakeConstants {
    public static final TunableNumber kP = new TunableNumber("Intake/Four Bar kP", 1);

    public static final int rollerCurrentLimit = 20;
    public static final int fourBarCurrentLimit = 30;
    public static final double speed = 0.5;
  }

  public static final class ShooterConstants {
    public static final double gearRatio = 1;
    public static final int currentLimit = 40;
    public static final TunableNumber kP = new TunableNumber("Shooter/kP", 0.9);
    public static final TunableNumber kFF = new TunableNumber("Shooter/kFF", 0.5);
    public static final int RPM = 500;
  }

  public static final class SnekConstants {
    public static final int currentLimit = 20;
  }

  public static final class AutoConstants {
    // FF and FB gains; NEED TO BE DETERMINED ON THE FULLY BUILT ROBOT, WILL CHANGE
    // WITH WEIGHT
    public static final double ksVolts = 0.20541;
    public static final double kvVoltSecondsPerMeter = 2.4361;
    public static final double kaVoltSecondsSquaredPerMeter = 0.25946;

    public static final double kPDriveVel = 3.95;

    // more kinematics stuff
    public static final double trackWidth = 0.66;
    public static final DifferentialDriveKinematics kinematics = new DifferentialDriveKinematics(trackWidth);

    public static final double maxCentripetalAcceleration = 100;

    // Ramsete constants; generally the same on all robots
    public static final double RamseteZeta = 0.7;
    public static final double RamseteB = 2;

    // Max speeds
    public static final double maxSpeed = Units.feetToMeters(14);
    public static final double maxAccel = Units.feetToMeters(14);
    public static final double maxVoltageApplied = 10;
  }

  public static final class ClimberConstants {
<<<<<<< HEAD
    public static final int kCurrentLimit1 = 40;
    public static final TunableNumber kP1 = new TunableNumber("Climber/kP", 0.0);
    public static final TunableNumber kF1 = new TunableNumber("Intake/kF", 0.005);
    public static final TunableNumber smartMotionMaxVelocity1 = new TunableNumber("Intake/Smart Motion Max Velocity",
        1000);
    public static final TunableNumber smartMotionMaxAcceleration1 = new TunableNumber(
        "Intake/Smart Motion Max Acceleration", 1000);
        public static final int kCurrentLimit2 = 40;
        public static final TunableNumber kP2 = new TunableNumber("Climber/kP", 0.0);
        public static final TunableNumber kF2 = new TunableNumber("Intake/kF", 0.005);
        public static final TunableNumber smartMotionMaxVelocity2 = new TunableNumber("Intake/Smart Motion Max Velocity",
            1000);
        public static final TunableNumber smartMotionMaxAcceleration2 = new TunableNumber(
            "Intake/Smart Motion Max Acceleration", 1000);
    public static final double speed = 1.0;
  
  }
}
=======
    public static final double kP = 1; // Subject to change
    public static final int kCurrentLimit = 40;
  }
}
>>>>>>> d507db6e24d1f8abd7f2aa51725410b148531ba5

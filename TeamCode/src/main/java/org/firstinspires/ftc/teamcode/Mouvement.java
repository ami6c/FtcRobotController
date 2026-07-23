package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Mouvement extends OpMode {
    motorMouv motorM = new motorMouv();
    double speed = 0.5;

    @Override
    public void init() {
        motorM.init(hardwareMap, speed);
    }

    @Override
    public void loop() {

        telemetry.addData("rightTrigger", gamepad1.right_trigger_pressed);
        telemetry.addData("leftTrigger", gamepad1.left_trigger_pressed);
        telemetry.addData("left x", gamepad1.left_stick_x);

        // Move forward
        if (gamepad1.right_trigger_pressed) {
            motorM.setMotorSpeed();
            // Move Left
            if (gamepad1.left_stick_x < 0 || gamepad1.dpad_left) {
                motorM.turnLeft();
            }
            // Move Right
            if (gamepad1.left_stick_x > 0 || gamepad1.dpad_right) {
                motorM.turnRight();
            }
        }
        // Move backward
        else if (gamepad1.left_trigger_pressed) {
            motorM.mouvBackwards();
            // Move Left
            if (gamepad1.left_stick_x < 0 || gamepad1.dpad_left) {
                motorM.turnLeft();
            }
            // Move Right
            if (gamepad1.left_stick_x > 0 || gamepad1.dpad_right) {
                motorM.turnRight();
            }
        }
        // Stop moving
        else {
            motorM.stop();
        }

        // Stop vehicle
        /*
        if (gamepad1.atRest()) {
            motorM.motorBreak();
        }
        if (gamepad1.b) {
            motorM.motorBreak();
        }
        if (gamepad1.y) {
            motorM.motorFloat();
        }
        */

    }
}

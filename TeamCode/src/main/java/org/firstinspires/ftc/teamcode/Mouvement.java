package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Mouvement extends OpMode {
    motorMouv motorM = new motorMouv();

    @Override
    public void init() {
        motorM.init(hardwareMap, 0.1);
    }

    @Override
    public void loop() {

        telemetry.addData("rightTrigger", gamepad1.right_trigger_pressed);
        telemetry.addData("leftTrigger", gamepad1.left_trigger_pressed);
        telemetry.addData("left x", gamepad1.left_stick_x);

        while (gamepad1.right_trigger_pressed) {
            telemetry.addData("rightTrigger", gamepad1.right_trigger_pressed);
            telemetry.addData("leftTrigger", gamepad1.left_trigger_pressed);
            telemetry.addData("left x", gamepad1.left_stick_x);
            
            if (gamepad1.left_stick_x < 0) {
                motorM.turnLeft();
            } if (gamepad1.left_stick_x > 0) {
                motorM.turnRight();
            } else {
                motorM.setMotorSpeed();
            }
        }

        while (gamepad1.left_trigger_pressed) {
            motorM.mouvBackwards();
        }

        motorM.motorBreak();

    }
}

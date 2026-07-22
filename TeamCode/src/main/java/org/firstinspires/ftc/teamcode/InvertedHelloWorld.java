package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@Autonomous
public class InvertedHelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("World", "Hello");
    }

    @Override
    public void loop() {

    }
}

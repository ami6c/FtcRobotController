package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class motorMouv {
    private DcMotor motorLhs, motorRhs;
    private double speed;

    public void init(HardwareMap hwMap, double s){

        motorLhs = hwMap.get(DcMotor.class, "motorLhs");
        motorRhs = hwMap.get(DcMotor.class, "motorRhs");

        motorLhs.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorRhs.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorLhs.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorRhs.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorLhs.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        motorRhs.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);

        speed = s;
    }

    public void setMotorSpeed(){
        motorLhs.setDirection(DcMotorSimple.Direction.REVERSE);
        motorRhs.setDirection(DcMotorSimple.Direction.FORWARD);

        motorLhs.setPower(speed);
        motorRhs.setPower(speed);
    }

    public void mouvBackwards(){
        motorLhs.setDirection(DcMotorSimple.Direction.FORWARD);
        motorRhs.setDirection(DcMotorSimple.Direction.REVERSE);

        motorLhs.setPower(speed);
        motorRhs.setPower(speed);
    }

    public void turnRight(){
        motorRhs.setPower(speed/2);
        motorLhs.setPower(speed*2);
    }

    public void turnLeft(){
        motorLhs.setPower(speed/2);
        motorRhs.setPower(speed*2);
    }

    public void stop() {
        motorLhs.setPower(0);
        motorRhs.setPower(0);
    }

}

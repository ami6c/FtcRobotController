package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class motorMouv {
    private DcMotor motorLhs, motorRhs;
    private double speed;

    public void init(HardwareMap hwMap, double s){

        motorLhs = hwMap.get(DcMotor.class, "motorLhs");
        motorRhs = hwMap.get(DcMotor.class, "motorRhs");

        motorLhs.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorRhs.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        speed = s;
    }

    public void setMotorSpeed(){
        motorLhs.setPower(-speed);
        motorRhs.setPower(speed);
    }

    public void turnLeft(){
        motorRhs.setPower(speed/2);
    }

    public void turnRight(){
        motorLhs.setPower(speed/2);
    }

    public void mouvBackwards(){
        motorLhs.setPower(speed);
        motorRhs.setPower(-speed);
    }

    public void motorBreak(){
        motorLhs.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorRhs.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        /*
        motorLhs.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        motorLhs.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        */
    }
}

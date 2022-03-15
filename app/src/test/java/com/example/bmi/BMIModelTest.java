package com.example.bmi;

import org.junit.Test;

public class BMIModelTest {
    @Test
    public void getBMITest(){
        double w,h;
        System.out.println("Testing BMI.getBMI");
        w=90; h = 1.8;
        System.out.println(w + ", " + h);
        System.out.println(BMIModel.formatBMI(BMIModel.getBMI(w,h)));
        System.out.println(BMIModel.formatBMI(123.126));
    }
}

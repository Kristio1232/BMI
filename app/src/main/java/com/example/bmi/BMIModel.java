package com.example.bmi;

public class BMIModel {
    public static double toDouble(String s){
        double newDouble = 0;
        try {
            newDouble = Double.parseDouble(s);
        } catch (NumberFormatException e) {
        }
        return newDouble;
    }
    public static double getBMI(double weight, double height){
        double BMI = weight/ (height * height);
        return BMI;
    }
    public static String formatBMI(double bmi){
        String output = String.format("%.2f",bmi);
        return output;
    }
}

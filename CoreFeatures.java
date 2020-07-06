package com.codedifferently;

import java.lang.Math;

public class CoreFeatures extends SciCalculator{
    public CoreFeatures(){

    }

    public double getAddition(double num1){
        return super.getCurrentValue() + num1;
    }
    
    public double getSubtraction(double num1){
        return super.getCurrentValue() - num1;
    }

    public double getMultiplication(double num1){
        return super.getCurrentValue() * num1;
    }

    public double getDivision(double num1){
        return super.getCurrentValue() / num1;
    }

    public double getSquare(){
        return super.getCurrentValue() * super.getCurrentValue();
    }

    public double getSquareRoot(){
        return Math.sqrt(super.getCurrentValue());
    }

    public double getExponent(double num1){
        return Math.pow(super.getCurrentValue(), num1);
    }

    public double getInverse(){
        return ((double)1 / super.getCurrentValue());
    }

    public double getInvert(){
        return -super.getCurrentValue();
    }
}
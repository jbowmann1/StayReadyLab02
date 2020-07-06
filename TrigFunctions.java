package com.codedifferently;

import java.lang.Math;

public class TrigFunctions extends SciCalculator{
    
    public double sine (double num1){
        return Math.sin(num1);
    }

    public double cosine (double num1){
        return Math.cos(num1);
    }

    public double tangent (double num1){
        return Math.tan(num1);
    }

    public double inverseSine (double num1){
        return Math.asin(num1);
    }

    public double inverseCosine (double num1){
        return Math.acos(num1);
    }

    public double inverseTangent (double num1){
		return Math.atan(num1);
    }
}
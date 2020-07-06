package com.codedifferently;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Assert; 

public class CoreFeaturesTest {
    
    @Test

    public void getAdditionTest(){
        //Given
        double currentValue = 3;
        double num1 = 5;

        //When
        CoreFeatures coreFeatures = new CoreFeatures();
        coreFeatures.setCurrentValue(currentValue);
        double actual = coreFeatures.getAddition(num1);

        //Then
        double expected = 8;
        Assert.assertEquals (expected, actual, 0);
    }

    @Test
    
    public void getSubtractionTest(){
        //Given
        double currentValue = 10;
        double num1 = 6;

        //When
        CoreFeatures coreFeaatures = new CoreFeatures();
        coreFeatures.setCurrentValue(currentValue);
        double actual = coreFeatures.getSubtraction(num1);

        //Then
        double expected = 4;
        Assert.assertEquals (expected, actual, 0);
    }

    @Test
    
    public void getMultiplicationTest(){
        //Given
        double currentValue = 11;
        double num1 = 10; 

        //When
        CoreFeatures coreFeatures = new CoreFeatures();
        coreFeatures.setCurrentValue(currentValue);
        double actual = coreFeatures.getMultiplication(num1);

        //Then
        double expected 110;
        Assert.assertEquals (expected, actual, 0);
    }

    @Test
    
    public void getDivisionTest(){
        //Given 
        double currentValue = 25;
        double num1 = 5; 

        //When
        CoreFeatures coreFeatures = new CoreFeatures();
        coreFeatures.setCurrentValue(currentValue);
        double actual = coreFeatures.getDivision(num1);

        //Then
        double expected = 5;
        Assert.assertEquals (expected, actual, 0);
    }

    @Test
    
    public void getSquareTest(){
        //Given
        double currentValue = 10;

        //When
        CoreFeatures coreFeatures = new CoreFeatures();
        coreFeatures.setCurrentValue(currentValue);
        double actual = coreFeatures.getSquare(currentValue);

        //Then
        double expected = 100;
        Assert.assertEquals (expected, actual, 0);
    }

    @Test
    
    public void getSquareRootTest(){
        //Given
        double currentValue = 81;

        //When
        CoreFeatures coreFeatures = new CoreFeatures();
        coreFeatures.setCurrentValue(currentValue);
        double actual = core.Features.getSquareRoot(currentValue);

        //Then
        double expected = 9; 
        Assert.assertEquals (expected, actual, 0);
    }

    @Test
    
    public void getExponentTest(){
        //Given
        double currentValue 3;
        double num1 = 3; 

        //When
        CoreFeatures coreFeatures = new CoreFeatures();
        coreFeatures.setCurrentValue(currentValue);
        double actual = coreFeatures.getExponent(num1);

        //Then 
        double expected = 27;
        Assert.assertEquals (expected, actual, 0);
    }

    @Test
    
    public void getInversetest(){
        //Given
        double currentValue = 1

        //When
        CoreFeatures coreFeatures = new CoreFeatures();
        coreFeatures.setCurrentValue(currentValue);
        double actual = coreFeatures.getInverse(currentValue);

        //Then
        double expected = 1
        Assert.assertEquals (expected, actual, 0);
    }

    @Test
    
    public void getInvertTest(){
        //Given
        double currentValue = 2

        //When
        CoreFeatures coreFeatures = new CoreFeatures();
        coreFeatures.setCurrentValue(currentValue);
        double actual = coreFeatures.getExponent(currentValue);

        //Then 
        double expected = -2
        Assert.assertEquals (expected, actual, 0);
    }
    
    
   
}
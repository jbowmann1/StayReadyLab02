package com.codedifferently;

import org.junit.Test;
import org.junit.Assert;

public class TrigFunctionsTest {
    
    @Test
    public void getSineTest(){
        //Given
        double num1 = 10;

        //When
        TrigFunctions trigFunctions = new TrigFunctions();
        double result = trigFunctions.sine(result);

        //Then
        Assert.assertEquals((result), -0.544021110888, 0);
    }
    
    @Test
    public void getCosineTest(){
        //Given
        double num1 = 20;

        //When
        TrigFunctions trigFunctions = new TrigFunctions();
        double result = trigFunctions.cosine(result);

        //Then
        Assert.assertEquals((result), 0.40808206181, 0);
    }

    @Test
    public void getTangentTest(){
        //Given
        double num1 = 30;

        //When
        TrigFunctions trigFunctions = new TrigFunctions();
        double result = trigFunctions.tangent(result);

        //Then
        Assert.assertEquals((result), -6.40533119665, 0);
    }

    @Test
    public void getInverseSineTest(){
        //Given
        double num1 = .1;

        //When
        TrigFunctions trigFunctions = new TrigFunctions();
        double result = trigFunctions.inverseSine(result);

        //Then
        Assert.assertEquals((result), 0.100167421, 0);
    }

    @Test
    public void getInverseCosineTest(){
        //Given
        double num1 = .2;

        //When
        TrigFunctions trigFunctions = new TrigFunctions();
        double result = trigFunctions.inverseCosine(result);

        //Then
        Assert.assertEquals((result), 1.36943841, 0);
    }

    @Test
    public void getInverseTangentTest(){
        //Given
        double num1 = .3;

        //When
        TrigFunctions trigFunctions = new TrigFunctions();
        double result = trigFunctions.inverseTangent(result);

        //Then
        Assert.assertEquals((result), 0.291456794, 0);
    }
}
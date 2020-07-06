package com.codedifferently;

import org.junit.Test;
import org.junit.Assert;

public class MemoryTest {

public void addtoMemoryTest(){
    //Given
    Memory memory = new Memory();
    double currentValue = 25;
    double expectedValue = 25; 

    //When
    memory.addToMemory(currentValue);

    //Then
    Assert.assertEquals(expectedValue, memory.addtoMemory(), 0;)
}

public void resetMemoryTest(){
    //Given
    Memory memory = new Memory();

    //When
    double currentValue = 0;

    //Then
    Assert.assertEquals(0, memory.addtoMemory(), 0;)
}


}
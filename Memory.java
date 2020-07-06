package com.codedifferently;

public class Memory extends SciCalculator{
    private double memoryValue;
	public Object addtoMemory;

   public Memory(){ 
        memoryValue = 0;
    }

    public void addToMemory(double num1){
        memoryValue += num1;
        System.out.println("Value in Memory: " + memoryValue);
    }

    public void resetMemory(){
        memoryValue = 0;
    }
    public double recallMemory(){
        System.out.println("Value in Memory: "+ memoryValue);
        return memoryValue;
    }

}


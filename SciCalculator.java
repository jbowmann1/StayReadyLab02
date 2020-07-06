package com.codedifferently;

/**
*Hello World!
*
*/
public class SciCalculator{

    static int display = 0;
    protected double currentValue;
    protected double displayValue;
    private CoreFeatures coreFeatures;
    private TrigUnits trigUnits;
    private Memory memory;
    private DisplayMode displayMode;
    private TrigFunctions trigFunctions;

    public SciCalculator(){
        this.currentValue = 0;
        this.coreFeatures = new CoreFeatures();
        this.memory = new Memory();
        this.trigFunctions = new TrigFunctions();
        this.trigUnits = new TrigUnits();
    }

    protected void setCurrentValue(double currentValue){
        this.currentValue = currentValue;
    }
    
    public double getCurrentValue(){
        return this.currentValue;

    }

    public DisplayMode getDisplay(){
        return this.displayMode;
    }

    public double getDisplayValue(){
        return this.currentValue;
    }

    public Memory getMemory(){
        return this.memory;
    }

    public CoreFeatures getCoreFeatures(){
        return this.coreFeatures;
    }

    public double clearDisplayValue(){
        return this.currentValue;
    }

    public TrigFunctions getTrigFunction(){
        return this.trigFunctions;
    }

    public double setDisplayValue(double currentValue){
        return this.currentValue;
    }

    public TrigUnits getTrigUnits(){
        return this.trigUnits;
    }
    
    public static void main ( String[] args )
    {
        
    }
}
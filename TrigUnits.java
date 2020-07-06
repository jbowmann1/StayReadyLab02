package com.codedifferently;

public class TrigUnits{

    private String setMode;

    public TrigUnits(){
        this.setMode = "Degrees";
    }

    public String getSetMode(){
        return this.setMode;
    }

    public void switchUnitsMode(){
        if (setMode == "Degrees"){
            setMode = "Radians";
        }
        else{
            setMode = "Degrees";
        }
    }

    public void switchUnitsMode(final String mode){
        this.setMode = mode; 
    }
}
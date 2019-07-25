package com.project.java.project;

public abstract class Widget implements  WidgetInterface {
    private SurfaceColor color;
    protected String serialNumber;


    public Widget(SurfaceColor color) {
        this.color = color;
    }
    public SurfaceColor getColor(){
        return  color;
    }

    @Override
    public String getSerialNumber() {
        return serialNumber;
    }
}


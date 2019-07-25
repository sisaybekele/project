package com.project.java.project;

import sun.security.x509.SerialNumber;

public class WidgetSmall extends Widget{
    public WidgetSmall(SurfaceColor color){
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial(SerialNumber.ProductType.SmallWidget);
    }

    @Override
    public String getGears() {
        return "2 Gears";
    }

    @Override
    public String getSpring() {
        return "3 Springs";
    }

    @Override
    public String getLevers() {
        return "1 Levers";
    }
}



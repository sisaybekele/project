package com.project.java.project;

import sun.security.x509.SerialNumber;

public class WidgetMedium extends Widget {
    public WidgetMedium(SurfaceColor color){
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial(SerialNumber.ProductType.MediumWidget);
    }

    @Override
    public String getGears() {
        return "4 Gears";
    }

    @Override
    public String getSpring() {
        return "5 Springs";
    }

    @Override
    public String getLevers() {
        return "3 Levers";
    }
}



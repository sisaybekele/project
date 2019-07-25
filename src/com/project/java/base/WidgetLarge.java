package com.project.java.project;

import sun.security.x509.SerialNumber;

public class WidgetLarge extends  Widget {
    public WidgetLarge(SurfaceColor color){
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial(SerialNumber.ProductType.LargeWidget);
    }

    @Override
    public String getGears() {
        return "9 Gears";
    }

    @Override
    public String getSpring() {
        return "4 Springs";
    }

    @Override
    public String getLevers() {
        return "2 Levers";
    }
}

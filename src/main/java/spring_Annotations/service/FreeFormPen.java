package spring_Annotations.service;

import spring_Annotations.util.Properties;

public class FreeFormPen extends Properties {
    private String freeFromPen;


    public String getFreeFromPen() {
        return freeFromPen;
    }

    public void setFreeFromPen(String freeFromPen) {
        this.freeFromPen = freeFromPen;
    }


    public String getDetail(){
        return super.getDetail("FreeFromPen")+
                "Free Pen :"+getFreeFromPen()+"\n";
    }
}

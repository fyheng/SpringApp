package spring_Annotations.service;

import org.springframework.beans.factory.annotation.Required;
import spring_Annotations.util.Properties;

public class Pen extends Properties {
    private String color;


    public String getColor() {
        return color;
    }

    @Required
    public void setColor(String color) {
        this.color = color;
    }


    public String getDetail(){
        return super.getDetail("Pen")+
                "Color :"+getColor()+"\n";
    }
}

package spring2011.service;

import java.util.List;

public class PenTool {
    private String color;
    private List<String> size;

    public String getColor(){
        return color;
    }

    /**
     * this setter method is use in applicationContext2011.xml
     * that use to preset the value to property
     * @param color
     */
    public void setColor(String color){
        this.color = color;
    }

    public List<String> getSize() {
        return size;
    }

    public void setSize(List<String> size) {
        this.size = size;
    }

    public void draw(){
        System.out.println("draw by Pen with color "+ getColor());
    }
    public String getDetail(){
        return "Draw by penTool with\n" +
                "color: "+getColor();
    }

    public String getAvailableSize(){
        String allSize = "";
        for (String s:size) {
            allSize += "Size :"+s+"\n";
        }
        return "Draw by penTool with \n"+allSize;
    }
}

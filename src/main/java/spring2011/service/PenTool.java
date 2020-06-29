package spring2011.service;

public class PenTool {
    private String color;

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

    public void draw(){
        System.out.println("draw by Pen with color "+ getColor());
    }
    public String getDetail(){
        return "Draw by penTool with\n" +
                "color: "+getColor();
    }
}

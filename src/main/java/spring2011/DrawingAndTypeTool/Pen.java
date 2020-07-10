package spring2011.DrawingAndTypeTool;

public class Pen {
    private float size;
    private String type;
    private String point;
    private String color;

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Pen() {
    }

    public String getDetail(){
        return "Pen:\n" +
                "Size :"+getSize()+"\n" +
                "Type :"+getType()+"\n" +
                "Point :"+getPoint()+"\n" +
                "Color :"+getColor()+"\n";
    }
}

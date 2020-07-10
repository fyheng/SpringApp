package spring2011.DrawingAndTypeTool;

public class FreeFormPen {
    private float size;
    private String type;
    private String point;
    private String freeFromPen;

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

    public String getFreeFromPen() {
        return freeFromPen;
    }

    public void setFreeFromPen(String freeFromPen) {
        this.freeFromPen = freeFromPen;
    }

    public FreeFormPen() {
    }

    public String getDetail(){
        return "FreeFormPen:\n" +
                "Size :"+getSize()+"\n" +
                "Type :"+getType()+"\n" +
                "Point :"+getPoint()+"\n" +
                "Free Pen :"+getFreeFromPen()+"\n";
    }
}

package spring2011.DrawingAndTypeTool;

public class AddAnchorPoint {
     private float size;
     private String type;
     private String point;
     private String addAnchorPoint;

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

    public String getAddAnchorPoint() {
        return addAnchorPoint;
    }

    public void setAddAnchorPoint(String addAnchorPoint) {
        this.addAnchorPoint = addAnchorPoint;
    }

    public AddAnchorPoint() {
    }

    public String getDetail(){
        return "Anchor-Point:\n" +
                "Size :"+getSize()+"\n" +
                "Type :"+getType()+"\n" +
                "Point :"+getPoint()+"\n" +
                "Anchor :"+getAddAnchorPoint()+"\n";
    }
}

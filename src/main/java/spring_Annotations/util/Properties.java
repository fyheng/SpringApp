package spring_Annotations.util;

public abstract class Properties implements PropertySupport{
    private float size;
    private String type;
    private String point;


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


    public String getDetail(String title){
        return title+":\n" +
                "Size :"+getSize()+"\n" +
                "Type :"+getType()+"\n" +
                "Point :"+getPoint()+"\n";
    }
}

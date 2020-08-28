package spring2011.cropTool;

public class Crop {
    private String color;
    private String size;
    private String cropType;

    public Crop(String color, String size, String cropType) {
        this.color = color;
        this.size = size;
        this.cropType = cropType;
    }

    public Crop() {
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    public String getDetail() {
        return "Crop Detail:\n" +
                "Crop Color : " + getColor() + "\n" +
                "Size : " + getSize() +"\n" +
                "Crop Type : "+getCropType();
    }
}

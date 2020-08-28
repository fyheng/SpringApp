package spring2011.textEditror;

public class MarkerTool {
    private  String color;
    private  String size;


    /**
     * in this case we have two constructor
     * application will chose one that follow by parameter that provide in xml file
     * @param color
     */
    public MarkerTool(String color){
        this.color = color;
    }

    /**
     * this constructor use in applicationContext2011.xml
     * use to preset value to all properties of class
     * @param color
     * @param size
     */
    public MarkerTool(String color,String size){
        this.color = color;
        this.size = size;
    }

    public String getColor(){
        return color;
    }

    public String getSize(){
        return size;
    }


    public void draw(){
        System.out.println("draw by MarkerTool\nwith color "+ getColor()+"\nwith size "+getSize());
    }
    public String getDetail(){
        return "Draw by penTool with\n" +
                "color: "+getColor()+"\n" +
                "size :"+getSize();
    }
}

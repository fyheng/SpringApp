package spring2011.DrawingAndTypeTool;

public class DrawingAndTypeTool {
    private  Pen pen;
    private  FreeFormPen freePen;
    private  AddAnchorPoint addAnchorPoint;

    public DrawingAndTypeTool(Pen pen, FreeFormPen freePen, AddAnchorPoint addAnchorPoint) {
        this.pen = pen;
        this.freePen = freePen;
        this.addAnchorPoint = addAnchorPoint;
    }

    public String getDetail(){
        return "This is Drawing And Type Tool\n" +
                pen.getDetail()+"\n"+
                freePen.getDetail()+"\n"+
                addAnchorPoint.getDetail()+"\n";
    }

    //############################################################
    //TEST Lifecycle Callbacks


    //spring will call destroy of DisposableBean class after application END
    public void beforeInit() {
        System.out.println("Initializing Bean init method call or CropTool");
    }


    //spring will call destroy of DisposableBean class after application END
    public void afterDestroy() {
        System.out.println("Spring Auto call this Destroy bean method!!!");
    }
}

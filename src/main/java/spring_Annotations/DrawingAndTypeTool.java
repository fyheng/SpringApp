package spring_Annotations;


import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import spring_Annotations.service.DeleteAnchorPoint;
import spring_Annotations.service.FreeFormPen;
import spring_Annotations.service.Pen;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class DrawingAndTypeTool {
    private Pen pen;
    private FreeFormPen formPen;
    private DeleteAnchorPoint deleteAnchorPoint;


    /**
     * this property (pen) not use autowired
     * it is a normal bean
     * @param pen
     */
    public void setPen(Pen pen) {
        this.pen = pen;
    }


    /**
     * @autowired by setter method
     * @Qualifier
     * @param formPen
     */
    @Autowired
    @Qualifier("qualifierFreePen")
    public void setFormPen(FreeFormPen formPen) {
        this.formPen = formPen;
    }


    @Resource(name = "deletePoint1")
    public void setDeleteAnchorPoint(DeleteAnchorPoint deleteAnchorPoint) {
        this.deleteAnchorPoint = deleteAnchorPoint;
    }


    public String getDetail(){
        return "This is Drawing And Type Tool\n" +
                pen.getDetail()+"\n"+
                formPen.getDetail()+"\n" +
                deleteAnchorPoint.getDetail();
    }



    //############################################################
    //TEST Lifecycle Callbacks

    //spring will call destroy of DisposableBean class after application END
    @PostConstruct
    public void beforeInit() {
        System.out.println("Initializing Bean init method call or CropTool");
    }


    //spring will call destroy of DisposableBean class after application END
    @PreDestroy
    public void afterDestroy() {
        System.out.println("Spring Auto call this Destroy bean method!!!");
    }
}

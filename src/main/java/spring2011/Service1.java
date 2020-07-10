package spring2011;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring2011.DrawingAndTypeTool.DrawingAndTypeTool;
import spring2011.service1.CropTool;

public class Service1 {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2011-1.xml");

        context.registerShutdownHook();// to destroy applicationContext after application END (by default java know when to destroy)

//        CropTool cropTool = context.getBean("cropTool",CropTool.class);
//        cropTool.setBeanName("new bean name");
//        System.out.println(cropTool.getDetail());

        //#####################################################################################################################

        DrawingAndTypeTool drawingAndTypeTool = context.getBean("drawingAndTypeTool",DrawingAndTypeTool.class);
        System.out.println(drawingAndTypeTool.getDetail());


    }
}

package spring2011.DrawingAndTypeTool;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring2011.service1.CropTool;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2011-1.xml");
        context.registerShutdownHook();

        DrawingAndTypeTool drawingAndTypeTool = context.getBean("drawingAndTypeTool",DrawingAndTypeTool.class);
        System.out.println(drawingAndTypeTool.getDetail());


    }
}

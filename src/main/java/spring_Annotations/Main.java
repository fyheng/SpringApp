package spring_Annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
        context.registerShutdownHook();

        DrawingAndTypeTool drawingAndTypeTool = context.getBean("drawing", DrawingAndTypeTool.class);

        System.out.println(drawingAndTypeTool.getDetail());
    }
}

package AOP;

import AOP.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringAOP.xml");
        ShapeService shapeService = context.getBean("shapeService",ShapeService.class);

        System.out.println(shapeService.getCircle().getName());
    }
}

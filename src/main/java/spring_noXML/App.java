package spring_noXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_noXML.config.Config;
import spring_noXML.service.Lenovo;
import spring_noXML.util.MainBoard;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);


        Lenovo lenovoL1 = context.getBean("lenovo", Lenovo.class);
        Lenovo lenovoP1 = context.getBean("lenovoP3", Lenovo.class);

        System.out.println("LenovoL1");
        System.out.println(lenovoL1.getSpecs());

        System.out.println("LenovoP1");
        System.out.println(lenovoP1.getSpecs());

    }
}

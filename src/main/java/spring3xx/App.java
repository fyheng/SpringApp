package spring3xx;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring3xx.service.Lenovo;
import spring3xx.service.NVIDIAGTX1660Ti;
import spring3xx.service.NVIDIARTX2070;
import spring3xx.util.GPU;
import spring3xx.util.MainBoard;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSpring3xx.xml");

        Lenovo lenovoL1 = context.getBean("lenovo",Lenovo.class);
        Lenovo lenovoP1 = context.getBean("lonovoP1",Lenovo.class);

        System.out.println("LenovoL1");
        System.out.println(lenovoL1.getSpecs());

        System.out.println("LenovoP1");
        System.out.println(lenovoP1.getSpecs());

    }
}

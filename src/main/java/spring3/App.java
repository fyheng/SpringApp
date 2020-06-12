package spring3;

import spring3.service.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring3.util.CPU;
import spring3.util.GPU;
import spring3.util.MainBoard;
import spring3.util.RAM;

public class App {
    public static void main(String[] args) {

        //java style
/*        MainBoard mainBoard = new MBG732GW();
        CPU cpu = new Corei9();
        GPU gpu = new NVIDIARTX2070();
        RAM ram = new DDR4();


        Lenovo lenovoP1 = new Lenovo(mainBoard,cpu,gpu,ram);
        System.out.println("LenovoP1");
        System.out.println(lenovoP1.getSpecs());

        System.out.println("LenovoL1");
        Lenovo lenovoL1 = lenovoP1;
        lenovoL1.setGpu(new NVIDIAGTX1660Ti());
        System.out.println(lenovoL1.getSpecs());
*/

        //spring context style
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSpring3.xml");
        Lenovo lenovoL1 = context.getBean("lenovoL1",Lenovo.class);
        Lenovo lenovoP1 = context.getBean("lenovoP1",Lenovo.class);

        System.out.println("LenovoL1");
        System.out.println(lenovoL1.getSpecs());

        System.out.println("LenovoP1");
        System.out.println(lenovoP1.getSpecs());

    }
}

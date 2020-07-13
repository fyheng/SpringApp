package spring2011.service1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service1 {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2011-1.xml");

        // to destroy applicationContext after application END (by default java know when to destroy)
        context.registerShutdownHook();

        CropTool cropTool = context.getBean("cropTool",CropTool.class);
        cropTool.setBeanName("new bean name");
        System.out.println(cropTool.getDetail());



    }
}

package springTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springTest.service.SimpleCRUD;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SimpleCRUD simpleCRUD = context.getBean("CacheDB",SimpleCRUD.class);

        System.out.println(simpleCRUD.saveAction());
    }
}

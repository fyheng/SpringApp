package spring2011;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring2011.service.EditText;
import spring2011.service.MarkerTool;
import spring2011.service.PenTool;

public class App {
    public static void main(String[] args) {
        /**
         * this BeanFactory not work
         */
    /*
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("applicationContext2011.xml"));
        PenTool penTool = factory.getBean("penTool",PenTool.class);
        penTool.draw();
    */
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2011.xml");


//        PenTool penTool = context.getBean("penTool",PenTool.class);
//        System.out.println(penTool.getDetail());
//
//        MarkerTool markerTool = context.getBean("markerTool",MarkerTool.class);
//        System.out.println(markerTool.getDetail());

        EditText editText = context.getBean("editText", EditText.class);
        System.out.println(editText.getTool());
    }
}

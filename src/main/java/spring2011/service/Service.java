package spring2011.service;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import spring2011.service.EditText;
import spring2011.service.MarkerTool;
import spring2011.service.PenTool;
import spring2011.service1.CropTool;

public class Service {
    public static void main(String[] args) {

/*   THIS IS OLD STYLE TO RESGTER BEAN
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext2011-1.xml"));
        CropTool cropTool1 = (CropTool) beanFactory.getBean("cropTool");
        System.out.println(cropTool1.getDetail());
*/

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2011.xml");

        //this two bean we have create ready but it not public bcos it inside other bean
//        PenTool penTool = context.getBean("penTool",PenTool.class);
//        System.out.println(penTool.getDetail());
//        MarkerTool markerTool = context.getBean("markerTool",MarkerTool.class);
//        System.out.println(markerTool.getDetail());


        EditText editText = context.getBean("editText", EditText.class);
        System.out.println(editText.getTool());




    }
}

package spring_Annoutations02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_Annoutations02.config.AppConfig;
import spring_Annoutations02.service.FirstBean;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        FirstBean firstBean = context.getBean(FirstBean.class);
        firstBean.populateBeans();
        context.close();
    }
}

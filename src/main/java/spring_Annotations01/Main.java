package spring_Annotations01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_Annotations01.config.Config;
import spring_Annotations01.controller.MessageController;
import spring_Annotations01.controller.MessageFieldController;
import spring_Annotations01.controller.MessageSetterController;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        MessageController messageController = context.getBean(MessageController.class);
        messageController.processMsg("Email message sending...\n");

        MessageFieldController fieldController = context.getBean(MessageFieldController.class);
        fieldController.processMsg("SMS message sending...\n");

        MessageSetterController setterController = context.getBean(MessageSetterController.class);
        setterController.processMsg("Twitter message sending...\n");
    }
}

package spring_Annotations01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring_Annotations01.config.MessageService;

@Component
public class MessageController {
    private final MessageService messageService;

    @Autowired
    public MessageController(@Qualifier("EmailService") MessageService messageService) {
        super();
        this.messageService = messageService;
    }

    public void processMsg(String message){
        System.out.println("processBy Controller @Qualifier");
        messageService.sendMsg(message);
    }
}

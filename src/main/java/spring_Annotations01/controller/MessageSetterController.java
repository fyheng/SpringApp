package spring_Annotations01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring_Annotations01.config.MessageService;

@Component
public class MessageSetterController {
    private MessageService messageService;

    @Autowired
    @Qualifier("TwitterService")
    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }

    public void processMsg(String message){
        System.out.println("processBy setterMethod @Qualifier");
        messageService.sendMsg(message);
    }
}

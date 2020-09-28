package spring_Annotations01.controller;

import org.springframework.stereotype.Component;
import spring_Annotations01.config.MessageService;

import javax.annotation.Resource;

@Component
public class MessageFieldController {
    public MessageFieldController() {}

//    @Qualifier("SMSService")
//    @Autowired
    @Resource(name = "SMSService") // we can use resource stand for Qualifier and Autowired
    private MessageService messageService;

    public void processMsg(String message){
        System.out.println("processBy Field @Resource");
        messageService.sendMsg(message);
    }
}

package spring_Annotations01.service;

import org.springframework.stereotype.Service;
import spring_Annotations01.config.MessageService;

@Service("SMSService")
public class SMSService implements MessageService {

    public void sendMsg(String message) {
        System.out.println("SMS Service");
        System.out.println(message);
    }
}

package spring_Annotations01.service;

import org.springframework.stereotype.Service;
import spring_Annotations01.config.MessageService;

@Service("EmailService")
public class EmailService implements MessageService {

    public void sendMsg(String message) {
        System.out.println(message);
    }
}

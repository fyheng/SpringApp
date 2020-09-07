package spring_Annotations01.service;

import org.springframework.stereotype.Service;
import spring_Annotations01.config.MessageService;

@Service("TwitterService")
public class TwitterService implements MessageService {
    public void sendMsg(String message) {
        System.out.println("Twitter Service");
        System.out.println(message);
    }
}

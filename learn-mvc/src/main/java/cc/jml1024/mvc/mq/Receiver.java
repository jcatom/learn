package cc.jml1024.mvc.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @JmsListener(destination = "mailBox", containerFactory = "myFactory")
    public void receiveMessage(String msg) {
        System.out.println(msg);
    }
}

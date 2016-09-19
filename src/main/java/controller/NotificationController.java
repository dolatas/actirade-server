package controller;


import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Notification;

@RestController
public class NotificationController {
	
    @RequestMapping("/notification")
    public Notification notification() {
    	Notification n = new Notification();
    	n.setDate(new Date());
    	n.setContent("Testowa notyfikacja");
        return n;
    }
}

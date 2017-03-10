package learn.partTwo.springMVC.controller;

import learn.partTwo.springMVC.model.ChatMessage;
import learn.partTwo.springMVC.model.Greeting;
import learn.partTwo.springMVC.model.WiselyMessage;
import learn.partTwo.springMVC.model.WiselyResponse;
import learn.partTwo.springMVC.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by clz on 2017/2/2.
 */
@Controller
public class LearnWebSocketController {
    private static final String TEMPLATE = "Hello,%s!";
    private static final AtomicLong counter = new AtomicLong();

    @Autowired
    private EchoService echoService;
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @RequestMapping(value = "/greeting/{name}", method = RequestMethod.GET)
    public Greeting greeting(@PathVariable(value = "name") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView index() {
        Greeting greeting = new Greeting(1000L, "yannuo!");
        ModelAndView ret = new ModelAndView("home", "greeting", greeting);
        return ret;
    }

    @RequestMapping(value = "/greeting/echo/{echo}", method = RequestMethod.GET)
    public Greeting getEcho(String echo) {
        String content = echoService.saySome(echo);
        Greeting ret = new Greeting(1L, content);
        return ret;
    }

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws InterruptedException {
        Thread.sleep(1000L);
        return new WiselyResponse("welcome," + message.getName());
    }

    @MessageMapping("/chat")
    public void handleChat(Principal principal, ChatMessage msg) {
        if (principal.getName().equals("wtf")) {
            messagingTemplate.convertAndSendToUser(
                    "wrd",
                    "/queue/notifications",
                    principal.getName() + "-Send:" + msg.getName());
        }else{
            messagingTemplate.convertAndSendToUser(
                    "wtf",
                    "/queue/notifications",
                    principal.getName() + "-Send:" + msg.getName());

        }
    }
}

package com.shogun.suzukisan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConversationController {

    @GetMapping("/conversation")
    public String conversation() {
        return "conversation";
    }

}
package babinski.sebastian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SocialMediaController {

    @RequestMapping("/facebook")
    public String displayFacebook() {
        return "redirect:"   + "http://www.facebook.com";
    }

    @RequestMapping("/twitter")
    public String displayTwitter() {
        return "redirect:"   + "http://www.twitter.com";
    }

    @RequestMapping("/instagram")
    public String displayInstagram() {
        return "redirect:"   + "http://www.instagram.com";
    }
}

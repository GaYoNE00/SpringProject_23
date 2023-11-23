package kr.protest.springproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index(){
        System.out.println("index");
        return "index";
    }
    @RequestMapping("/test")
    public String test(){
        System.out.println("test");
        return "post_register";
    }
    @RequestMapping("/post_register")
    public String register(){
        System.out.println("post_register");
        return "post/post_register";
    }
}

package kr.protest.springproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
        return "test";
    }
}

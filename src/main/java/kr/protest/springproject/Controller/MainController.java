package kr.protest.springproject.Controller;

import jakarta.servlet.http.HttpServletRequest;
import kr.protest.springproject.DTO.UserDTO;
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
    @RequestMapping("/login")
    public String login(){
        System.out.println("login");
        return "member/login";
    }
    @RequestMapping("/login_check")
    public String login_check(UserDTO dto, HttpServletRequest request){


        return "";
    }

    @RequestMapping("/login_success")
    public String login_success(){
        System.out.println("login");
        return "member/login";
    }
    @RequestMapping("/mypage")
    public String mypage(){
        System.out.println("mypage");
        return "member/mypage";
    }

    @RequestMapping("/post_register")
    public String register(){
        System.out.println("post_register");
        return "post/post_register";
    }
}

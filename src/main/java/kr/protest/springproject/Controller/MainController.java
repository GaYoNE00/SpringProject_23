package kr.protest.springproject.Controller;

import jakarta.servlet.http.HttpServletRequest;
import kr.protest.springproject.DTO.UserDTO;
import kr.protest.springproject.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MainController {

    @Autowired
    private final MemberService memberService;

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
    @PostMapping("/login_check")
    @ResponseBody
    public ResponseEntity<?> login_check(@RequestParam String userName, @RequestParam String userPassword) {

        boolean result = memberService.login_check(userName,userPassword);;

        if (result) {
            return ResponseEntity.ok().body("로그인 성공");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("로그인 실패");
        }
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

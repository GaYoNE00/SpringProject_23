package kr.protest.springproject.Service.ServiceImpl;

import kr.protest.springproject.DTO.UserDTO;
import kr.protest.springproject.Entity.UsersEntity;
import kr.protest.springproject.Repository.MemberRepository;
import kr.protest.springproject.Service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {


    @Autowired
    private final MemberRepository memberRepository;

    public String login_check(String email, String password){
        Optional<UsersEntity> result = Optional.ofNullable(memberRepository.findAllBy(email, password));
        return result.isPresent()?"Success":"Fail";
    }

}

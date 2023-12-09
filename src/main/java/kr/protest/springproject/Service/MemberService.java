package kr.protest.springproject.Service;

import kr.protest.springproject.DTO.UserDTO;
import kr.protest.springproject.Entity.UsersEntity;

public interface MemberService {
     boolean login_check(String email, String password);

     default UserDTO entityToDTO(UsersEntity entity){
          UserDTO dto = UserDTO.builder().email(entity.getEmail())
                  .password(entity.getPassword())
                  .build();
          return dto;
     }
}

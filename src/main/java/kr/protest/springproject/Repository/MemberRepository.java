package kr.protest.springproject.Repository;

import kr.protest.springproject.DTO.UserDTO;
import kr.protest.springproject.Entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<UsersEntity, Long> {
    UsersEntity findByEmailAndPassword(String email, String password);

}

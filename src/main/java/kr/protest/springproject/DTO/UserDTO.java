package kr.protest.springproject.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long uid;
    private String name;
    private String email;
    private String password;
    private String role;
    private String key;
    private String cid;
    private String rank;
}

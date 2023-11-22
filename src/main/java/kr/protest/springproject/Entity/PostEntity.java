package kr.protest.springproject.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;
    private String title;
    private String content;
    @ManyToOne
    @JoinColumn(name="uid")
    private UsersEntity uid;
    private String date;
    private String category;
    private String tags;
}

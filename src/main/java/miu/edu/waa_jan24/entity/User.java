package miu.edu.waa_jan24.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "my_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;

    @OneToMany
    @JoinColumn(name = "user_id")
    List<Post> posts;

    public User (long id, String name, List<Post> posts) {
        this.id = id;
        this.name = name;
        this.posts = posts;
    }
}

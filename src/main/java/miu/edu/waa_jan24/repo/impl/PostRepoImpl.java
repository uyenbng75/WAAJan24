package miu.edu.waa_jan24.repo.impl;

import miu.edu.waa_jan24.entity.Post;
import miu.edu.waa_jan24.repo.PostRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepoImpl implements PostRepo {

    private static List<Post> posts;

    //Initial value
    private static int postId = 200;

    static {
        posts = new ArrayList<>();
        Post p1 = new Post(111, "How to master in Spring Boot", "I don't know", "Uyen");
        Post p2 = new Post(112, "Ask me why?", "Why ask me?", "Charlie");
        Post p3 = new Post(113, "Summer Vibes", "Now is winter", "Summer Haters");

        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
    }
    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public Post findById(long id) {
        return posts.stream()
                    .filter(p -> p.getId() == id)
                    .findFirst()
                    .orElse(null);
    }
    @Override
    public void save(Post p) {
        p.setId(postId);
        postId++;
        posts.add(p);
        System.out.println("Added successfully!");
    }
}

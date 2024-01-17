package miu.edu.waa_jan24.repo;

import miu.edu.waa_jan24.entity.Post;

import java.util.List;

public interface PostRepo {
    public List<Post> findAll();
    public Post findById(long id);
    public void save(Post p);
}

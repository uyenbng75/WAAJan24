package miu.edu.waa_jan24.service;

import miu.edu.waa_jan24.entity.Post;
import miu.edu.waa_jan24.entity.dto.response.PostDto;

import java.util.List;

public interface PostService {
    public List<Post> findAll();
    public PostDto findById(long id);
    public void save(PostDto p);
    public List<Post> findPostsHaveGivenTitle (String title);
}

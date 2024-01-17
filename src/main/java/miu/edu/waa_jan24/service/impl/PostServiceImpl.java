package miu.edu.waa_jan24.service.impl;

import miu.edu.waa_jan24.entity.Post;
import miu.edu.waa_jan24.entity.dto.response.PostDto;
import miu.edu.waa_jan24.repo.PostRepo;
import miu.edu.waa_jan24.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    //Call through Repo
    @Autowired
    PostRepo postRepo;
    @Override
    public List<Post> findAll() {
        return postRepo.findAll();
    }

    @Override
    public PostDto findById(long id) {
        var post = postRepo.findById(id);

        PostDto postDto =new PostDto();

        postDto.setTitle((post.getTitle()));
        postDto.setAuthor(post.getAuthor());

        return postDto;
    }

    @Override
    public void save(PostDto p) {
        Post dto = new Post();
        dto.setTitle(p.getTitle());
        dto.setAuthor(p.getAuthor());
        postRepo.save(dto);
    }
}

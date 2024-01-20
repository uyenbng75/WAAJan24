package miu.edu.waa_jan24.service.impl;

import miu.edu.waa_jan24.entity.Post;
import miu.edu.waa_jan24.entity.dto.response.PostDto;
import miu.edu.waa_jan24.repo.PostRepo;
import miu.edu.waa_jan24.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    //Call through Repo
    @Autowired
    PostRepo postRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<Post> findAll() {
        return postRepo.findAll();
    }

    @Override
    public PostDto findById(long id) {
//        var post = postRepo.findById(id);
//        PostDto postDto = new PostDto();
//        postDto.setTitle((post.getTitle()));
//        postDto.setAuthor(post.getAuthor());

        //wrap post with id to PostDto.class
        return modelMapper.map(postRepo.findById(id), PostDto.class);
    }

    @Override
    public void save(PostDto p) {
//        Post dto = new Post();
//        dto.setTitle(p.getTitle());
//        dto.setAuthor(p.getAuthor());
//        postRepo.save(dto);
        postRepo.save(modelMapper.map(p,Post.class));
    }

    @Override
    public List<Post> findPostsHaveGivenTitle(String title) {
        var posts = postRepo.findAll();
        List<Post> postsWithGivenTitle = new ArrayList<>();

        for (Post p : posts) {
            if (p.getTitle().contains(title)){
                postsWithGivenTitle.add(p);
            }
        }
        return  postsWithGivenTitle;
    }
}

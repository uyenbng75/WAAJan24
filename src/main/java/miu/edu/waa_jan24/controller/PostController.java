package miu.edu.waa_jan24.controller;

import miu.edu.waa_jan24.entity.Post;
import miu.edu.waa_jan24.entity.dto.response.PostDto;
import miu.edu.waa_jan24.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    public List<Post> findAll() {
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public PostDto findById(@PathVariable("id") long id){
        return postService.findById(id);
    }

    @PostMapping
    public void save (@RequestBody PostDto p){
        postService.save(p);
    }

    @GetMapping("/findPosts/{title}")
    public List<Post> findPostsHaveGivenTitle (@PathVariable("title") String title) {
        return  postService.findPostsHaveGivenTitle(title);
    }
}

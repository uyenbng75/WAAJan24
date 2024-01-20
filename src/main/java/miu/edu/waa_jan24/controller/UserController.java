package miu.edu.waa_jan24.controller;

import miu.edu.waa_jan24.entity.Post;
import miu.edu.waa_jan24.entity.User;
import miu.edu.waa_jan24.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") long id){
        return userService.findById(id);
    }
    @PostMapping
    public void saveUser(@RequestBody User u){
        userService.saveUser(u);
    }

    @GetMapping("{id}/posts")
    public List<Post> findPostsByUserId(@PathVariable("id") long id){
        return userService.findPostsByUserId(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") long id) {
        userService.deleteById(id);
    }

    @GetMapping("/moreThan/{count}")
    public List<User> findUserGreaterThanNPosts (@PathVariable("n") int n) {
        return userService.findUserGreaterThanNPosts(n);
    }
}

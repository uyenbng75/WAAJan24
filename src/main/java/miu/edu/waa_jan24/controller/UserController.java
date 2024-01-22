package miu.edu.waa_jan24.controller;

import miu.edu.waa_jan24.aspect.annotation.ExecutionTime;
import miu.edu.waa_jan24.aspect.annotation.LogMe;
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

    @LogMe
    @GetMapping
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @LogMe
    @GetMapping("/{id}")
    @ExecutionTime
    public User findById(@PathVariable("id") long id){
        return userService.findById(id);
    }

    @LogMe
    @PostMapping
    public void saveUser(@RequestBody User u){
        userService.saveUser(u);
    }

    @LogMe
    @GetMapping("{id}/posts")
    public List<Post> findPostsByUserId(@PathVariable("id") long id){
        return userService.findPostsByUserId(id);
    }

    @LogMe
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") long id) {
        userService.deleteById(id);
    }

    @LogMe
    @GetMapping("/moreThan/{count}")
    public List<User> findUserGreaterThanNPosts (@PathVariable("n") int n) {
        return userService.findUserGreaterThanNPosts(n);
    }
}

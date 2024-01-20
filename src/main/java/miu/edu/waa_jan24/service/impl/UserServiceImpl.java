package miu.edu.waa_jan24.service.impl;

import miu.edu.waa_jan24.entity.Post;
import miu.edu.waa_jan24.entity.User;
import miu.edu.waa_jan24.repo.PostRepo;
import miu.edu.waa_jan24.repo.UserRepo;
import miu.edu.waa_jan24.service.PostService;
import miu.edu.waa_jan24.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public void saveUser(User u) {
        userRepo.save(u);
    }

    @Override
    public List<Post> findPostsByUserId(long id) {
        var user = userRepo.findById(id).get();
        return user.getPosts();
    }

    @Override
    public void deleteById (long id) {
        userRepo.deleteById(id);
    }

    @Override
    public List<User> findUserGreaterThanNPosts(int n) {
        var users = userRepo.findAll();
        List<User> userWithNPost = new ArrayList<>();
        for (User u : users) {
            if (u.getPosts().size() > n) {
                userWithNPost.add(u);
            }
        }
        return userWithNPost;
    }
}

package miu.edu.waa_jan24.service;

import miu.edu.waa_jan24.entity.Post;
import miu.edu.waa_jan24.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<User> findAllUsers();
    public User findById(long id);
    public  void saveUser(User u);
    public List<Post> findPostsByUserId(long id);
}

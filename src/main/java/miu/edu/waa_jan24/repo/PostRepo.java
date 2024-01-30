package miu.edu.waa_jan24.repo;

import miu.edu.waa_jan24.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PostRepo extends JpaRepository<Post,Long> {

}

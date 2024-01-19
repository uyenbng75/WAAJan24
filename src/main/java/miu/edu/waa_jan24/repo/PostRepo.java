package miu.edu.waa_jan24.repo;

import miu.edu.waa_jan24.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post,Long> {

}

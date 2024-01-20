package miu.edu.waa_jan24.repo;

import miu.edu.waa_jan24.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {
}

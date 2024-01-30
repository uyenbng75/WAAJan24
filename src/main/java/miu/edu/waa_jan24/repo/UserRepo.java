package miu.edu.waa_jan24.repo;

import miu.edu.waa_jan24.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepo extends JpaRepository<User, Long> {
}

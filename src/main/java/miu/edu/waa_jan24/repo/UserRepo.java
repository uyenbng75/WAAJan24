package miu.edu.waa_jan24.repo;

import miu.edu.waa_jan24.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}

package miu.edu.waa_jan24.repo;

import miu.edu.waa_jan24.entity.Logger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface LoggerRepo extends JpaRepository<Logger, Long> {
}

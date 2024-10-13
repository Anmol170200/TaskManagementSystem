package tms.taskManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tms.taskManagementSystem.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

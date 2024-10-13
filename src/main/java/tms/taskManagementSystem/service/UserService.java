package tms.taskManagementSystem.service;

import org.springframework.http.ResponseEntity;
import tms.taskManagementSystem.entity.User;

public interface UserService {
    ResponseEntity<User> saveUser (User user);
    ResponseEntity<User> modifyUser(Long id);
    ResponseEntity<User> getUser(Long id);
    Boolean deleteUser(Long id);
}

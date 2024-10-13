package tms.taskManagementSystem.service;

import org.springframework.http.ResponseEntity;
import tms.taskManagementSystem.dto.UserDto;
import tms.taskManagementSystem.entity.User;

public interface UserService {
    UserDto saveUser (UserDto userDto);
    ResponseEntity<User> modifyUser(Long id,UserDto userDto);
    ResponseEntity<User> getUser(Long id);
    Boolean deleteUser(Long id);
}

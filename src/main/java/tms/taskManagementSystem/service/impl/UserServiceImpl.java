package tms.taskManagementSystem.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tms.taskManagementSystem.dto.UserDto;
import tms.taskManagementSystem.entity.User;
import tms.taskManagementSystem.mapper.UserMapper;
import tms.taskManagementSystem.repository.UserRepository;
import tms.taskManagementSystem.service.UserService;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User saveUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        return user;
    }

    @Override
    public ResponseEntity<User> modifyUser(Long id, UserDto userDto) {
        return null;
    }

    @Override
    public ResponseEntity<User> getUser(Long id) {
        return null;
    }

    @Override
    public Boolean deleteUser(Long id) {
        return null;
    }

}

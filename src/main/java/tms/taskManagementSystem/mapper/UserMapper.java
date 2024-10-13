package tms.taskManagementSystem.mapper;

import tms.taskManagementSystem.dto.UserDto;
import tms.taskManagementSystem.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getId(),
                user.getUserName(),
                user.getEmail(),
                user.getPassword(),
                user.getRoles()
        );
    }

    public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getId(),
                userDto.getUserName(),
                userDto.getEmail(),
                userDto.getPassword(),
                userDto.getRoles()
        );
    }
}

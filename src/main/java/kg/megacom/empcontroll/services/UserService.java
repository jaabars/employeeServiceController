package kg.megacom.empcontroll.services;

import kg.megacom.empcontroll.model.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);
    List<UserDto> getUserList();
    UserDto updateUser(UserDto userDto);
    UserDto findById(Long id);
}

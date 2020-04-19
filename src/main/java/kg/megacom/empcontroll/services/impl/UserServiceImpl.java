package kg.megacom.empcontroll.services.impl;

import kg.megacom.empcontroll.database.UserRepository;
import kg.megacom.empcontroll.mapper.ClassMapper;
import kg.megacom.empcontroll.model.domain.Position;
import kg.megacom.empcontroll.model.domain.User;
import kg.megacom.empcontroll.model.dto.UserDto;
import kg.megacom.empcontroll.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDto saveUser(UserDto userDto) {
        User user= ClassMapper.INSTANCE.userDtoToUser(userDto);
        user=userRepository.save(user);
        userDto=ClassMapper.INSTANCE.userToUserDto(user);
        return userDto;
    }

    @Override
    public List<UserDto> getUserList() {
        List<User> userList=userRepository.findAll();
        List<UserDto> userDtoList=ClassMapper.INSTANCE.userListToUserDtoList(userList);

        return userDtoList;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        User user=ClassMapper.INSTANCE.userDtoToUser(userDto);
        user=userRepository.save(user);
        userDto=ClassMapper.INSTANCE.userToUserDto(user);
        return userDto;

    }

    @Override
    public UserDto findById(Long id) {
        User user=userRepository.getOne(id);
        UserDto userDto=ClassMapper.INSTANCE.userToUserDto(user);
        return userDto;
    }
}

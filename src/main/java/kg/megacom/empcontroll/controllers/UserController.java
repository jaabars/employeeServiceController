package kg.megacom.empcontroll.controllers;

import io.swagger.annotations.Api;
import kg.megacom.empcontroll.model.dto.UserDto;
import kg.megacom.empcontroll.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = "Контрль пользователя", description ="Осуществляет функионал post,get,put")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public UserDto saveUser(@RequestBody UserDto userDto){
        userDto=userService.saveUser(userDto);
        return userDto;
    }
    @PutMapping("/update")
    public UserDto updateUser(@RequestBody UserDto userDto){
        return userService.updateUser(userDto);
    }
    @GetMapping("/list")
    public List<UserDto> getUsersList(){
        return userService.getUserList();
    }
    @GetMapping("/get/{id}")
    public UserDto getUserById(@PathVariable Long id){
        return userService.findById(id);
    }
}

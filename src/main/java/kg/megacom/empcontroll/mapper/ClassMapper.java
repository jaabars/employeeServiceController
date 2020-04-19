package kg.megacom.empcontroll.mapper;

import kg.megacom.empcontroll.model.domain.Position;
import kg.megacom.empcontroll.model.domain.User;
import kg.megacom.empcontroll.model.dto.PositionDto;
import kg.megacom.empcontroll.model.dto.UserDto;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface ClassMapper {
    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);

    Position positionDtoToPosition(PositionDto positionDto);
    PositionDto positionToPositionDto(Position position);
    List<PositionDto> positionListToPositionDtoList(List<Position> positionList);
    @Mapping(source = "positionDto",target = "position")
    User userDtoToUser(UserDto userDto);
    @Mapping(source = "position",target = "positionDto")
    UserDto userToUserDto(User user);
    List<UserDto> userListToUserDtoList(List<User> userList );

}

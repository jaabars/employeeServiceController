package kg.megacom.empcontroll.services;

import kg.megacom.empcontroll.model.dto.PositionDto;
import kg.megacom.empcontroll.model.dto.UserDto;

import java.util.List;

public interface PositionService {
    PositionDto saveUser(PositionDto positionDto);
    List<PositionDto> getPositionList();
    PositionDto updatePosition(PositionDto positionDto);
    PositionDto findById(Long id);
}

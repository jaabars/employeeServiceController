package kg.megacom.empcontroll.services.impl;

import kg.megacom.empcontroll.database.PositionRepository;
import kg.megacom.empcontroll.mapper.ClassMapper;
import kg.megacom.empcontroll.model.domain.Position;
import kg.megacom.empcontroll.model.dto.PositionDto;
import kg.megacom.empcontroll.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public PositionDto saveUser(PositionDto positionDto) {
        Position position= ClassMapper.INSTANCE.positionDtoToPosition(positionDto);
        position=positionRepository.save(position);
        positionDto=ClassMapper.INSTANCE.positionToPositionDto(position);

        return positionDto;
    }

    @Override
    public List<PositionDto> getPositionList() {
        List<Position> positionList=positionRepository.findAll();
        List<PositionDto> positionDtoList=ClassMapper.INSTANCE.positionListToPositionDtoList(positionList);

        return  positionDtoList;
    }

    @Override
    public PositionDto updatePosition(PositionDto positionDto) {
        Position position=ClassMapper.INSTANCE.positionDtoToPosition(positionDto);
        position=positionRepository.save(position);
        positionDto=ClassMapper.INSTANCE.positionToPositionDto(position);
        return positionDto;
    }

    @Override
    public PositionDto findById(Long id) {
        Position position=positionRepository.getOne(id);
        PositionDto positionDto=ClassMapper.INSTANCE.positionToPositionDto(position);
        return positionDto;
    }
}

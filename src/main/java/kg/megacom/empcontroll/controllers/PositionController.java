package kg.megacom.empcontroll.controllers;

import io.swagger.annotations.Api;
import kg.megacom.empcontroll.model.dto.PositionDto;
import kg.megacom.empcontroll.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
@RequestMapping("/position")
@Api(value = "Контроль позиций",description = "Осуществляет функционал post,get,update,getById")
public class PositionController {
    @Autowired
    private PositionService positionService;
    @PostMapping("/save")
    public PositionDto savePosition(@RequestBody PositionDto positionDto){
        return positionService.saveUser(positionDto);
    }
    @PutMapping("/update")
    public  PositionDto updatePosition(@RequestBody PositionDto positionDto){
        return positionService.saveUser(positionDto);
    }
    @GetMapping("/get")
    public List<PositionDto> getPositions(){
        return  positionService.getPositionList();
    }
    @GetMapping("getById/{id}")
    public PositionDto getById(@PathVariable Long id){
        return positionService.findById(id);
    }
}

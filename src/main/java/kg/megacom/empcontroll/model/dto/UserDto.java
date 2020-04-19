package kg.megacom.empcontroll.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserDto {
    private  Long id;
    @JsonProperty("empName")
    private String name;
     private boolean active;
     private int num;
     @JsonProperty("position")
     private PositionDto positionDto;
}

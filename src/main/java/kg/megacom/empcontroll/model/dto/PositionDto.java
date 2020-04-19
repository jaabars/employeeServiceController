package kg.megacom.empcontroll.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PositionDto {
    private Long id;
    @JsonProperty("position")
    private String name;
}

package kg.megacom.empcontroll.model.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private boolean active;
    private int num;
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;
}

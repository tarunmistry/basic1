package tarun.base.Basic1.domain;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data
@Entity
public class Symbol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ticker;
    private String description;
}

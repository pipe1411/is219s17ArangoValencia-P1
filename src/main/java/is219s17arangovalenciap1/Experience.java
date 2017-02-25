package is219s17arangovalenciap1;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by pipe on 2/18/17.
 */

@Entity
@Data
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String company;
    private String position;
    private String date;
    private String description;

    public Experience(String company, String position, String date, String description) {
        this.company = company;
        this.position = position;
        this.date = date;
        this.description = description;
    }

    public Experience() {

    }
}

package is219s17arangovalenciap1;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by pipe on 2/18/17.
 */

@Entity
@Data
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String objective;
    private String name;

    @OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="PERSON_ID")
    private Person person;

    public Resume(Person person, String objective, String name) {
        this.person = person;
        this.objective = objective;
        this.name = name;
    }

    public Resume(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

/*    public Person getPerson() {
        //return person;
    }

    public void setPerson(Person person) {
        //this.person = person;
    }*/
}


package is219s17arangovalenciap1;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by pipe on 2/18/17.
 */

@Entity
@Data
public class SkillDescriptions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String skillName;

    public SkillDescriptions(String skillName) {
        this.skillName = skillName;
    }

    public SkillDescriptions() {
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

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}

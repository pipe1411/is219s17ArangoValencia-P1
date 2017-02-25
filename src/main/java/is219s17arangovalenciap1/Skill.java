package is219s17arangovalenciap1;

import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * Created by pipe on 2/18/17.
 */

@Entity
@Data
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String skillType;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(targetEntity = SkillDescriptions.class, cascade = CascadeType.ALL)
    @JoinColumn(name="SKILLDESCRIPTIONS_ID")
    private List<SkillDescriptions> descriptions;

    public Skill(String skillType,List<SkillDescriptions> descriptions) {
        this.skillType = skillType;
        this.descriptions = descriptions;
    }

    public Skill() {
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

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    public List<SkillDescriptions> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<SkillDescriptions> descriptions) {
        this.descriptions = descriptions;
    }
}

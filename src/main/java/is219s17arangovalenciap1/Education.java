package is219s17arangovalenciap1;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by pipe on 2/18/17.
 */

@Entity
@Data
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String school;
    private String major;
    private String currentRank;
    private String graduationDate;
    private String gpa;

    public Education(String school, String major, String currentRank, String graduationDate, String gpa) {
        this.school = school;
        this.major = major;
        this.currentRank = currentRank;
        this.graduationDate = graduationDate;
        this.gpa = gpa;
    }

    public Education(){
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCurrentRank() {
        return currentRank;
    }

    public void setCurrentRank(String currentRank) {
        this.currentRank = currentRank;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }
}

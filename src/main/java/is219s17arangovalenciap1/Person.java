
package is219s17arangovalenciap1;

import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "PERSON")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String name;
    private String age;
    private String phoneNumber;
    private String address;
    private String email;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(targetEntity = Experience.class, cascade = CascadeType.ALL)
    private List<Experience> experiences;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(targetEntity = Education.class, cascade = CascadeType.ALL)
    private List<Education> educations;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(targetEntity = Skill.class, cascade = CascadeType.ALL)
    private List<Skill> skills;

    public Person(String name,String age, String phoneNumber, String address, String email,List<Experience> experiences, List<Education> educations, List<Skill> skills) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.experiences = experiences;
        this.educations = educations;
        this.skills = skills;
    }

    public Person(){

    }


}

/*
package is219s17arangovalenciap1;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

*/
/**
 * Created by pipe on 2/18/17.
 *//*


@Entity
@Data
@Table(name="PERSON")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String firstName;
    private String middleName;
    private String lastName;
    private String maidenName;
    private String age;
    private String phoneNumber;
    private String address;
    private String email;

    @OneToMany(targetEntity=Experience.class,  fetch=FetchType.EAGER)
    private List<Experience> experiences;
    @OneToMany(targetEntity=Education.class, fetch=FetchType.EAGER)
    private List<Education> educations;
    @OneToMany(targetEntity=Skill.class, fetch=FetchType.EAGER)
    private List<Skill> skills;

   public static class Builder {
       private String firstName;
       private String lastName;
       private String phoneNumber;
       private String email;

       private String middleName = "";
       private String maidenName = "";
       private String age = "";
       private String address = "";
       private List<Experience> experiences;
       private List<Education> educations;
       private List<Skill> skills;

       public Builder(String firstName, String lastName, String phoneNumber, String email) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.phoneNumber = phoneNumber;
           this.email = email;
       }

       public Builder middleName(String value) {
           middleName = value;
           return this;
       }
       public Builder maidenName(String value) {
           maidenName = value;
           return this;
       }

       public Builder age(String value) {
           age = value;
           return this;
       }

       public Builder address(String value) {
           address = value;
           return this;
       }

       public Builder skills(ArrayList value) {
           skills = value;
           return this;
       }

       public Builder experiences(ArrayList value) {
           experiences = value;
           return this;
       }

       public Builder educations(ArrayList value) {
           educations = value;
           return this;
       }

       public Person build() {
           return new Person(this);
       }

   }

   private Person(Builder builder) {
       firstName = builder.firstName;
       middleName = builder.middleName;
       lastName = builder.lastName;
       maidenName = builder.maidenName;
       age = builder.age;
       phoneNumber = builder.phoneNumber;
       address = builder.address;
       email = builder.email;
       educations = builder.educations;
       skills = builder.skills;
       experiences = builder.experiences;
   }
}
*/

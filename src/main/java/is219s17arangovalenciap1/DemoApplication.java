package is219s17arangovalenciap1;


import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class DemoApplication {

	private Logger log = Logger.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ResumeRepository repository) {
		return (args) -> {
			List<Experience>  experiences = new ArrayList<>();
			Experience experience = new Experience("United Parcel Service","Applications Developer Co-op","June 2015 - September 2015","Designed and implemented a Java multithreading batch process for DB2 using JDBC, WebSphere MQ, and stored procedures.");
			experiences.add(experience);
			experience = new Experience("United Parcel Service","Aplications Developer Co-op","January 2016 - December 2016","Worked on a Java daemon process analogous to an internal mainframe application using DB2, JDBC, WebSphere MQ, Spring.");
			experiences.add(experience);
			experience = new Experience("United Parcel Service","Aplications Developer Co-op","Current","Working on a new UPS application to create a business rules engine. Then end goal is to offload mainframe applications in order to reduce MIPS");
			experiences.add(experience);


			List<Education> educations = new ArrayList<>();
			Education education = new Education("New Jersey Institute of Technology","Bachelors of Science, Computer Science", "Senior","May 2017","3.5");
			educations.add(education);
			education = new Education("Essex County College","Associate of Science, Computer Science", "Graduate","May 2014","3.5");
			educations.add(education);

			List<Skill> skills = new ArrayList<>();
			List<SkillDescriptions> skillDescription = new ArrayList<>();
			SkillDescriptions sd = new SkillDescriptions("Java");
			skillDescription.add(sd);
			sd = new SkillDescriptions("C++");
			skillDescription.add(sd);

			sd = new SkillDescriptions("Python");
			skillDescription.add(sd);

			sd = new SkillDescriptions("PHP");
			skillDescription.add(sd);

			Skill skill = new Skill("Languages",skillDescription);
			skills.add(skill);


			//skillDescription = null;
			skillDescription = new ArrayList<>();
			sd = new SkillDescriptions("Spring");
			skillDescription.add(sd);

			sd = new SkillDescriptions("Websphere MQ");
			skillDescription.add(sd);

			sd = new SkillDescriptions("AMQ");
			skillDescription.add(sd);

			sd = new SkillDescriptions("Apache Camel");
			skillDescription.add(sd);

			skill = new Skill("Frameworks",skillDescription);
			skills.add(skill);

			//skillDescription = null;
			skillDescription = new ArrayList<>();
			sd = new SkillDescriptions("DB2");
			skillDescription.add(sd);

			sd = new SkillDescriptions("mySql");
			skillDescription.add(sd);

			sd = new SkillDescriptions("couchBase");
			skillDescription.add(sd);

			sd = new SkillDescriptions("H2");
			skillDescription.add(sd);

			sd = new SkillDescriptions("JDBC");
			skillDescription.add(sd);
			skill = new Skill("Database",skillDescription);
			skills.add(skill);

			//skillDescription = null;
			skillDescription = new ArrayList<>();
			sd = new SkillDescriptions("Linux");
			skillDescription.add(sd);

			sd = new SkillDescriptions("Windows");
			skillDescription.add(sd);
			skill = new Skill("Operating Systems",skillDescription);
			skills.add(skill);

			//skillDescription = null;
			skillDescription = new ArrayList<>();
			sd = new SkillDescriptions("Data Structures and Algorithm Design");
			skillDescription.add(sd);

			sd = new SkillDescriptions("Softwate Design");
			skillDescription.add(sd);

			sd = new SkillDescriptions("Linux Programming");
			skillDescription.add(sd);

			sd = new SkillDescriptions("Computer Networks");
			skillDescription.add(sd);

			sd = new SkillDescriptions("Operating Systems");
			skillDescription.add(sd);
			skill = new Skill("Major Courses",skillDescription);
			skills.add(skill);

			//skillDescription = null;
			skillDescription = new ArrayList<>();
			sd = new SkillDescriptions("HTML");
			skillDescription.add(sd);

			sd = new SkillDescriptions("CSS");
			skillDescription.add(sd);

			sd = new SkillDescriptions("JavaScript");
			skillDescription.add(sd);

			sd = new SkillDescriptions("Bootstrap");
			skillDescription.add(sd);

			skill = new Skill("Web Development",skillDescription);
			skills.add(skill);


			Person person = new Person("Andres F. Arango","20","(862) 520 71 07",
					"West Orange, New Jersey, 07052","afa29@njit.edu",experiences,educations,skills);
			Resume resume = new Resume(person,"to get a job", "andres arango");
			repository.save(resume);

			log.info("Saved resume - id " + resume.getId());
		};
	}
}

package id.learn.dynamicwhere;

import id.learn.dynamicwhere.entity.Student;
import id.learn.dynamicwhere.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DynamicWhereApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DynamicWhereApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		studentRepository.deleteAll();

		Student student1 = new Student();
		student1.setName("Budi");
		student1.setAge(26);
		student1.setAddress("BANDUNG");

		Student student2 = new Student();
		student2.setName("Djaka");
		student2.setAge(28);
		student2.setAddress("JAKARTA");

		Student student3 = new Student();
		student3.setName("Handoko");
		student3.setAge(21);
		student3.setAddress("BANDUNG");

		Student student4 = new Student();
		student4.setName("Turi");
		student4.setAge(28);
		student4.setAddress("BANDUNG");

		List<Student> mockStudentList = Arrays.asList(student1, student2, student3, student4);

		studentRepository.saveAll(mockStudentList);


	}
}

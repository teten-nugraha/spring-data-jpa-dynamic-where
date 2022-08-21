package id.learn.dynamicwhere;

import id.learn.dynamicwhere.entity.Student;
import id.learn.dynamicwhere.enums.KotaAddress;
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

		Student student1 = Student.builder()
				.name("Budi")
				.address("aSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"dhimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend")
				.age(26)
				.kotaAddress(KotaAddress.BANDUNG)
				.build();

		Student student2 = Student.builder()
				.name("Djaka")
				.address("bSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"chimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend")
				.age(28)
				.kotaAddress(KotaAddress.JAKARTA)
				.build();

		Student student3 = Student.builder()
				.name("Budi")
				.address("cSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"bhimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend")
				.age(21)
				.kotaAddress(KotaAddress.BANDUNG)
				.build();

		Student student4 = Student.builder()
				.name("Turu")
				.address("dSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"ahimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend")
				.age(28)
				.kotaAddress(KotaAddress.BANDUNG)
				.build();

		List<Student> mockStudentList = Arrays.asList(student1, student2, student3, student4);

		studentRepository.saveAll(mockStudentList);


	}
}

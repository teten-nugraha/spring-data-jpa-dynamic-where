package id.learn.dynamicwhere;

import id.learn.dynamicwhere.entity.Student;
import id.learn.dynamicwhere.enums.KotaAddress;
import id.learn.dynamicwhere.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DynamicWhereApplication implements CommandLineRunner {

	private final StudentRepository studentRepository;

	public DynamicWhereApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DynamicWhereApplication.class, args);
	}

	@Override
	public void run(String... args) {

		studentRepository.deleteAll();

		Student student1 = Student.builder()
				.name("Bubu")
				.address("aSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"dhimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend")
				.age(25)
				.kotaAddress(String.valueOf(KotaAddress.BANDUNG))
				.build();

		Student student2 = Student.builder()
				.name("Djaka")
				.address("bSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"chimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend")
				.age(28)
				.kotaAddress(String.valueOf(KotaAddress.JAKARTA))
				.build();

		Student student3 = Student.builder()
				.name("Budi")
				.address("cSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"bhimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend")
				.age(25)
				.kotaAddress(String.valueOf(KotaAddress.BANDUNG))
				.build();

		Student student4 = Student.builder()
				.name("Turu")
				.address("dSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"ahimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend")
				.age(25)
				.kotaAddress(String.valueOf(KotaAddress.BANDUNG))
				.build();

		Student student5 = Student.builder()
				.name("Maya")
				.address("vvvvdSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"avavavahimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend")
				.age(27)
				.kotaAddress(String.valueOf(KotaAddress.DEPOK))
				.build();

		Student student6 = Student.builder()
				.name("Dani")
				.address("zzzzzzxczxczxczxcdSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"azzzzzahzxczxczxcimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend")
				.age(29)
				.kotaAddress(String.valueOf(KotaAddress.BOGOR))
				.build();

		Student student7 = Student.builder()
				.name("DaniL")
				.address("ooooooooooooooodSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"zzzzzahimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend")
				.age(29)
				.kotaAddress(String.valueOf(KotaAddress.BOGOR))
				.build();

		Student student8 = Student.builder()
				.name("Itachi")
				.address("aaaaaaaaaaaadSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"aaaaaaaaaaaaaaaahimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend")
				.age(40)
				.kotaAddress(String.valueOf(KotaAddress.BANDUNG))
				.build();

		Student student9 = Student.builder()
				.name("Naruto")
				.address("bbbbbbbbbbdSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"zzzzzahimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend")
				.age(31)
				.kotaAddress(String.valueOf(KotaAddress.BANDUNG))
				.build();

		Student student10 = Student.builder()
				.name("Sasuke")
				.address("xxxxxxdSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
						"zzasdasdzzzahimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravidsda cubilia placerat eleifend")
				.age(30)
				.kotaAddress(String.valueOf(KotaAddress.BANDUNG))
				.build();

		List<Student> mockStudentList = Arrays.asList(student1,
				student2,
				student3,
				student4,
				student5,
				student6,
				student7,
				student8,
				student9,
				student10
		);

		studentRepository.saveAll(mockStudentList);


	}
}

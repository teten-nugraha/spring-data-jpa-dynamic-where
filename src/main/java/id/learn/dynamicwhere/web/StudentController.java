package id.learn.dynamicwhere.web;

import id.learn.dynamicwhere.entity.Student;
import id.learn.dynamicwhere.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Project Name     : dynamic-where
 * Date Time        : 6/10/2020
 *
 * @author Teten Nugraha
 */

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/withdynamicsearch")
    public List<Student> withDynamicSearch() {
        return studentService.findStudentsWithPredicate();
    }

}

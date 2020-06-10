package id.learn.dynamicwhere.service;

import id.learn.dynamicwhere.entity.Student;

import java.util.List;

/**
 * Project Name     : dynamic-where
 * Date Time        : 6/10/2020
 *
 * @author Teten Nugraha
 */

public interface StudentService {

    List<Student> findAll();
    List<Student> findStudentsWithPredicate();

}

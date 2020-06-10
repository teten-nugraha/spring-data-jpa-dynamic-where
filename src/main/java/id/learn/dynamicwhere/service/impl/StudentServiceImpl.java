package id.learn.dynamicwhere.service.impl;

import id.learn.dynamicwhere.entity.Student;
import id.learn.dynamicwhere.repository.StudentRepository;
import id.learn.dynamicwhere.searchSpec.GenericSpesification;
import id.learn.dynamicwhere.searchSpec.SearchCriteria;
import id.learn.dynamicwhere.searchSpec.SearchOperation;
import id.learn.dynamicwhere.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Project Name     : dynamic-where
 * Date Time        : 6/10/2020
 *
 * @author Teten Nugraha
 */

@Service
public class StudentServiceImpl implements StudentService {

    private static final String ADDRESS = "address";
    private static final String ADDRESS_VALUE = "BANDUNG";
    private static final String AGE = "age";
    private static final int AGE_VALUE = 25;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findStudentsWithPredicate() {

        /*
         * find Student which stay in BANDUNG and age greather than 25 years old
         */

        GenericSpesification genericSpesification = new GenericSpesification<Student>();
        genericSpesification.add(new SearchCriteria(ADDRESS, ADDRESS_VALUE, SearchOperation.EQUAL));
        genericSpesification.add(new SearchCriteria(AGE, AGE_VALUE, SearchOperation.GREATER_THAN));

        return studentRepository.findAll(genericSpesification);
    }
}

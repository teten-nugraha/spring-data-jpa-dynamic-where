package id.learn.dynamicwhere.service.impl;

import id.learn.dynamicwhere.entity.Student;
import id.learn.dynamicwhere.enums.SearchOperation;
import id.learn.dynamicwhere.repository.StudentRepository;
import id.learn.dynamicwhere.searchspec.GenericSpesification;
import id.learn.dynamicwhere.searchspec.SearchCriteria;
import id.learn.dynamicwhere.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Project Name: dynamic-where
 * Date Time: 6/10/2020
 *
 * @author Teten Nugraha
 */

@Service
@Slf4j
@Transactional
public class StudentServiceImpl implements StudentService {

    private static final String KOTA_ADDRESS = "kotaAddress";
    private static final String KOTA_ADDRESS_VALUE = "BANDUNG";
    private static final String AGE = "age";
    private static final String AGE_VALUE = "25";

    private final StudentRepository studentRepository;

    private final List<SearchCriteria> list;


    public StudentServiceImpl(StudentRepository studentRepository, List<SearchCriteria> list) {
        this.studentRepository = studentRepository;
        this.list = list;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findStudentsWithPredicate() {

        /*
         * find Students which stay in BANDUNG and age greater than 25 years old
         */

        GenericSpesification<Student> genericSpesification = new GenericSpesification<>(list);
        genericSpesification.add(new SearchCriteria(AGE, AGE_VALUE, SearchOperation.GREATER_THAN));
        genericSpesification.add(new SearchCriteria(KOTA_ADDRESS, KOTA_ADDRESS_VALUE, SearchOperation.EQUAL));

        return studentRepository.findAll(genericSpesification);
    }
}

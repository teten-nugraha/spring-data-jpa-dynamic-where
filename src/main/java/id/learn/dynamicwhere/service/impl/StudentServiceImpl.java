package id.learn.dynamicwhere.service.impl;

import id.learn.dynamicwhere.entity.Student;
import id.learn.dynamicwhere.repository.StudentRepository;
import id.learn.dynamicwhere.searchspec.GenericSpesification;
import id.learn.dynamicwhere.searchspec.SearchCriteria;
import id.learn.dynamicwhere.searchspec.SearchOperation;
import id.learn.dynamicwhere.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Project Name     : dynamic-where
 * Date Time        : 6/10/2020
 *
 * @author Teten Nugraha
 */

@Service
@Slf4j
@Transactional
public class StudentServiceImpl implements StudentService {

    private static final String ADDRESS = "address";
    private static final String ADDRESS_VALUE = "aSapien non sit rhoncus dictum quisque aliquet sed hendrerit class enim elit erat diam " +
            "dhimenaeos dictumst mi pretium ad aliquam in lectus letius ex gravida cubilia placerat eleifend";

    private static final String KOTA_ADDRESS = "kota_address";
    private static final String KOTA_ADDRESS_VALUE = "BANDUNG";
    private static final String AGE = "age";
    private static final Integer AGE_VALUE = 25;

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findStudentsWithPredicate() {

        /*
         * find Student which stay in BANDUNG and age greather than 25 years old
         */

        GenericSpesification<Student> genericSpesification = new GenericSpesification<>();
        genericSpesification.add(new SearchCriteria(ADDRESS, ADDRESS_VALUE, SearchOperation.EQUAL));
        genericSpesification.add(new SearchCriteria(KOTA_ADDRESS, KOTA_ADDRESS_VALUE, SearchOperation.EQUAL));
        genericSpesification.add(new SearchCriteria(AGE, AGE_VALUE, SearchOperation.GREATER_THAN));

        return studentRepository.findAll(genericSpesification);
    }
}

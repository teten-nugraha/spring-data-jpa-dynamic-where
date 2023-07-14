package id.learn.dynamicwhere.repository;

import id.learn.dynamicwhere.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Project Name: dynamic-where
 * Date Time: 6/10/2020
 *
 * @author Teten Nugraha
 */

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {
}

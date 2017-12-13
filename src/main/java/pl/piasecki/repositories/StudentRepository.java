package pl.piasecki.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.piasecki.domain.Student;

import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    //Long count();

}

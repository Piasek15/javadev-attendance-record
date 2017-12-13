package pl.piasecki.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.piasecki.domain.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {

}

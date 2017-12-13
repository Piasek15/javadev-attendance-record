package pl.piasecki.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.piasecki.domain.Attendance;

@Repository
public interface AttendanceRepository extends CrudRepository<Attendance, Long>{



}

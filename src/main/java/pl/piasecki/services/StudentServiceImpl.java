package pl.piasecki.services;

import org.springframework.stereotype.Service;
import pl.piasecki.domain.Student;
import pl.piasecki.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findOne(id);
    }
}

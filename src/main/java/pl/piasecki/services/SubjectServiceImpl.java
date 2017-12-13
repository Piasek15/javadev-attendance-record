package pl.piasecki.services;

import org.springframework.stereotype.Service;
import pl.piasecki.domain.Subject;
import pl.piasecki.repositories.SubjectRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<Subject> getAllSubjects() {
        List<Subject> subjects = new ArrayList<>();
        subjectRepository.findAll().forEach(subjects::add);
        return subjects;
    }

    @Override
    public Subject getSubject(Long id) {
        return subjectRepository.findOne(id);
    }

    @Override
    public void addSubject(Subject subject) {

    }

    @Override
    public void updateSubject(Long id, Subject subject) {

    }

    @Override
    public void deleteSubject(Long id) {

    }
}

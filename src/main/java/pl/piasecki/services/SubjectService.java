package pl.piasecki.services;

import pl.piasecki.domain.Subject;

import java.util.List;

public interface SubjectService {

    List<Subject> getAllSubjects();

    Subject getSubject(Long id);

    void addSubject(Subject subject);

    void updateSubject(Long id, Subject subject);

    void deleteSubject(Long id);
}

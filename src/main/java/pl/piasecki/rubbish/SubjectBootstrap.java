/*package pl.piasecki.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.piasecki.domain.Student;
import pl.piasecki.domain.Subject;
import pl.piasecki.repositories.StudentRepository;
import pl.piasecki.repositories.SubjectRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static java.util.Collections.addAll;

@Component
public class SubjectBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;

    public SubjectBootstrap(StudentRepository studentRepository, SubjectRepository subjectRepository) {
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        subjectRepository.save(getSubjects());
    }


    private List<Subject> getSubjects() {

        List<Subject> subjects = new ArrayList<>();

        List<Student> students = new ArrayList<>();
        for (long i = 1; i<=studentRepository.count(); i++) {
            students.add(studentRepository.findOne(i));
        }

        Subject subject1 = new Subject();
        subject1.setTopic("java");
        subject1.setDescription("rzeszow1");
        subject1.getStudents().addAll(students);
        subjects.add(subject1);

        Subject subject2 = new Subject();
        subject2.setTopic("spring-boot");
        subject2.setDescription("rzeszow2");
        subject2.getStudents().addAll(students);
        subjects.add(subject2);

        return subjects;
    }

}
*/

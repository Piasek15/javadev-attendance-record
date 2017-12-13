package pl.piasecki.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import pl.piasecki.domain.Student;
import pl.piasecki.domain.Subject;
import pl.piasecki.repositories.StudentRepository;
import pl.piasecki.repositories.SubjectRepository;

import java.util.ArrayList;
import java.util.List;


public class SubjectBootstrap implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;

    @Autowired
    public SubjectBootstrap(StudentRepository studentRepository, SubjectRepository subjectRepository) {
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        System.out.println("bean 1 loaded");

        List<Subject> subjects = new ArrayList<>();

        List<Student> students = new ArrayList<>();
        for (long i = 1; i <= studentRepository.count(); i++) {
            students.add(studentRepository.findOne(i));
        }

        // 1. Java
        Subject subject1 = new Subject();
        subject1.setTopic("java");
        subject1.setDescription("rzeszow1");
        subject1.getStudents().addAll(students);
        subjects.add(subject1);

        // 2. Spring Boot
        Subject subject2 = new Subject();
        subject2.setTopic("spring-boot");
        subject2.setDescription("rzeszow2");
        subject2.getStudents().addAll(students);
        subjects.add(subject2);

        subjectRepository.save(subjects);
    }


}
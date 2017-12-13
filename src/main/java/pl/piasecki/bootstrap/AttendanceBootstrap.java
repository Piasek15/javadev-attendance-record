package pl.piasecki.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import pl.piasecki.domain.Attendance;
import pl.piasecki.domain.Subject;
import pl.piasecki.repositories.AttendanceRepository;
import pl.piasecki.repositories.StudentRepository;
import pl.piasecki.repositories.SubjectRepository;

import java.util.ArrayList;
import java.util.List;


public class AttendanceBootstrap implements CommandLineRunner {

    private AttendanceRepository attendanceRepository;
    private StudentRepository studentRepository;
    private SubjectRepository subjectRepository;

    public AttendanceBootstrap(AttendanceRepository attendanceRepository, StudentRepository studentRepository, SubjectRepository subjectRepository) {
        this.attendanceRepository = attendanceRepository;
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        System.out.println("bean 2 loaded");

        int subjectRepositorySize = (int) subjectRepository.count();

        List<Attendance> attendances = new ArrayList<>(subjectRepositorySize);

        attendances.add(new Attendance(false, subjectRepository.findOne(1L), studentRepository.findOne(1L)));

        System.out.println("subjects size: " + subjectRepositorySize);
        System.out.println("attendances size : " + attendances.size());

        attendanceRepository.save(attendances);
    }
}

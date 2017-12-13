package pl.piasecki.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import pl.piasecki.bootstrap.AttendanceBootstrap;
import pl.piasecki.bootstrap.SubjectBootstrap;
import pl.piasecki.repositories.AttendanceRepository;
import pl.piasecki.repositories.StudentRepository;
import pl.piasecki.repositories.SubjectRepository;

@Configuration
public class Config {

    @Bean("1")
    public SubjectBootstrap subjectBootstrap(StudentRepository studentRepository, SubjectRepository subjectRepository) {
        return new SubjectBootstrap(studentRepository, subjectRepository);
    }

    @Bean("2")
    @DependsOn("1")
    public AttendanceBootstrap attendanceBootstrap(AttendanceRepository attendanceRepository, StudentRepository studentRepository, SubjectRepository subjectRepository){
        return new AttendanceBootstrap(attendanceRepository, studentRepository, subjectRepository);
    }

}

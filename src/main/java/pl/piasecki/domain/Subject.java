package pl.piasecki.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String topic;
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Attendance> attendances;

    @ManyToMany
    @JoinTable(name = "subject_student",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private Set<Student> students = new HashSet<>();

    public Subject() {
    }

    public Subject(String topic, String description) {
        this.topic = topic;
        this.description = description;
    }

    public Subject(String topic, String description, Set<Student> students) {
        this.topic = topic;
        this.description = description;
        this.students = students;
    }
}

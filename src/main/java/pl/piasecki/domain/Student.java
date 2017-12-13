package pl.piasecki.domain;






import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Attendance> attendances;

    @ManyToMany(mappedBy = "students")
    private Set<Subject> subjects = new HashSet<>();

    public Student() {
    }

    public Student(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Student(String name, String surname, String email, Set<Subject> subjects) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.subjects = subjects;
    }

}

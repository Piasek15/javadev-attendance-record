package pl.piasecki.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Attendance {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Boolean wasPresent;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Subject subject;

    public Attendance() {
    }

    public Attendance(Boolean wasPresent) {
        this.wasPresent = wasPresent;
    }

    public Attendance(Boolean wasPresent, Subject subject, Student student) {
        this.wasPresent = wasPresent;
        this.subject = subject;
        this.student = student;
    }

    public Boolean getWasPresent() {
        return wasPresent;
    }

    public void setWasPresent(Boolean wasPresent) {
        this.wasPresent = wasPresent;
    }
}

package springprojects.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "competitors")
public class Competitor {
    @Id
    @GeneratedValue
    private int id;
    @Column (name = "first_name")
    private String firstName;
    @Column (name = "last_name")
    private String lastName;
    @Column (name = "country")
    private String country;
    @Column
    @OneToMany(mappedBy = "competitor")
    private List<Evaluation> evaluation;

    @Transient
    private double totalRate;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    public Competitor (){}

    public Competitor(String firstName, String lastName, String country, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.gender = gender;
    }

}

package springprojects.dto;

import lombok.Getter;
import lombok.Setter;
import springprojects.entities.Gender;
@Getter
@Setter
public class CompetitorRequest {
    private String firstName;
    private String lastName;
    private String country;
    private Gender gender;
}

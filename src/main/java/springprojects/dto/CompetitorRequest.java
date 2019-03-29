package springprojects.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import springprojects.entities.Gender;
@Getter
@Setter
public class CompetitorRequest {

    private String firstName;

    private String lastName;
    /*@JsonProperty(required = true)*/
    private String country;

    private Gender gender;
}

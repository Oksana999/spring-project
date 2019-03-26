package springprojects.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompetitorResponse {
    private ResponseCode responseCode;
    private String message;

    public CompetitorResponse(ResponseCode responseCode, String message) {
        this.responseCode = responseCode;
        this.message = message;
    }
}

package springprojects.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springprojects.dto.*;
import springprojects.entities.Competitor;
import springprojects.entities.Evaluation;
import springprojects.services.CompetitorService;
import springprojects.services.EvaluationService;

import java.io.IOException;
import java.util.Optional;

@RestController
public class ApiController {
    @Autowired
    CompetitorService competitorService;
    @Autowired
    EvaluationService evaluationService;
    @GetMapping("/")
    public String hello (){
        return "Hello";
    }

    @PostMapping ("/createCompetitor")
    public ApiResponse createCompetitor (@RequestBody CompetitorRequest competitorRequest){
      /*  ObjectMapper mapper = new ObjectMapper();
        try {
            CompetitorRequest request = mapper.readValue("123",CompetitorRequest.class);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        Competitor competitor = new Competitor(competitorRequest.getFirstName(), competitorRequest.getLastName(),
                competitorRequest.getCountry(), competitorRequest.getGender());

        competitorService.createCompetitor(competitor);

        return new ApiResponse(ResponseCode.SUCCESS,"Competitor has been successfully created");
    }

    @PostMapping("/evaluate")
    public ApiResponse createEvaluation (@RequestBody EvaluationRequest evaluationRequest){
        Optional<Evaluation> evaluation = evaluationService.createEvaluation(evaluationRequest.getCompetitorId(), evaluationRequest.getValue());
        if(evaluation.isPresent()){
            return new ApiResponse(ResponseCode.SUCCESS,"Evaluation has been successfully created");
        }else{
            return new ApiResponse(ResponseCode.FAIL,"Something is wrong");
        }

    }
}

package springprojects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springprojects.dto.CompetitorRequest;
import springprojects.dto.CompetitorResponse;
import springprojects.entities.Competitor;
import springprojects.dto.ResponseCode;
import springprojects.services.CompetitorService;

@RestController
public class ApiController {
    @Autowired
    CompetitorService competitorService;
    @GetMapping("/")
    public String hello (){
        return "Hello";
    }

    @PostMapping ("/createCompetitor")
    public CompetitorResponse createCompetitor (@RequestBody CompetitorRequest competitorDto){

        Competitor competitor = new Competitor(competitorDto.getFirstName(), competitorDto.getLastName(),
                competitorDto.getCountry(), competitorDto.getGender());

        competitorService.createCompetitor(competitor);

        return new CompetitorResponse(ResponseCode.SUCCESS,"Competitor has been successfully created");


    }
}

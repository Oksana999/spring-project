package springprojects.services;

import springprojects.dto.EvaluationRequest;
import springprojects.entities.Evaluation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface EvaluationService {
    public Optional<Evaluation> createEvaluation (int competitorId, double value);
   // public List<Evaluation> evaluations (int competitorId);

}

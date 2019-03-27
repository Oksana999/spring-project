package springprojects.services;

import springprojects.dto.EvaluationRequest;
import springprojects.entities.Evaluation;

import java.util.Optional;

public interface EvaluationService {
    public Optional<Evaluation> createEvaluation (int competitorId, double value);
}

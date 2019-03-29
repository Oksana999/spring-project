package springprojects.services;

import springprojects.entities.Competitor;
import springprojects.entities.Evaluation;

import java.util.List;
import java.util.Optional;

public interface CompetitorService {
    public void createCompetitor(Competitor competitor);
    public Optional<Competitor> findById (int competitorId);
//    public List<Evaluation> evaluations (Evaluation evaluation);
}

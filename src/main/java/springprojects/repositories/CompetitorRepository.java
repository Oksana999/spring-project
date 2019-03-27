package springprojects.repositories;

import springprojects.entities.Competitor;

import java.util.Optional;

public interface CompetitorRepository {
    public void createCompetitor (Competitor competitor);
    public Optional<Competitor> findById (int competitorId);

}

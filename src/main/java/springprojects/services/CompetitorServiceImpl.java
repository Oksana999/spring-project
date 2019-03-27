package springprojects.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springprojects.entities.Competitor;
import springprojects.repositories.CompetitorRepository;

import java.util.Optional;

@Service
public class CompetitorServiceImpl implements CompetitorService {
    @Autowired
    private CompetitorRepository competitorRepository;
    @Override
    public void createCompetitor(Competitor competitor) {
        competitorRepository.createCompetitor(competitor);

    }

    @Override
    public Optional<Competitor> findById(int competitorId) {

        return competitorRepository.findById(competitorId);
    }


}

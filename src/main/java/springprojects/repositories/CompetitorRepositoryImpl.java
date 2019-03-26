package springprojects.repositories;

import org.springframework.stereotype.Repository;
import springprojects.entities.Competitor;
import springprojects.entities.Gender;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CompetitorRepositoryImpl implements CompetitorRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createCompetitor(Competitor competitor) {
        //entityManager.createQuery("SELECT FROM Competitor where gender :=type").setParameter(Gender.MALE)
        entityManager.persist(competitor);

    }
}

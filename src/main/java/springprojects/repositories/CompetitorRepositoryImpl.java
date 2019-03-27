package springprojects.repositories;

import org.springframework.stereotype.Repository;
import springprojects.entities.Competitor;
import springprojects.entities.Gender;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    @Override
    public Optional<Competitor> findById(int competitorId) {
        /*return Optional.of(entityManager.createQuery("SELECT from Competitor where id = :id", Competitor.class)
                .setParameter("id", competitorId).getResultList().get(0));*/

        return entityManager.createQuery("SELECT c from Competitor c where id = :id", Competitor.class)
                .setParameter("id", competitorId).getResultStream().findAny();
        /*List<String> list = new ArrayList();
        List<String> newList = list.stream().filter(x->x.contains("123")).collect(Collectors.toList());*/

        //return Optional.empty();
    }
}

package springprojects.repositories;

import org.springframework.stereotype.Repository;
import springprojects.entities.Competitor;
import springprojects.entities.Evaluation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EvaluationRepositoryImpl implements EvaluationRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void createEvaluation(Evaluation evaluation) {
        entityManager.persist(evaluation);


    }

    @Override
    public List<Evaluation> evaluations(int competitorId) {


        return entityManager
                .createQuery("SELECT e from Evaluation e where competitor_id = :id ",Evaluation.class)
                .setParameter("id", competitorId).getResultList();
    }
}

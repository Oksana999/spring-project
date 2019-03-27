package springprojects.repositories;

import org.springframework.stereotype.Repository;
import springprojects.entities.Evaluation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class EvaluationRepositoryImpl implements EvaluationRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void createEvaluation(Evaluation evaluation) {
        entityManager.persist(evaluation);


    }
}

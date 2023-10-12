package DAO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import model.JavaWebLearn_liststudent;

public class StudentDao {
    @PersistenceContext
    private EntityManager entityManager;

    public JavaWebLearn_liststudent findById(Long id) {
        return entityManager.find(JavaWebLearn_liststudent.class, id);
    }

    public List<JavaWebLearn_liststudent> findAll() {
        return entityManager.createQuery("SELECT s FROM JavaWebLearn_liststudent s", JavaWebLearn_liststudent.class).getResultList();
    }

    @Transactional
    public void save(JavaWebLearn_liststudent sinhVien) {
        entityManager.persist(sinhVien);
    }
}

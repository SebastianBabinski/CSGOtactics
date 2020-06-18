package babinski.sebastian.dao;

import babinski.sebastian.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.sql.*;

@Repository
@Transactional
public class UserDao {

    @PersistenceContext
    EntityManager entityManager;

    public void save(User entity) {
        entityManager.persist(entity);
    }

    public void update(User entity) {
        entityManager.merge(entity);
    }

    public User getById(long id) {
        return entityManager.find(User.class, id);
    }

    public void deleteById(long id) {
        User entity = getById(id);
        if (entity != null) {
            entityManager.remove(entity);
        }
    }
}

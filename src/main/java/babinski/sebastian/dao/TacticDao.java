package babinski.sebastian.dao;

import babinski.sebastian.model.Tactic;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TacticDao {

    @PersistenceContext
    EntityManager entityManager;

    public void save(Tactic entity) {
        entityManager.persist(entity);
    }

    public void update(Tactic entity) {
        entityManager.merge(entity);
    }

    public Tactic getById(long id) {
        return entityManager.find(Tactic.class, id);
    }

    public void deleteById(long id) {
        Tactic entity = getById(id);
        if (entity != null) {
            entityManager.remove(entity);
        }
    }

    public List<Tactic> getAllTactics() {
        return entityManager.createQuery("select t from Tactic t").getResultList();
    }

    public List<Tactic> getAllDust2Tactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map = 'dust2'").getResultList();
    }

    public List<Tactic> getAllDust2CtTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='dust2' and tactic_side='ct'").getResultList();
    }

    public List<Tactic> getAllDust2TerroTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='dust2' and tactic_side='terro'").getResultList();
    }

    public List<Tactic> getAllInfernoTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map = 'inferno'").getResultList();
    }

    public List<Tactic> getAllInfernoCtTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='inferno' and tactic_side='ct'").getResultList();
    }

    public List<Tactic> getAllInfernoTerroTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='inferno' and tactic_side='terro'").getResultList();
    }

    public List<Tactic> getAllMirageTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map = 'mirage'").getResultList();
    }

    public List<Tactic> getAllMirageCtTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='mirage' and tactic_side='ct'").getResultList();
    }

    public List<Tactic> getAllMirageTerroTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='mirage' and tactic_side='terro'").getResultList();
    }

    public List<Tactic> getAllNukeTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map = 'nuke'").getResultList();
    }

    public List<Tactic> getAllNukeCtTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='nuke' and tactic_side='ct'").getResultList();
    }

    public List<Tactic> getAllNukeTerroTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='nuke' and tactic_side='terro'").getResultList();
    }

    public List<Tactic> getAllOverpassTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map = 'overpass'").getResultList();
    }

    public List<Tactic> getAllOverpassCtTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='overpass' and tactic_side='ct'").getResultList();
    }

    public List<Tactic> getAllOverpassTerroTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='overpass' and tactic_side='terro'").getResultList();
    }

    public List<Tactic> getAllTrainTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map = 'train'").getResultList();
    }

    public List<Tactic> getAllTrainCtTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='train' and tactic_side='ct'").getResultList();
    }

    public List<Tactic> getAllTrainTerroTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='train' and tactic_side='terro'").getResultList();
    }
    public List<Tactic> getAllVertigoTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map = 'vertigo'").getResultList();
    }

    public List<Tactic> getAllVertigoCtTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='vertigo' and tactic_side='ct'").getResultList();
    }

    public List<Tactic> getAllVertigoTerroTactics() {
        return entityManager.createQuery("select t FROM Tactic t where tactic_map='vertigo' and tactic_side='terro'").getResultList();
    }
}

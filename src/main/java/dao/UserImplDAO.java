package dao;

import Utils.HibernateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;
import model.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.query.Query;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dev
 */
public class UserImplDAO implements UserDAO {

    @Override
    public void createUser(User u) {
        Transaction ts = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            ts = session.beginTransaction(); //siempre hay que ponerle esto para iniciar las transacciones
            session.persist(u);//esto es para el insert
            ts.commit();//y esto cuando queremos acabarlo
        } catch (HibernateException he) {
            if (ts != null) {
                ts.rollback(); //para volver atrás, se pone en el catch no en el finally
            }
            System.err.println(he);
        }
    }

    @Override
    public void addSkill(String skillName) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(skillName);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println(e.getMessage());
        }
    }

    @Override
    public List<AcademicInfo> getUserAcademicInfo(User u) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<AcademicInfo> cr = cb.createQuery(AcademicInfo.class);
            Root<AcademicInfo> root = cr.from(AcademicInfo.class);
            Join<AcademicInfo, User> academicInfoUserJoin = root.join("academicInfos");
            cr.where(cb.equal(academicInfoUserJoin, u));
            return session.createQuery(cr).getResultList();
        } catch (HibernateException hibernateException) {
            System.err.println(hibernateException.getMessage());
            return null;
        }
    }

    @Override
    public void removeUser(User u) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            User user = session.get(User.class, u);
            if (user != null) {
                session.remove(user);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println(e.getMessage());
        }
    }

    @Override
    public User getUser(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> query = cb.createQuery(User.class);
            Root<User> root = query.from(User.class);
            query.where(cb.equal(root.get("id"), id));
            return session.createQuery(query).getSingleResult();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Skill> getUserSkills(User u) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Skill> cr = cb.createQuery(Skill.class);
            Root<Skill> root = cr.from(Skill.class);
            Join<Skill, User> academicInfoUserJoin = root.join("skills");
            cr.where(cb.equal(academicInfoUserJoin, u));
            return session.createQuery(cr).getResultList();
        } catch (HibernateException hibernateException) {
            System.err.println(hibernateException.getMessage());
            return null;
        }
    }

    @Override
    public List<Candidature> getUserCandidatures(User u) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Candidature> cr = cb.createQuery(Candidature.class);
            Root<Candidature> root = cr.from(Candidature.class);
            Join<Candidature, User> academicInfoUserJoin = root.join("candidatures");//Preguntar esta y la de arriba al profe por dios
            cr.where(cb.equal(academicInfoUserJoin, u));
            return session.createQuery(cr).getResultList();
        } catch (HibernateException hibernateException) {
            System.err.println(hibernateException.getMessage());
            return null;
        }
    }

    @Override
    public List<User> getUsersByName(String name) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cr = cb.createQuery(User.class);
            Root<User> root = cr.from(User.class);
            cr.where(cb.equal(root.get("nombre"), name));
            return session.createQuery(cr).getResultList();
        } catch (HibernateException hibernateException) {
            System.err.println(hibernateException.getMessage());
            return null;
        }
    }

    @Override
    public void updateUser(User u) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.merge(u);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.err.println(e);
        }
    }

    @Override
    public List<LaboralExperience> getUserLaboralExperience(User u) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<LaboralExperience> cr = cb.createQuery(LaboralExperience.class);
            Root<LaboralExperience> root = cr.from(LaboralExperience.class);
            Join<LaboralExperience, User> academicInfoUserJoin = root.join("laboralExperiences");//Hay que poner el nombre de la lista
            cr.where(cb.equal(academicInfoUserJoin, u));
            return session.createQuery(cr).getResultList();
        } catch (HibernateException hibernateException) {
            System.err.println(hibernateException.getMessage());
            return null;
        }
    }

    @Override
    public User getUserByName(String name) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> query = cb.createQuery(User.class);
            Root<User> root = query.from(User.class);
            query.where(cb.equal(root.get("name"), name));
            return session.createQuery(query).getSingleResult();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public User inicioUser(String nombre, String password) {
        Transaction transaction = null;
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession();) {
            transaction = session.beginTransaction();

            Query<User> query = session.createQuery("FROM User WHERE nombre = :nombre AND password = :password");
            query.setParameter("nombre", nombre);
            query.setParameter("password", password);
            user = query.uniqueResult();

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        }
        return user;
    }

    @Override
    public List<Skill> getUserSkillsByName(String name) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Skill> cr = cb.createQuery(Skill.class);
            Root<Skill> root = cr.from(Skill.class);
            Join<Skill, User> academicInfoUserJoin = root.join("users");
            cr.where(cb.equal(academicInfoUserJoin.get("nombre"), name));
            return session.createQuery(cr).getResultList();
        } catch (HibernateException hibernateException) {
            System.err.println(hibernateException.getMessage());
            return null;
        }
    }

    @Override
    public List<LaboralExperience> getUserLaboralExperience(String name) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<LaboralExperience> cr = cb.createQuery(LaboralExperience.class);
            Root<LaboralExperience> root = cr.from(LaboralExperience.class);
            Join<LaboralExperience, User> academicInfoUserJoin = root.join("user");
            cr.where(cb.equal(academicInfoUserJoin.get("nombre"), name));
            return session.createQuery(cr).getResultList();
        } catch (HibernateException hibernateException) {
            System.err.println(hibernateException.getMessage());
            return null;
        }
    }

    @Override
    public List<AcademicInfo> getUserAcademic(String name) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<AcademicInfo> cr = cb.createQuery(AcademicInfo.class);
            Root<AcademicInfo> root = cr.from(AcademicInfo.class);
            Join<AcademicInfo, User> academicInfoUserJoin = root.join("user");
            cr.where(cb.equal(academicInfoUserJoin.get("nombre"), name));
            return session.createQuery(cr).getResultList();
        } catch (HibernateException hibernateException) {
            System.err.println(hibernateException.getMessage());
            return null;
        }
    }

    @Override
    public User getByUser(User u) {
         try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> query = cb.createQuery(User.class);
            Root<User> userTable = query.from(User.class);
            query.where(cb.equal(userTable.get("nombre"), u.getNombre()));
            return session.createQuery(query).getSingleResult();
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

  

}

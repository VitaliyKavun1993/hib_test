package dao;

import domain.User;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import util.HibernateUtil;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    private HibernateTemplate hibernateTemplate;



    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    public List<User> getListOfUsers() {
        return null;
    }

    public void saveUser(User user) {

    }
}

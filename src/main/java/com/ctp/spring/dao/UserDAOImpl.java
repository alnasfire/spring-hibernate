package com.ctp.spring.dao;

import com.ctp.spring.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author ctp.com
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

//    @SuppressWarnings("unchecked")
//	public List<User> userList() {
//        return sessionFactory.getCurrentSession().getNamedQuery( User.NamedQuery.USER_FIND_ALL ).list();
//    }

//    public void removeUser(Long id) {
//        User user = (User) sessionFactory.getCurrentSession().load(
//                User.class, id);
//        if (null != user) {
//            sessionFactory.getCurrentSession().delete(user);
//        }
//    }
}
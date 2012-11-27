package com.ctp.spring.dao;

import com.ctp.spring.domain.Test;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestDAOImpl implements TestDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveTest(Test test) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Test> readTestByQuastionId(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteTestById(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateTestById(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

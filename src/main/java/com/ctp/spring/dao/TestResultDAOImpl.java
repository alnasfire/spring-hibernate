package com.ctp.spring.dao;

import com.ctp.spring.domain.TestResult;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestResultDAOImpl implements TestResultDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveResult(TestResult result) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<TestResult> readResultsByUserId(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

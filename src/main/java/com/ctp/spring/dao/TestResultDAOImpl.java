package com.ctp.spring.dao;

import com.ctp.spring.domain.TestResult;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestResultDAOImpl implements TestResultDAO{
    @Override
    public void saveResult(TestResult result) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<TestResult> readResultsByUserId(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

package com.ctp.spring.dao;

import com.ctp.spring.domain.TestState;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestStateDAOImpl implements TestStateDAO{
    @Override
    public void saveTestState(TestState state) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<TestState> readTestStateByTestId(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteTestStateById(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateTestStateById(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

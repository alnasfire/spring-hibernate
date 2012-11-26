package com.ctp.spring.dao;

import com.ctp.spring.domain.TestState;

import java.util.List;

public interface TestStateDAO {
    public void saveTestState(TestState state);

    public List<TestState> readTestStateByTestId(Integer id);

    public void deleteTestStateById(Integer id);

    public void updateTestStateById(Integer id);
}

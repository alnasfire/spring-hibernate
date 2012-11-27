package com.ctp.spring.service;

import com.ctp.spring.domain.TestState;

import java.util.List;

public interface TestStateService {
    public void saveTestState(TestState testState);

    public List<TestState> testStateList();

    public void removeTestStateById(Long id);

    public TestState retriveTestById(Long id);

    public List<TestState> findTestByUserId(Integer id);
}

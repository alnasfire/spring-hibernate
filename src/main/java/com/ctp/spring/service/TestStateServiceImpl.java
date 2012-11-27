package com.ctp.spring.service;

import com.ctp.spring.domain.TestState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestStateServiceImpl implements TestStateService{
    @Override
    public void saveTestState(TestState testState) {

    }

    @Override
    public List<TestState> testStateList() {
        return null;
    }

    @Override
    public void removeTestStateById(Long id) {

    }

    @Override
    public TestState retriveTestById(Long id) {
        return null;
    }

    @Override
    public List<TestState> findTestByUserId(Integer id) {
        return null;
    }
}

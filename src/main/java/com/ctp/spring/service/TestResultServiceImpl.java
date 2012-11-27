package com.ctp.spring.service;

import com.ctp.spring.domain.TestResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestResultServiceImpl implements TestResultService{
    @Override
    public void saveResult(TestResult result) {

    }

    @Override
    public List<TestResult> resultsList() {
        return null;
    }

    @Override
    public void removeResultById(Long id) {

    }

    @Override
    public TestResult retriveResultById(Long id) {
        return null;
    }

    @Override
    public List<TestResult> findResultByUserId(Integer id) {
        return null;
    }
}

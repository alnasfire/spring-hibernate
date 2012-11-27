package com.ctp.spring.service;

import com.ctp.spring.domain.TestResult;

import java.util.List;

public interface TestResultService {
    public void saveResult(TestResult result);

    public List<TestResult> resultsList();

    public void removeResultById(Long id);

    public TestResult retriveResultById(Long id);

    public List<TestResult> findResultByUserId(Integer id);
}

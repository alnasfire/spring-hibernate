package com.ctp.spring.dao;

import com.ctp.spring.domain.TestResult;

import java.util.List;

public interface TestResultDAO {
    public void saveResult(TestResult result);

    public List<TestResult> readResultsByUserId(Integer id);
}

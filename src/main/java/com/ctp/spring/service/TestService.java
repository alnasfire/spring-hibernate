package com.ctp.spring.service;

import com.ctp.spring.domain.Test;

import java.util.List;

public interface TestService {
    public void saveTest(Test test);

    public List<Test> testList();

    public void removeTestById(Long id);

    public Test retriveTestById(Long id);

    public List<Test> findTestByUserId(Integer id);
}

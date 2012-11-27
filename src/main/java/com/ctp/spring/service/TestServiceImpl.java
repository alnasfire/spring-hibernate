package com.ctp.spring.service;

import com.ctp.spring.domain.Test;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{
    @Override
    public void saveTest(Test test) {

    }

    @Override
    public List<Test> testList() {
        return null;
    }

    @Override
    public void removeTestById(Long id) {

    }

    @Override
    public Test retriveTestById(Long id) {
        return null;
    }

    @Override
    public List<Test> findTestByUserId(Integer id) {
        return null;
    }
}

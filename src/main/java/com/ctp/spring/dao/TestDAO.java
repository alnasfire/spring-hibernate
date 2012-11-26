package com.ctp.spring.dao;

import com.ctp.spring.domain.Test;

import java.util.List;

public interface TestDAO {
    public void saveTest(Test test);

    public List<Test> readTestByQuastionId(Integer id);

    public void deleteTestById(Integer id);

    public void updateTestById(Integer id);
}

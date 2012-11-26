package com.ctp.spring.dao;

import com.ctp.spring.domain.Answer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnswerDAOImpl implements AnswerDAO{
    @Override
    public void saveAnsver(Answer answer) {

    }

    @Override
    public List<Answer> readAnswersByQuastionId() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteAnswerById(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateAnswerById(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

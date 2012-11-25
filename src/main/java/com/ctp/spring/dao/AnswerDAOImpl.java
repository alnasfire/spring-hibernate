package com.ctp.spring.dao;

import com.ctp.spring.domain.Answer;
import org.springframework.stereotype.Repository;

@Repository
public class AnswerDAOImpl implements AnswerDAO{
    @Override
    public void saveAnsver(Answer answer) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Answer readAnswerByQuastionId() {
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

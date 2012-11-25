package com.ctp.spring.service;

import com.ctp.spring.domain.Answer;
import com.ctp.spring.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService{
    @Override
    public void saveAnswer(Answer answer) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Answer> answerList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeAnswer(Long id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public User retriveAnswer(Long id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<User> findAnswerByTestId(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

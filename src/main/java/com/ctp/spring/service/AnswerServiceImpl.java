package com.ctp.spring.service;

import com.ctp.spring.domain.Answer;
import com.ctp.spring.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService{
    @Override
    public void saveAnswer(Answer answer) {

    }

    @Override
    public List<Answer> answerList() {
        return null;
    }

    @Override
    public void removeAnswer(Long id) {

    }

    @Override
    public User retriveAnswer(Long id) {
        return null;
    }

    @Override
    public List<Answer> findAnswerByTestId(Integer id) {
        return null;
    }
}

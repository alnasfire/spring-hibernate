package com.ctp.spring.service;

import com.ctp.spring.domain.Answer;
import com.ctp.spring.domain.User;

import java.util.List;

public interface AnswerService {
    public void saveAnswer(Answer answer);

    public List<Answer> answerList();

    public void removeAnswer(Long id);

    public User retriveAnswer(Long id);

    public List<User> findAnswerByTestId(Integer id);
}

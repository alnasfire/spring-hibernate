package com.ctp.spring.dao;

import com.ctp.spring.domain.Answer;

import java.util.List;

public interface AnswerDAO {
    public void saveAnsver(Answer answer);

    public List<Answer> readAnswersByQuastionId();

    public void deleteAnswerById(Integer id);

    public void updateAnswerById(Integer id);
}

package com.ctp.spring.dao;

import com.ctp.spring.domain.Answer;

public interface AnswerDAO {
    public void saveAnsver(Answer answer);

    public Answer readAnswerByQuastionId();

    public void deleteAnswerById(Integer id);

    public void updateAnswerById(Integer id);
}

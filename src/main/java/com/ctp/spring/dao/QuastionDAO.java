package com.ctp.spring.dao;

import com.ctp.spring.domain.Quastion;

import java.util.List;

public interface QuastionDAO {
    public void saveQuastion(Quastion quastion);

    public List<Quastion> readQuastionsByTestId(Integer id);
}

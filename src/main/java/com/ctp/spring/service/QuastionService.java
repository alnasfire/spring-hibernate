package com.ctp.spring.service;

import com.ctp.spring.domain.Quastion;
import com.ctp.spring.domain.User;

import java.util.List;

public interface QuastionService {
    public void saveQuastion(Quastion quastion);

    public List<Quastion> quastionList();

    public void removeQuastionById(Long id);

    public Quastion retriveQuastionById(Long id);

    public List<Quastion> findQuastionByTestId(Integer id);
}

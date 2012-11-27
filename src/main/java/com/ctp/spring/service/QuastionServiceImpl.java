package com.ctp.spring.service;

import com.ctp.spring.domain.Quastion;
import com.ctp.spring.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuastionServiceImpl implements QuastionService{
    @Override
    public void saveQuastion(Quastion quastion) {

    }

    @Override
    public List<Quastion> quastionList() {
        return null;
    }

    @Override
    public void removeQuastionById(Long id) {

    }

    @Override
    public Quastion retriveQuastionById(Long id) {
        return null;
    }

    @Override
    public List<Quastion> findQuastionByTestId(Integer id) {
        return null;
    }
}

package com.ctp.spring.service;

import com.ctp.spring.dao.QuastionDAO;
import com.ctp.spring.domain.Quastion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuastionServiceImpl implements QuastionService{

    @Autowired
    QuastionDAO quastionDAO;

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

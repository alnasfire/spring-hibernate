package com.ctp.spring.dao;

import com.ctp.spring.domain.Quastion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuastionDAOImpl implements QuastionDAO {
    @Override
    public void saveQuastion(Quastion quastion) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Quastion> readQuastionsByTestId(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

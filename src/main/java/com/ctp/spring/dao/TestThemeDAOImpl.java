package com.ctp.spring.dao;

import com.ctp.spring.domain.Theme;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestThemeDAOImpl implements TestThemeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveTheme(Theme theme) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Theme> readThemesBySectionId(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteThemeById(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateThemeById(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

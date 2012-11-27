package com.ctp.spring.dao;

import com.ctp.spring.domain.Section;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SectionDAOImpl implements SectionDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveSection(Section section) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Section> readSectionById(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteSectionById(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateSectionById(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

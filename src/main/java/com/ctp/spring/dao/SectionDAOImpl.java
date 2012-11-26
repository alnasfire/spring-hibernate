package com.ctp.spring.dao;

import com.ctp.spring.domain.Section;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SectionDAOImpl implements SectionDAO{
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

package com.ctp.spring.dao;

import com.ctp.spring.domain.Section;

import java.util.List;

public interface SectionDAO {
    public void saveSection(Section section);

    public List<Section> readSectionById(Integer id);

    public void deleteSectionById(Integer id);

    public void updateSectionById(Integer id);
}

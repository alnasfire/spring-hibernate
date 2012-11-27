package com.ctp.spring.service;

import com.ctp.spring.domain.Section;

import java.util.List;

public interface SectionService {
    public void saveSection(Section section);

    public List<Section> sectionList();

    public void removeSectionById(Long id);

    public Section retriveSectionById(Long id);

    public List<Section> findSectionByTestId(Integer id);
}

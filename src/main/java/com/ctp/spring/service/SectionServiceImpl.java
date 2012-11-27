package com.ctp.spring.service;

import com.ctp.spring.domain.Section;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService{
    @Override
    public void saveSection(Section section) {

    }

    @Override
    public List<Section> sectionList() {
        return null;
    }

    @Override
    public void removeSectionById(Long id) {

    }

    @Override
    public Section retriveSectionById(Long id) {
        return null;
    }

    @Override
    public List<Section> findSectionByTestId(Integer id) {
        return null;
    }
}

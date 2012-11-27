package com.ctp.spring.service;

import com.ctp.spring.domain.Theme;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestThemeServiceImpl implements TestThemeService{
    @Override
    public void saveTheme(Theme Theme) {

    }

    @Override
    public List<Theme> getThemeList() {
        return null;
    }

    @Override
    public void removeThemeById(Long id) {

    }

    @Override
    public Theme retriveTestById(Long id) {
        return null;
    }

    @Override
    public List<Theme> findTestByUserId(Long id) {
        return null;
    }
}

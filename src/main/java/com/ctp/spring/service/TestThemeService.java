package com.ctp.spring.service;

import com.ctp.spring.domain.Theme;

import java.util.List;

public interface TestThemeService {
    public void saveTheme(Theme Theme);

    public List<Theme> getThemeList();

    public void removeThemeById(Long id);

    public Theme retriveTestById(Long id);

    public List<Theme> findTestByUserId(Long id);
}
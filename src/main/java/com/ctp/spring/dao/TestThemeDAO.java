package com.ctp.spring.dao;

import com.ctp.spring.domain.Theme;

import java.util.List;

public interface TestThemeDAO {
    public void saveTheme(Theme theme);

    public List<Theme> readThemesBySectionId(Integer id);

    public void deleteThemeById(Integer id);

    public void updateThemeById(Integer id);
}

package com.ctp.spring.domain;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class Test {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "themeid")
    private int theme;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTheme() {
        return theme;
    }

    public void setTheme(int theme) {
        this.theme = theme;
    }
}

package com.ctp.spring.domain;

import javax.persistence.*;

@Entity
@Table(name = "Test")
public class Test {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "user")
    private int user;

    @Column(name = "theme")
    private int theme;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getTheme() {
        return theme;
    }

    public void setTheme(int theme) {
        this.theme = theme;
    }
}

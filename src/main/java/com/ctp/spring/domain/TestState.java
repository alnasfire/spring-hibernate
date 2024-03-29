package com.ctp.spring.domain;

import javax.persistence.*;

@Entity
@Table(name = "teststate")
public class TestState {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "value")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

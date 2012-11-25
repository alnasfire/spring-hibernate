package com.ctp.spring.domain;

import javax.persistence.*;

@Entity
@Table(name = "Quastion")
public class Quastion {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "quastion")
    private String value;

    @Column(name = "test")
    private int testId;

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

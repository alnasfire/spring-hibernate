package com.ctp.spring.domain;

import javax.persistence.*;

@Entity
@Table(name = "TestResult")
public class TestResult {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "test")
    private int testId;

    @Column(name = "state")
    private int stateId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }
}

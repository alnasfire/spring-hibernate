package com.ctp.spring.domain;

import javax.persistence.*;

@Entity
@Table(name = "testresult")
public class TestResult {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "testid")
    private int testId;

    @Column(name = "stateid")
    private int stateId;

    @Column(name = "userid")
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

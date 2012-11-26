package com.ctp.spring.domain;

import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "value")
    private String value;

    @Column(name = "quastionid")
    private int quastionId;

    @Column(name = "state")
    private boolean state;

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

    public int getQuastionId() {
        return quastionId;
    }

    public void setQuastionId(int quastionId) {
        this.quastionId = quastionId;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}

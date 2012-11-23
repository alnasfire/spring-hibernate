package com.seostella.spring.domain;

import javax.persistence.*;

/**
 *
 * @author seostella.com
 */
@Entity
public class Country {
    @Id
    @GeneratedValue
    private long id;
    
    @Column(name = "name", unique = true, nullable=false)
    private String name;
    
    public Country() {
    }

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
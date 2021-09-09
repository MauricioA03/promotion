package com.example.laboratorio11.model;

import javax.persistence.Entity;

@Entity
public class Promotion extends ModelBase {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

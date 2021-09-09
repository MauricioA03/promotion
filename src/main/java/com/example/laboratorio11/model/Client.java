package com.example.laboratorio11.model;

import com.example.laboratorio11.dto.ClientDto;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Client extends ModelBase<ClientDto> {

    private String name;
    private String lastName;
    private String adress;
    private String email;
    private LocalDate birthDay;

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

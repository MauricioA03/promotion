package com.example.laboratorio11.dto;


import com.example.laboratorio11.model.Client;
import org.modelmapper.ModelMapper;

import java.time.LocalDate;

public class ClientDto extends DtoBase<Client> {

    private String name;
    private String lastName;
    private String adress;
    private String email;
    private LocalDate birthDay;

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

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public ClientDto toDto(Client client, ModelMapper mapper) {
        ClientDto clientDto = super.toDto(client, mapper);
        return clientDto;
    }
}

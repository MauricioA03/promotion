package com.example.laboratorio11.service;

import com.example.laboratorio11.model.Client;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.testng.Assert.assertEquals;

@SpringBootTest
class ClientServiceImplTest {

    @Autowired
    ClientServiceImpl clientService;

    @Test
    public void getCLientsWhohaveBirtdayToday() {
        LocalDate todayDate = LocalDate.parse("2021-09-09");
        List<Client> clients = clientService.getClientsByBirthDay(todayDate);
        System.out.println(clients.get(0).getName());
        assertEquals(1, clients.size());
    }
}

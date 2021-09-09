package com.example.laboratorio11.service;


import com.example.laboratorio11.model.Client;
import com.example.laboratorio11.repository.ClientRepository;
import com.example.laboratorio11.repository.GenericRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl extends GenericServiceImpl<Client> implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    protected GenericRepository<Client> getPromotionRepository() {
        return clientRepository;
    }

    public List<Client> getClientsByBirthDay(LocalDate date) {
        List<Client> result = new ArrayList<>();
        List<Client> clients = clientRepository.findAll();
        clients.forEach(client -> {
            LocalDate birth = client.getBirthDay();
            if (birth.getMonth() == date.getMonth() && birth.getDayOfMonth() == date.getDayOfMonth()) {
                result.add(client);
            }
        });
        return result;
    }
}

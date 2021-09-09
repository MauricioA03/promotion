package com.example.laboratorio11.service;


import com.example.laboratorio11.model.Client;
import com.example.laboratorio11.repository.ClientRepository;
import com.example.laboratorio11.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl extends GenericServiceImpl<Client> implements ClientService {
    private final ClientRepository repository;

    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Client> getRepository() {
        return repository;
    }
}

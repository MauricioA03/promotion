package com.example.laboratorio11;


import com.example.laboratorio11.model.Client;
import com.example.laboratorio11.repository.ClientRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DevelopmentBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private final ClientRepository clientRepository;

    public DevelopmentBootstrap(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("evento de spring");
        persistClient("Mau", "Arancibia", "07");
        persistClient("Kevin", "Obama", "08");
        persistClient("Mario", "Casas", "09");
        persistClient("Juan", "Rosas", "10");
        persistClient("Maria", "Meneses", "11");
    }

    private void persistClient(String name, String lastName, String dia) {
        Client client = new Client();
        client.setName(name);
        client.setLastName(lastName);
        client.setAdress("Calle Julio Mendes");
        client.setEmail(name + lastName + "@gmail.com");
        client.setBirthDay(LocalDate.parse("2000-09-" + dia));
        clientRepository.save(client);
    }
}

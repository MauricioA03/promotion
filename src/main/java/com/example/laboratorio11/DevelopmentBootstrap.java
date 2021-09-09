package com.example.laboratorio11;


import com.example.laboratorio11.model.Client;
import com.example.laboratorio11.repository.ClientRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class DevelopmentBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private ClientRepository buyRepository;

    // injeccion evita hacer instancia   = new Clase();
    // bean pueden tener muchos campos y otros beans asociados

    public DevelopmentBootstrap(ClientRepository buyRepository) {
        this.buyRepository = buyRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("evento de spring");
        persistBuy(BigInteger.TEN);
        persistBuy(BigInteger.ONE);
    }

    private void persistBuy(BigInteger value) {
        Client buy = new Client();
        buy.setTelephone(value);
        buyRepository.save(buy);
    }
}

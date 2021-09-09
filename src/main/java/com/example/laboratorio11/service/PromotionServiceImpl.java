package com.example.laboratorio11.service;

import com.example.laboratorio11.model.Client;
import com.example.laboratorio11.model.Promotion;
import com.example.laboratorio11.repository.GenericRepository;
import com.example.laboratorio11.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class PromotionServiceImpl extends GenericServiceImpl<Promotion> implements PromotionService {

    @Value("${discountValue}")
    private BigDecimal discountValue;
    private final PromotionRepository promotionRepository;
    private final ClientServiceImpl clientService;

    public PromotionServiceImpl(PromotionRepository promotionRepository, ClientServiceImpl clientService) {
        this.promotionRepository = promotionRepository;
        this.clientService = clientService;
    }

    @Override
    protected GenericRepository<Promotion> getPromotionRepository() {
        return promotionRepository;
    }

    public void savePromotionsToAllClientsWithBirthNow() {
        LocalDate date = LocalDate.now();
        List<Client> clients = clientService.getClientsByBirthDay(date);
        for (Client client : clients) {
            String description = createMessageToPromotion(client);
            Promotion promotion = new Promotion();
            promotion.setDescription(description);
            promotionRepository.save(promotion);
        }
    }

    private String createMessageToPromotion(Client client) {
        return client.getName() + " Hoy es su cumpleaños y usted es importante para nosotros, " +
                " queremos celebralo ofreciendo un " + discountValue + " de descuento y delivery gratuito. Valido por 24 hrs";
    }
}

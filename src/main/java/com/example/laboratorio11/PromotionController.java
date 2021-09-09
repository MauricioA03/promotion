package com.example.laboratorio11;


import com.example.laboratorio11.dto.PromotionDto;
import com.example.laboratorio11.model.Promotion;
import com.example.laboratorio11.service.GenericService;
import com.example.laboratorio11.service.PromotionService;
import controller.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Promotions")
public class PromotionController extends GenericController<Promotion, PromotionDto> {
    private PromotionService promotionService;

    public PromotionController(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @Override
    protected GenericService getPromotionService() {
        return promotionService;
    }
}

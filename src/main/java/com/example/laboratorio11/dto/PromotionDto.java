package com.example.laboratorio11.dto;


import com.example.laboratorio11.model.Promotion;
import org.modelmapper.ModelMapper;

public class PromotionDto extends DtoBase<Promotion> {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public PromotionDto toDto(Promotion promotion, ModelMapper mapper) {
        PromotionDto promotionDto = super.toDto(promotion, mapper);
        return promotionDto;
    }
}

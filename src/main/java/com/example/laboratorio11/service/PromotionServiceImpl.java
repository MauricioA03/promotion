package com.example.laboratorio11.service;

import com.example.laboratorio11.model.Promotion;
import com.example.laboratorio11.repository.GenericRepository;
import com.example.laboratorio11.repository.PromotionRepository;
import org.springframework.stereotype.Service;

@Service
public class PromotionServiceImpl extends GenericServiceImpl<Promotion> implements PromotionService {
    private final PromotionRepository repository;

    public PromotionServiceImpl(PromotionRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Promotion> getRepository() {
        return repository;
    }
}

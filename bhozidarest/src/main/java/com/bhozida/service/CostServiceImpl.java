package com.bhozida.service;

import com.bhozida.model.Cost;
import com.bhozida.repository.CostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostServiceImpl implements CostService {

    private CostRepository costRepository;

    public CostServiceImpl(CostRepository costRepository) {
        this.costRepository = costRepository;
    }

    @Override
    public Cost addUpdate(Cost object) {
        return costRepository.save(object);
    }

    @Override
    public void delete(Cost object) {
        costRepository.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        costRepository.deleteById(id);

    }

    @Override
    public boolean empty() {
        return costRepository.findAll().isEmpty();
    }

    @Override
    public List<Cost> findAll() {
        return costRepository.findAll();
    }

    @Override
    public Cost findById(Long id) {
        return costRepository.findById(id).get();
    }

 }
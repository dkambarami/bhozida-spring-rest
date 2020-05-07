package com.bhozida.service;

import com.bhozida.model.Idea;
import com.bhozida.repository.IdeaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IdeaServiceImpl implements IdeaService {

    private IdeaRepository ideaRepository;

    public IdeaServiceImpl(IdeaRepository ideaRepository) {
        this.ideaRepository = ideaRepository;
    }

    @Override
    public Idea findById(Long aLong) {
        return ideaRepository.findById(aLong).get();
    }

    @Override
    public Idea addUpdate(Idea object) {
        return ideaRepository.save(object);
    }

    @Override
    public List<Idea> findAll() {
        return ideaRepository.findAll();
    }

    @Override
    public void delete(Idea object) {
        ideaRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ideaRepository.deleteById(aLong);
    }

    @Override
    public boolean empty() {
        return ideaRepository.findAll().isEmpty();
    }
}
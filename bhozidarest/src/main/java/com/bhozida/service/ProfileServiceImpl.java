package com.bhozida.service;

import com.bhozida.model.Profile;
import com.bhozida.repository.ProfileRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    private ProfileRepository profileRepository;

    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Profile addUpdate(Profile object) {
        return profileRepository.save(object);
    }

    @Override
    public void delete(Profile object) {
        profileRepository.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        profileRepository.deleteById(id);

    }

    @Override
    public boolean empty() {
        return profileRepository.findAll().isEmpty();
    }

    @Override
    public List<Profile> findAll() {
        return profileRepository.findAll();
    }

    @Override
    public Profile findById(Long id) {
        return profileRepository.findById(id).get();
    }

}
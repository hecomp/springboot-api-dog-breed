package com.disney.codechallenge.dogbreed.service;

import com.disney.codechallenge.dogbreed.dao.BreedRepository;
import com.disney.codechallenge.dogbreed.model.Breed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreedService {

    @Autowired
    public BreedRepository breedRepository;

    public List<Breed> getAllBreeds() {
        return (List<Breed>) breedRepository.findAll();
    }
}

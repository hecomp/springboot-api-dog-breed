package com.disney.codechallenge.dogbreed.dao;

import com.disney.codechallenge.dogbreed.model.Breed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BreedRepository extends CrudRepository<Breed, Long> {


}

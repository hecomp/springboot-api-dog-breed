package com.disney.codechallenge.dogbreed.dao;

import com.disney.codechallenge.dogbreed.model.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {

}

package com.disney.codechallenge.dogbreed.controller;

import com.disney.codechallenge.dogbreed.model.Breed;
import com.disney.codechallenge.dogbreed.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/breed")
public class BreedController {

    @Autowired
    private BreedService breedService;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<Object> getAll() {
        return new ResponseEntity<>(breedService.getAllBreeds(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Breed findOne(@PathVariable("id") Long id) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Long create(@RequestBody Breed breed) {
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") Long id, @RequestBody Breed breed) {
//        service.update(resource);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
//        service.deleteById(id);
    }
}

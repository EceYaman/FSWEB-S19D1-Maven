package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    private FruitService fruitService;
    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }
    @GetMapping
    public List<Fruit> get(){ return fruitService.getByPriceAsc();}

    @GetMapping("/{id}")
    public Fruit getById(@Positive @PathVariable("id") Long id){return fruitService.getById(id);}

    @GetMapping("/desc")
    public List<Fruit> getDesc(){return fruitService.getByPriceDesc();}

    @PostMapping
    public Fruit save(@Validated @RequestBody Fruit fruit){return  fruitService.save(fruit);}

    @GetMapping("/name/{name}")
    public List<Fruit> searchByName(@PathVariable("name") String name){return fruitService.searchByName(name);}

    @DeleteMapping("/{id}")
    public Fruit delete(@PathVariable("id") Long id){return fruitService.delete(id);}
}

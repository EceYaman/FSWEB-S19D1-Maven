package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    List<Vegetable> findAll();
    Vegetable findById(Long id);
    Vegetable saveVegetable(Vegetable vegetable);
    Vegetable deleteVegetable(Long id);
    List<Vegetable> getByPriceDesc();
    List<Vegetable> getByPriceAsc();
    List<Vegetable> searchByName(String word);
}

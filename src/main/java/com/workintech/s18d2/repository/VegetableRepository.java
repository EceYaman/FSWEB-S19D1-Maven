package com.workintech.s18d2.repository;

import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {
    @Query("select v from Vegetable v order by v.price desc")
    List<Vegetable> getByPriceDesc();
    @Query("select v from Vegetable v order by v.price asc")
    List<Vegetable> getByPriceAsc();
    @Query("select v from Vegetable v where v.name ilike %:word%")
    List<Vegetable> searchByName(String word);
}

package com.workintech.s18d2.service;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.repository.FruitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FruitServiceImpl implements FruitService{

    private final FruitRepository fruitRepository;
    @Override
    public List<Fruit> getByPriceAsc() {
        return List.of();
    }

    @Override
    public List<Fruit> getByPriceDesc() {
        return List.of();
    }

    @Override
    public Fruit getById(Long id) {
        return null;
    }

    @Override
    public Fruit save(Fruit fruit) {
        return null;
    }

    @Override
    public Fruit delete(Long id) {
        return null;
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return List.of();
    }
}

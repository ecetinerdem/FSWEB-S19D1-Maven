package com.workintech.s18d2.controller;

import com.workintech.s18d2.dto.FruitResponse;
import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
@AllArgsConstructor
public class FruitController {
    private final FruitService fruitService;

    @GetMapping
    public List<Fruit> getAsc() {
        return  fruitService.getByPriceAsc();
    }

    @GetMapping("/desc")
    public List<Fruit> getDesc() {
        return  fruitService.getByPriceDesc();
    }

    @GetMapping("/{id}")
    public FruitResponse getById(@Positive(message = "id cannot be less than zero") @PathVariable("id") Long id) {
        return new FruitResponse("Successfully got by id ", fruitService.getById(id) );
    }

    @GetMapping("/name/{name}")
    public List<Fruit> getByName(@Size(min = 2, max = 45, message = "Name length must be between 2 and 45") @PathVariable("name") String name) {
        return fruitService.searchByName(name);
    }

    @PostMapping
    public Fruit save(@Validated @RequestBody Fruit fruit) {
        return fruitService.save(fruit);
    }
    @DeleteMapping("/{id}")
    public Fruit delete(@NotNull @Positive @PathVariable("id") Long id) {
        return fruitService.delete(id);
    }
}

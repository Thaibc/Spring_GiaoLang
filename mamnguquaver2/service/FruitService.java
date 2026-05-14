package mamnguquaver2.service;

import mamnguquaver2.entity.Fruit;
import mamnguquaver2.repo.FruitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class FruitService {


    @Autowired
    private FruitRepo fruitRepo;


    public List<Fruit> getAllFruit() {
        return fruitRepo.findAll();
    }

    public Fruit getFruitById(long id) {
        return fruitRepo.findById(id).orElseThrow(() ->
                new RuntimeException("fruint not found"));
        //khi ma ben trong cai hop ok thi lay con ko thi throw 1 cai exception
    }

    public Fruit saveFruit(Fruit fruit) {
        return fruitRepo.save(fruit);
    }

    public void deleteFruit(long id) {
        if (!fruitRepo.existsById(id)) {
            throw new RuntimeException("fruit not found");
        }
        fruitRepo.deleteById(id);
    }

    public Fruit updateFruit(long id, Fruit fruit) {
        if (!fruitRepo.existsById(id)) {
            throw new RuntimeException("fruit not found");
        }
        fruit.setId(id);
        return updateFruit(id, fruit);
    }
}

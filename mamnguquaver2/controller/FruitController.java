package mamnguquaver2.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import mamnguquaver2.entity.Fruit;
import mamnguquaver2.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@Tag(name = "The Api offer fruit research", description = "All....")
@RequestMapping("/api/fruits") //tat ca endpoints bat dau voi API nay bang url nay
//get All /api/fruits
//get one /api/fruits/1
//post  /api/fruits JSON dua len
//Update /api/fruits/2 JSON dua len
public class FruitController {
    @Autowired
    private FruitService fruitService;

    @GetMapping
    public ResponseEntity<List<Fruit>> getAllFruits() {

        return ResponseEntity.status(HttpStatus.OK).body(fruitService.getAllFruit());
//        return  ResponseEntity.ok(fruitService.getAllFruit());
    }

    @GetMapping("{id}")
    public ResponseEntity<Fruit> getOneFruitById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(fruitService.getFruitById(id));

    }
}

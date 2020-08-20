package ru.betry.hat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.betry.hat.entity.Words;
import ru.betry.hat.service.WordsService;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/game")
public class WordsController {

    private WordsService wordsService;

    @Autowired
    public WordsController(WordsService wordsService) {
        this.wordsService = wordsService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Words words) {
        return ResponseEntity.ok(wordsService.save(words));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Optional<Words> byId = wordsService.findById(id);
        return Objects.isNull(byId)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(byId);
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(wordsService.findAll());
    }
}

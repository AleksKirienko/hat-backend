package ru.betry.hat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.betry.hat.entity.Words;
import ru.betry.hat.repository.WordsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class WordsService {

    private WordsRepository wordsRepository;

    @Autowired
    public WordsService(WordsRepository wordsRepository) {
        this.wordsRepository = wordsRepository;
    }

    public Words save(Words words) {
        return wordsRepository.save(words);
    }

    public Optional<Words> findById(Long id) {
        return wordsRepository.findById(id);
    }

    public List<Words> findAll() {
        return wordsRepository.findAll();
    }
}

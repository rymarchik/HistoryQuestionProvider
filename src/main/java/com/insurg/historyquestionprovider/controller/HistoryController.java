package com.insurg.historyquestionprovider.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurg.historyquestionprovider.model.Question;
import com.insurg.historyquestionprovider.repository.QuestionRepo;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class HistoryController {

    private final QuestionRepo questionRepo;

    @GetMapping("/question")
    public List<Question> getRandomQuestions(@RequestParam int amount) {
        List<Question> questions = questionRepo.findAll();
        Collections.shuffle(questions);
        return questions.stream()
            .limit(amount)
            .toList();
    }
}

package com.insurg.historyquestionprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurg.historyquestionprovider.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
}

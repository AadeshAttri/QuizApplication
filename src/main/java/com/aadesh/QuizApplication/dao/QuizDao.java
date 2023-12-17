package com.aadesh.QuizApplication.dao;

import com.aadesh.QuizApplication.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}

package com.kkd.sbb.question;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.kkd.sbb.DataNotFoundException;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        return questionRepository.findAll();
    }

    public Question getQuestion(Integer id) {
        Optional<Question> question = this.questionRepository.findById(id);

        try {
            return question.orElseThrow(() -> new DataNotFoundException("question not found"));
        } catch (DataNotFoundException e) {
            throw e;
        }

    }
}

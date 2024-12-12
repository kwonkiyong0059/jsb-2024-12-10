package com.kkd.sbb.answer;


import com.kkd.sbb.question.Question;
import com.kkd.sbb.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition =  "TEXT")
    private String content;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;

}

package com.rocketseat.certification_nlw.modules.certifications.controller;

import com.rocketseat.certification_nlw.modules.certifications.useCase.Top10RankingUseCase;
import com.rocketseat.certification_nlw.modules.students.entities.CertificationStudentEntity;
import com.rocketseat.certification_nlw.modules.students.repositories.CertificationStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ranking")
public class RankingController {
    @Autowired
    private Top10RankingUseCase top10RankingUseCase;
    @GetMapping("/top10")
    public List<CertificationStudentEntity> top10(){
        return this.top10RankingUseCase.execute();
    }
}

package com.carles2701.MedicalResearchCenterApp.researchProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResearchProjectService {

    private final ResearchProjectRepository researchProjectRepository;

    @Autowired
    public ResearchProjectService(ResearchProjectRepository researchProjectRepository) {
        this.researchProjectRepository = researchProjectRepository;
    }
}

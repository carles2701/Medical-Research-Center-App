package com.carles2701.MedicalResearchCenterApp.researchProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResearchProjectController {

    private final ResearchProjectService researchProjectService;

    @Autowired
    public ResearchProjectController(ResearchProjectService researchProjectService) {
        this.researchProjectService = researchProjectService;
    }
}

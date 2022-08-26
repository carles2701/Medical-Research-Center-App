package com.carles2701.MedicalResearchCenterApp.researchProject;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import com.carles2701.MedicalResearchCenterApp.role.Role;
import com.carles2701.MedicalResearchCenterApp.role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResearchProjectController {

    private final ResearchProjectService researchProjectService;

    @Autowired
    public ResearchProjectController(ResearchProjectService researchProjectService) {
        this.researchProjectService = researchProjectService;
    }

    @GetMapping
    public List<ResearchProject> getAllResearchProjects(){
        return researchProjectService.getAllResearchProjects();
    }

    @PostMapping("/add")
    public ResearchProject saveResearchProject(@RequestBody ResearchProject researchProject) {
        return researchProjectService.saveResearchProject(researchProject);
    }

    @GetMapping("/{id}")
    public ResearchProject getResearchProjectById(@PathVariable("id") Long id) throws NotFoundException {
        return researchProjectService.getResearchProjectById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteResearchProjectById(
            @PathVariable("id") Long id) {
        researchProjectService.deleteResearchProjectById(id);
    }

    @PutMapping("/{researchProjectId}/test/{testId}")
    public void addTestToResearchProject(@PathVariable("researchProjectId") Long researchProjectId, @PathVariable("testId") Long testId) throws NotFoundException {
        researchProjectService.addTestToResearchProject(researchProjectId, testId);
    }

    @PutMapping("/{researchProjectId}/user/{userId}")
    public void addUserToResearchProject(@PathVariable("researchProjectId") Long researchProjectId, @PathVariable("userId") Long userId) throws NotFoundException {
        researchProjectService.addUserToResearchProject(researchProjectId, userId);
    }
}

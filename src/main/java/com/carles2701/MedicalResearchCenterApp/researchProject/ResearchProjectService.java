package com.carles2701.MedicalResearchCenterApp.researchProject;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import com.carles2701.MedicalResearchCenterApp.test.Test;
import com.carles2701.MedicalResearchCenterApp.test.TestRepository;
import com.carles2701.MedicalResearchCenterApp.user.User;
import com.carles2701.MedicalResearchCenterApp.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResearchProjectService {

    private final ResearchProjectRepository researchProjectRepository;
    private final TestRepository testRepository;
    private final UserRepository userRepository;

    @Autowired
    public ResearchProjectService(ResearchProjectRepository researchProjectRepository,
                                  TestRepository testRepository,
                                  UserRepository userRepository) {
        this.researchProjectRepository = researchProjectRepository;
        this.testRepository = testRepository;
        this.userRepository = userRepository;
    }

    public List<ResearchProject> getAllResearchProjects() {
        return researchProjectRepository.findAll();
    }

    public ResearchProject saveResearchProject(ResearchProject researchProject) {
        return researchProjectRepository.save(researchProject);
    }

    public ResearchProject getResearchProjectById(Long id) throws NotFoundException{
        return researchProjectRepository
                .findById(id)
                .orElseThrow(()->new NotFoundException("Research Project not found"));
    }

    public void deleteResearchProjectById(Long id) {
        researchProjectRepository.deleteById(id);
    }

    public void addTestToResearchProject(Long researchProjectId, Long testId) throws NotFoundException{
        //Complete after mapping
        ResearchProject researchProject = researchProjectRepository.findById(researchProjectId)
                .orElseThrow(() -> new NotFoundException("Research Project not found"));
        Test test = testRepository.findById(testId)
                .orElseThrow(() -> new NotFoundException("Test not found"));
    }

    public void addUserToResearchProject(Long researchProjectId, Long userId) throws NotFoundException {
        //Complete after mapping
        ResearchProject researchProject = researchProjectRepository.findById(researchProjectId)
                .orElseThrow(() -> new NotFoundException("Research Project not found"));
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException("Test not found"));

    }
}

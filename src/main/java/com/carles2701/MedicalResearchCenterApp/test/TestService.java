package com.carles2701.MedicalResearchCenterApp.test;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private final TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public List<Test> getAllTests() {
        return testRepository.findAll();
    }

    public Test saveTest(Test test) {
        return testRepository.save(test);
    }

    public Test getTestById(Long id) throws NotFoundException {
        return testRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Test not found"));
    }

    public Test updateTest(Long id, Test test) {
        Test updatedTest = new Test();
        updatedTest.setTestTitle(test.getTestTitle());
        updatedTest.setTypeOfTest(test.getTypeOfTest());

        return testRepository.save(updatedTest);
    }

    public void deleteTestById(Long id) {
        testRepository.deleteById(id);
    }
}

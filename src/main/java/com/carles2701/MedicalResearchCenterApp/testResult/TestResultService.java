package com.carles2701.MedicalResearchCenterApp.testResult;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import com.carles2701.MedicalResearchCenterApp.test.Test;
import com.carles2701.MedicalResearchCenterApp.test.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestResultService {

    private final TestResultRepository testResultRepository;
    private final TestRepository testRepository;

    @Autowired
    public TestResultService(TestResultRepository testResultRepository,
                             TestRepository testRepository) {
        this.testResultRepository = testResultRepository;
        this.testRepository = testRepository;
    }


    public List<TestResult> getAllTestResults() {
        return testResultRepository.findAll();
    }


    public TestResult saveTestResult(TestResult testResult) {
        return testResultRepository.save(testResult);
    }

    public TestResult getTestResultById(Long id) throws NotFoundException {
        return testResultRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Result not found"));
    }

    public void deleteTestResultById(Long id) {
        testResultRepository.deleteById(id);
    }

    public void addResultToTest(Long resultId, Long testId) throws NotFoundException {
        //Complete after mapping
        TestResult testResult = testResultRepository.findById(resultId)
                .orElseThrow(() -> new NotFoundException("Result not found"));
        Test test = testRepository.findById(testId)
                .orElseThrow(() -> new NotFoundException("Test not found"));
    }
}

package com.carles2701.MedicalResearchCenterApp.testResult;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "tests/results")
public class TestResultController {

    private final TestResultService testResultService;

    @Autowired
    public TestResultController(TestResultService testResultService) {
        this.testResultService = testResultService;
    }

    @GetMapping
    public List<TestResult> getAllTestResults(){
        return testResultService.getAllTestResults();
    }

    @PostMapping("/add")
    public TestResult saveTestResult(@RequestBody TestResult testResult) {
        return testResultService.saveTestResult(testResult);
    }

    @GetMapping("/{id}")
    public TestResult getTestResultById(@PathVariable("id") Long id) throws NotFoundException {
        return testResultService.getTestResultById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTestResult(
            @PathVariable("id") Long id) {
        testResultService.deleteTestResultById(id);
    }

    @PutMapping("/{resultId}/test/{testId}")
    public void addResultToTest(@PathVariable("resultId") Long resultId, @PathVariable("testId") Long testId) throws NotFoundException {
        testResultService.addResultToTest(resultId, testId);
    }
}

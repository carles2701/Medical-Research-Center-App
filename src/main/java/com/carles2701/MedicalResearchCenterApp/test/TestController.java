package com.carles2701.MedicalResearchCenterApp.test;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tests")
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public List<Test> getAllTests(){
        return testService.getAllTests();
    }

    @PostMapping("/add")
    public Test saveTest(@RequestBody Test test) {
        return testService.saveTest(test);
    }

    @GetMapping("/{id}")
    public Test getTestById(@PathVariable("id") Long id) throws NotFoundException {
        return testService.getTestById(id);
    }

    @PutMapping("/{id}")
    public Test updateTest(@RequestBody Test test, @PathVariable("id") Long id) throws NotFoundException {
        return testService.updateTest(id, test);
    }

    @DeleteMapping("/{id}")
    public void deleteTest(
            @PathVariable("id") Long id) {
        testService.deleteTestById(id);
    }

}

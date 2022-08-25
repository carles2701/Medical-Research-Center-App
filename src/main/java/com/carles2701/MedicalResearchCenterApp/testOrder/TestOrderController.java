package com.carles2701.MedicalResearchCenterApp.testOrder;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import com.carles2701.MedicalResearchCenterApp.testResult.TestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestOrderController {

    private final TestOrderService testOrderService;

    @Autowired
    public TestOrderController(TestOrderService testOrderService) {
        this.testOrderService = testOrderService;
    }

    @GetMapping
    public List<TestOrder> getAllTestOrders(){
        return testOrderService.getAllTestOrders();
    }

    @PostMapping("/add")
    public TestOrder saveTestOrder(@RequestBody TestOrder testOrder) {
        return testOrderService.saveTestOrder(testOrder);
    }

    @GetMapping("/{id}")
    public TestOrder getTestOrderById(@PathVariable("id") Long id) throws NotFoundException {
        return testOrderService.getTestOrderById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTestOrder(
            @PathVariable("id") Long id) {
        testOrderService.deleteTestOrderById(id);
    }

    @PutMapping("/{orderId}/test/{testId}")
    public void addOrderToTest(@PathVariable("orderId") Long orderId, @PathVariable("testId") Long testId) throws NotFoundException {
        testOrderService.addOrderToTest(orderId, testId);
    }
}

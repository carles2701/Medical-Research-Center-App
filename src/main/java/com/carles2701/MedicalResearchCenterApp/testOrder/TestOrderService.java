package com.carles2701.MedicalResearchCenterApp.testOrder;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import com.carles2701.MedicalResearchCenterApp.test.Test;
import com.carles2701.MedicalResearchCenterApp.test.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestOrderService {

    private final TestOrderRepository testOrderRepository;
    private final TestRepository testRepository;

    @Autowired
    public TestOrderService(TestOrderRepository testOrderRepository,
                            TestRepository testRepository) {
        this.testOrderRepository = testOrderRepository;
        this.testRepository = testRepository;
    }

    public List<TestOrder> getAllTestOrders() {
        return testOrderRepository.findAll();
    }

    public TestOrder saveTestOrder(TestOrder testOrder) {
        return testOrderRepository.save(testOrder);
    }

    public TestOrder getTestOrderById(Long id) throws NotFoundException {
        return testOrderRepository
                .findById(id)
                .orElseThrow(()-> new NotFoundException("Order not found"));
    }

    public void deleteTestOrderById(Long id) {
        testOrderRepository.deleteById(id);
    }

    public void addOrderToTest(Long orderId, Long testId) throws NotFoundException{
        //Complete after mapping
        TestOrder testOrder = testOrderRepository
                .findById(orderId)
                .orElseThrow(()-> new NotFoundException("Order not found"));
        Test test = testRepository
                .findById(testId)
                .orElseThrow(()-> new NotFoundException("Test not found"));
    }
}

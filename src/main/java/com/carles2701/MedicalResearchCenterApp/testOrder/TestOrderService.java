package com.carles2701.MedicalResearchCenterApp.testOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestOrderService {

    private final TestOrderRepository testOrderRepository;

    @Autowired
    public TestOrderService(TestOrderRepository testOrderRepository) {
        this.testOrderRepository = testOrderRepository;
    }
}

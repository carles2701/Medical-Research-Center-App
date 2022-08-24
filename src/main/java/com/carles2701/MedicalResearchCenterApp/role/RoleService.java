package com.carles2701.MedicalResearchCenterApp.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private final RoleController roleController;

    @Autowired
    public RoleService(RoleController roleController) {
        this.roleController = roleController;
    }
}

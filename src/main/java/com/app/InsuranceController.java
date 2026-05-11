package com.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceController {

    @GetMapping("/")
    public String home() {
        return "Java App Deployed on Kubernetes 🚀";
    }
}

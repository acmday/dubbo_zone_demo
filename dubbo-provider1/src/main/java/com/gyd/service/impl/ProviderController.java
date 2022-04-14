package com.gyd.service.impl;

import com.example.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GYD
 * @Date 2022/2/10 16:34
 * @Version 1.0
 */
@RestController
public class ProviderController {
    @Autowired
    ApiService apiService;

    @GetMapping("/get")
    public String geta(){return "heel";}
}

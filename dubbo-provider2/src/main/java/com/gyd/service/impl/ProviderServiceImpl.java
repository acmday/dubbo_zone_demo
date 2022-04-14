package com.gyd.service.impl;

/**
 * @author GYD
 * @Date 2022/2/10 16:07
 * @Version 1.0
 */
import com.example.service.ApiService;
import org.springframework.stereotype.Service;

@Service("apiService")
public class ProviderServiceImpl implements ApiService {

    @Override
    public String say() {
        System.err.println("provider调用成功");
        return "222222222";
    }
}
package com.gyd;

import com.example.service.ApiService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.dubbo.common.constants.RegistryConstants.REGISTRY_ZONE;


/**
 * @author GYD
 * @Date 2022/2/10 16:50
 * @Version 1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    ApiService apiService;

    @GetMapping("/geta")
    public String get(){
        RpcContext.getContext().setAttachment(REGISTRY_ZONE,"nacos1");
        return apiService.say();
    }

    @GetMapping("/getb")
    public String get1(){
        RpcContext.getContext().setAttachment(REGISTRY_ZONE,"nacos2");
        return apiService.say();
    }

}

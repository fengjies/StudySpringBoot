package com.forezp.configclient.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope//    为要被刷新从配置文件中的类增加@RefreshScope注解
public class hiController {

//    @Value("${foo}")
//    String foo;
//    @RequestMapping(value = "/hi")
//    public String hi(){
//        return foo;
//    }
//
//2    @Value("${jay.label}")
//    private String label;
//
//    @RequestMapping("/hello")
//    public String test() {
//        return label;
//    }

//    为要被刷新从配置文件中的类增加@RefreshScope注解

    @RestController
    @RefreshScope
    public class IndexController {
        @Value("${jay.label}")
        private String label;

        @RequestMapping("/hello")
        public String test() {
            return label;
        }
    }
}
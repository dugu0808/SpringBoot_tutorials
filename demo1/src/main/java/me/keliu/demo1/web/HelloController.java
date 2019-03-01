package me.keliu.demo1.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
    /**
     * description: HelloWorld服务
     *
     * @Param: null
     * @return 
     */
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

}

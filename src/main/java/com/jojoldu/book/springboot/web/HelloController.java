package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줌.
@RestController
public class HelloController {

    //HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 줌.
    //예전에는 @RequestMapping(Method = RequestMethod.GET)으로 사용 되었지만 이프로젝트는 /hello로 요청이 오면 문자열 hello를 반환하는 기능
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}

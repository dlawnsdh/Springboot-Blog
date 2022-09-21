package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링이 com.example.demo 패키지 이하를 스캔해서 모든 파일을 메모리에 new 하는 것이 아닌
// 특정 어노테이션이 붙어있는 클래스 파일들을 new(IoC)해서 스프링 컨테이너에서 관리한다.
@RestController
public class BlogControllerTest {
    @GetMapping("/test/hello")
    public String hello() { return "<h1>어서오세요 스프링 부트입니다.</h1>"; }
}


package com.encorepay.membership.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    // 외부에서 내부로 들어오는 어댑터. 인바운드로 들어오는 웹 형식의 어댑터이기 때문에 in.web으로 옴.
    @GetMapping(path = "/test")
    void test() {
        System.out.println("Hello world!");
    }

}

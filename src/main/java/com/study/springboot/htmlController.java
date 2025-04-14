package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class htmlController {
    @GetMapping("/")
    public String main(){
        return "ex01"; // ex01.jsp 파일을 html 응답함 - 타임리프와 jsp 동시 사용 불가능.
    }
    // url: localhost:8080/ex/02
    @GetMapping("/ex/{no}")
    public String ex(@PathVariable("no") String no, Model model){
        // 문자열 no를 받음
        return "ex"+no;
    }
}

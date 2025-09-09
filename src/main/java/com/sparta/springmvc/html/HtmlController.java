package com.sparta.springmvc.html;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    private static long visitCount = 0;

    @GetMapping("/static-hello")
    public String hello(){
        return "hello.html";  //static 폴더가 아닌 templates 폴더 내의 html 반환 --> by thymeleaf
    }
    //static 폴더의 html은 컨트롤러를 거치지 않고 직접 접근 가능 http://localhost:8080/hello.html
    //thymeleaf 해제하면 static의 hello.html을 컨트롤러를 통해서 접근 가능  --> 굳이 할 필요 x


    @GetMapping("/html/redirect")  //redirect로 html 주소 비공개 가능
    public String htmlStatic(){
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    public String htmlTemplates(){
        return "hello";
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model){
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit.html";
    }


}

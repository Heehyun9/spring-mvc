package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {

    // Content-Type : text/html
    // Response Body
    // {"name":"Robbie","age":95"}

    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    // Content-Type : application/json
    // Response Body
    // {"name":"Robbie","age":95"}

    @GetMapping("/json/class")
    @ResponseBody  //안붙이면 templates에서 html 을 찾는데 responsebody를 써야 그렇게 하지 않고 데이터를 반환하는것을 알 수 있다.
    public Star helloClassJson(){
        return new Star("Robbie", 95);
    }  //원하는 데이터를 객체 형태로 반환 Json의(key,value) == 객체의(field, data)
}

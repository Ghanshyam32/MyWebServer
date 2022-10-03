package com.ghanshyam.httpserver.handlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class Me {

    @GetMapping("/me")
    public String me() {
        return "Just another sexy boi";
    }

    @GetMapping("/name")
    public String name() {
        return "Ghanshyam Mishra";
    }



//    @RequestMapping(value = "/link", method = RequestMethod.GET)
//    public void method(HttpServletResponse httpServletResponse) {
//        httpServletResponse.setHeader("Location", "https://www.youtube.com/watch?v=gr6QnFmCXzk&ab_channel=HAUSER");
//        httpServletResponse.setStatus(302);
//    }

    @GetMapping("/age")
    public String age() {
        return "20";
    }
}

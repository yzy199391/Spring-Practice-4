package com.note.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @author yanzy
 * @date 2019/3/7 上午9:31
 * @description
 */
@Controller
public class HomeController {
    @GetMapping("/home")
    public String view(Map<String, Object> map){
        map.put("name", "yanzy");
        map.put("date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return "home";
    }
}

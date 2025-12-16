package com.thymeleaf.controller;

import com.thymeleaf.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String helloMethod(Model model){
        model.addAttribute("message","Hello World");
        return "hello";
    }

    @GetMapping("/variable-expression")
    public String variableExpression(Model model){
        User user=new User("ayushi","ayushi@gmail.com","ADMIN","female");
        model.addAttribute("user",user);
        return "variable";
    }

    @GetMapping("/selection-expression")
    public String selectionExpression(Model model){
        User user=new User("ayushi","ayushi@gmail.com","ADMIN","female");
        model.addAttribute("user",user);
        return "selection";
    }

    @GetMapping("/message-expression")
    public String messageExpression(){
        return "message";
    }

    @GetMapping("/link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id",1);
        return "link";
    }

    @GetMapping("/fragment-expression")
    public String fragmentExpression(){
        return "fragment";
    }


}

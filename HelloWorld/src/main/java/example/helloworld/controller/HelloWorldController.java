package example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/")
public class HelloWorldController {

    @RequestMapping
    public String sayHello(Model model) {
    	model.addAttribute("msg","HELLO WORLD");
        return "index";
    }
}

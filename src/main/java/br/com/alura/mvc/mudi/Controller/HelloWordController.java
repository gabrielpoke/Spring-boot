package br.com.alura.mvc.mudi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWordController {

    @GetMapping("/hello")
    public String Hello(HttpServletRequest resquest){
        resquest.setAttribute("nome","Gabriel Victor Leite Prestes");
        return "hello";
    }
}

package br.com.msansone.test.phoneSpringBootService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class WebController {


    @Controller
    public class HomeController {

        @RequestMapping("/home")
        public ModelAndView index () {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("index");
            return modelAndView;
        }
    }

}

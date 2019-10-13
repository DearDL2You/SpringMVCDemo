package com.dinglei.SpringMVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
    public ModelAndView hellWorld() {
        ModelAndView view=new ModelAndView("helloworld");

        return view;
    }
}
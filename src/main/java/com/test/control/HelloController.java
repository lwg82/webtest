package com.test.control;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
@RequestMapping(value="/jsp")
public class HelloController {

    private static final Log logger = LogFactory.getLog(HelloController.class);


    @RequestMapping(value="/hello")
    public ModelAndView hello()
    {
        logger.info("hello 方法 被调用");

        ModelAndView mav = new ModelAndView();

        mav.addObject("message", "hello!");
        mav.setViewName("hello");
        return mav;
    }

    @RequestMapping("/helloWorld")
    public String helloWorld(Model model)
    {
        model.addAttribute("message", "Hello World!");
        return "helloWorld";
    }

}

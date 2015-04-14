package org.huamuzhen.gui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {
	
	@RequestMapping(value = "/index", method=RequestMethod.GET)
	public String hello(){
        log.info("in hello method");
		return "index";
	}

    /*@RequestMapping(value = "/main", method=RequestMethod.GET)
    public @ResponseBody String main(){
        return "Main Page";
    }*/


}
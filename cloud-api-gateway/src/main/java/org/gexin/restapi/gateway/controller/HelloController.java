package org.gexin.restapi.gateway.controller;


import org.gexin.restapi.gateway.services.ApnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ApnsService apnsService;

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String hello(@PathVariable String name){
       return  apnsService.hello(name);
    }
}

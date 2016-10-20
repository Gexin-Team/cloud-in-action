package org.gexin.restapi.gateway.services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Rapharino on 2016/10/16.
 */
@FeignClient("apnsService")
public interface ApnsService {
    @RequestMapping(value = "hello/{name}",method = RequestMethod.GET)
    String hello(@PathVariable("name") String name);
}
package com.Prashant.RestfulWebService.controller;

import com.Prashant.RestfulWebService.resource.Quote;
import com.Prashant.RestfulWebService.service.ConsumingRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApiController {
    private final ConsumingRestService consumingRestService;

    @Autowired
    public ApiController(ConsumingRestService consumingRestService) {
        this.consumingRestService = consumingRestService;
    }

    @GetMapping(value = "/value")
    public Quote getValue(){
        return consumingRestService.getRestResource();
    }
}

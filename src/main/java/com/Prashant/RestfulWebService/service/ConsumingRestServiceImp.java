package com.Prashant.RestfulWebService.service;

import com.Prashant.RestfulWebService.resource.Quote;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumingRestServiceImp implements ConsumingRestService {
    @Override
    public Quote getRestResource() {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random",
                Quote.class);
        return quote;
    }

}


package cmondi.controller;

import cmondi.model.IpifyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api")
public class HelloController {

    private String URL = "https://api.ipify.org?format=json";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/hello", produces = "application/json")
    public IpifyResponse hello() {
        IpifyResponse ipify = restTemplate.getForObject(URL, IpifyResponse.class);
        ipify.setLang("java");
        return ipify;
    }
}

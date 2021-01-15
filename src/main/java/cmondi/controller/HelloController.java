package cmondi.controller;

import cmondi.model.IpifyResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api")
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    private String URL = "https://api.ipify.org?format=json";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/hello", produces = "application/json")
    public IpifyResponse hello() {
        logger.info("Starting use /api/hello");
        logger.info("Trying to get ip from server");
        IpifyResponse ipify = restTemplate.getForObject(URL, IpifyResponse.class);
        ipify.setLang("java");
        logger.info("Successfully get one, put our information");
        logger.info("Return the new data");
        return ipify;
    }
}

package cmondi.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api")
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    private String URL = "https://api.ipify.org?format=json";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/hello", produces = "application/json")
    public Map<Object, Object> hello() {
        logger.info("Starting use /api/hello");
        Map<Object, Object> data;
        logger.info("Trying to get ip from server");
        data = restTemplate.getForObject(URL, Map.class);
        logger.info("Successfully get one, put our information");
        data.put("lang", "java");
        logger.info("Return the new data");
        return data;
    }
}

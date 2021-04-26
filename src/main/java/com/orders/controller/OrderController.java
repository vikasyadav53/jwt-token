package com.orders.controller;


import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-publisher/v1")
public class OrderController {

    @GetMapping("/start-job/fromdate/{fromdate}/todate/{todate}/fileformat/{fileformat}")
    public String login(@PathVariable String fromdate, @PathVariable String todate, @PathVariable String fileformat) {
    	UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}

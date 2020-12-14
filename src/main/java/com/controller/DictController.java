package com.controller;

import com.entity.Response;
import com.server.DictServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DictController
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-03 10:24
 * @Version 1.0
 **/
@RestController
@RequestMapping("/sz/dict")
@CrossOrigin
public class DictController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private DictServer dictServer;

    @GetMapping("/select")
    public Response getAllDict () {
        return dictServer.getAllDict();
    }
}

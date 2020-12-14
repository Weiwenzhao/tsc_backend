package com.controller;

import com.alibaba.fastjson.JSON;
import com.entity.BaseShareInfo;
import com.entity.Response;
import com.server.BaseShareServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName BaseShareController
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-03 16:35
 * @Version 1.0
 **/
@RestController
@RequestMapping("/sz/base/share")
@CrossOrigin
public class BaseShareController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private BaseShareServer baseShareServer;

    @GetMapping("/select")
    public Response getAllBaseShare () {
        logger.info("开始获取所有的BaseShare信息");
        return baseShareServer.getAllBaseShare();
    }

    @GetMapping("/select/{pageNo}/{pageSize}")
    public Response getBaseSharePage ( @PathVariable int pageNo, @PathVariable int pageSize ) {
        logger.info("开始分页获取BaseShare信息");
        return baseShareServer.getBaseSharePage(pageNo, pageSize);
    }

    @GetMapping("/select/{id}")
    public Response getBaseShare ( @PathVariable String id ) {
        logger.info("开始获取单个BaseShare信息，id：" + id);
        return baseShareServer.selectOne(id);
    }

    @PostMapping("/insert")
    public Response insert ( @RequestBody BaseShareInfo baseShare ) {
        logger.info("开始获添加新的BaseShare信息,humanInfo:" + JSON.toJSONString(baseShare));
        return baseShareServer.insert(baseShare);
    }

    @PostMapping("/update")
    public Response update ( @RequestBody BaseShareInfo baseShare ) {
        logger.info("开始获更新BaseShare信息,humanInfo:" + JSON.toJSONString(baseShare));
        return baseShareServer.update(baseShare);
    }

    @DeleteMapping("/delete/{id}")
    public Response delete ( @PathVariable String id ) {
        logger.info("根据Id删除BaseShare,id:" + id);
        return baseShareServer.delete(id);
    }
}

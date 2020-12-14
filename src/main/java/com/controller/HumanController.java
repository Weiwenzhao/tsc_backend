package com.controller;

import com.alibaba.fastjson.JSON;
import com.entity.HumanInfo;
import com.entity.Response;
import com.server.HumanServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName HumanController
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-02 20:52
 * @Version 1.0
 **/

@RestController
@RequestMapping("/sz/human")
@CrossOrigin
public class HumanController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private HumanServer humanServer;

    @GetMapping("/select")
    public Response getAllHuman () {
        logger.info("开始获取所有的人员信息");
        return humanServer.getAllHuman();
    }

    @GetMapping("/select/{pageNo}/{pageSize}")
    public Response getHumanPage ( @PathVariable int pageNo, @PathVariable int pageSize ) {
        logger.info("开始分页获取人员信息");
        return humanServer.getHumanPage(pageNo, pageSize);
    }

    @GetMapping("/select/{id}")
    public Response getHuman ( @PathVariable String id ) {
        logger.info("开始获取单个人员信息，id：" + id);
        return humanServer.selectOne(id);
    }

    @PostMapping("/insert")
    public Response insert ( @RequestBody HumanInfo humanInfo ) {
        logger.info("开始获添加新的人员信息,humanInfo:" + JSON.toJSONString(humanInfo));
        return humanServer.insert(humanInfo);
    }

    @PostMapping("/update")
    public Response update ( @RequestBody HumanInfo humanInfo ) {
        logger.info("开始获更新人员信息,humanInfo:" + JSON.toJSONString(humanInfo));
        return humanServer.update(humanInfo);
    }

    @DeleteMapping("/delete/{id}")
    public Response delete ( @PathVariable String id ) {
        logger.info("根据Id删除人员,id:" + id);
        return humanServer.delete(id);
    }
}

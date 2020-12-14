package com.server.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.entity.HumanInfo;
import com.entity.Response;
import com.mapper.HumanMapper;
import com.server.HumanServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @ClassName HumanServerImpl
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-02 21:19
 * @Version 1.0
 **/
@Service
public class HumanServerImpl implements HumanServer {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private HumanMapper humanMapper;

    @Override
    public Response getAllHuman () {
        return new Response().setCode(200).setObject(humanMapper.selectList(null));
    }

    @Override
    public Response getHumanPage ( int pageNo, int pageSize ) {
        IPage<HumanInfo> humanPage = new Page<>(pageNo, pageSize);
        try {
            return new Response().setCode(200).setObject(humanMapper.selectPage(humanPage, null));
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("分页查询失败！原因是：" + e);
        }
        return new Response().setCode(500).setObject(new ArrayList<>());
    }

    @Override
    public Response insert ( HumanInfo humanInfo ) {
        try {
            humanMapper.insert(humanInfo);
            return new Response().setCode(200);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("插入新的HumanInfo失败！原因是：" + e);
        }
        return new Response().setCode(500);
    }

    @Override
    public Response delete ( String id ) {
        return new Response().setCode(200).setObject(humanMapper.deleteById(id));
    }

    @Override
    public Response update ( HumanInfo humanInfo ) {
        try {
            return new Response().setCode(200).setObject(humanMapper.update(humanInfo, null));
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("更新的HumanInfo失败！原因是：" + e);
        }
        return new Response().setCode(500);
    }

    @Override
    public Response selectOne ( String id ) {
        try {
            return new Response().setCode(200).setObject(humanMapper.selectById(id));
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询一个HumanInfo失败！原因是：" + e);
        }
        return new Response().setCode(500);
    }
}

package com.server.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.entity.BaseShareInfo;
import com.entity.Response;
import com.mapper.BaseShareMapper;
import com.server.BaseShareServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @ClassName BaseShareServerImpl
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-03 16:52
 * @Version 1.0
 **/
@Service
public class BaseShareServerImpl implements BaseShareServer {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    BaseShareMapper baseShareMapper;

    @Override
    public Response getAllBaseShare () {
        return new Response().setCode(200).setObject(baseShareMapper.selectList(null));
    }

    @Override
    public Response getBaseSharePage ( int pageNo, int pageSize ) {
        IPage<BaseShareInfo> baseSharePage = new Page<>(pageNo, pageSize);
        try {
            return new Response().setCode(200).setObject(baseShareMapper.selectPage(baseSharePage, null));
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("分页查询BaseShare失败！原因是：" + e);
        }
        return new Response().setCode(500).setObject(new ArrayList<>());
    }

    @Override
    public Response insert ( BaseShareInfo baseShareInfo ) {
        try {
            baseShareMapper.insert(baseShareInfo);
            return new Response().setCode(200);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("插入新的BaseShare失败！原因是：" + e);
        }
        return new Response().setCode(500);
    }

    @Override
    public Response delete ( String id ) {
        return new Response().setCode(200).setObject(baseShareMapper.deleteById(id));
    }

    @Override
    public Response update ( BaseShareInfo baseShareInfo ) {
        try {
            return new Response().setCode(200).setObject(baseShareMapper.update(baseShareInfo, null));
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("更新的BaseShare失败！原因是：" + e);
        }
        return new Response().setCode(500);
    }

    @Override
    public Response selectOne ( String id ) {
        try {
            return new Response().setCode(200).setObject(baseShareMapper.selectById(id));
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询一个的BaseShare失败！原因是：" + e);
        }
        return new Response().setCode(500);
    }
}

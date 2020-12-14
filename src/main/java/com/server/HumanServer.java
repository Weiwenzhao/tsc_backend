package com.server;

import com.entity.HumanInfo;
import com.entity.Response;

/**
 * @Interface HumanServer
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-02 21:18
 * @Version 1.0
 **/
public interface HumanServer {
    Response getAllHuman ();

    Response getHumanPage ( int pageNo, int pageSize );

    Response insert ( HumanInfo humanInfo );

    Response delete ( String id );

    Response update ( HumanInfo humanInfo );

    Response selectOne ( String id );
}

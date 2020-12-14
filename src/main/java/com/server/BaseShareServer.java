package com.server;

import com.entity.BaseShareInfo;
import com.entity.Response;

/**
 * @Interface BaseShareServer
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-03 16:51
 * @Version 1.0
 **/
public interface BaseShareServer {
    Response getAllBaseShare ();

    Response getBaseSharePage ( int pageNo, int pageSize );

    Response insert ( BaseShareInfo humanInfo );

    Response delete ( String id );

    Response update ( BaseShareInfo humanInfo );

    Response selectOne ( String id );
}

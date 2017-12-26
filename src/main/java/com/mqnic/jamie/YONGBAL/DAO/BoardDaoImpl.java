package com.mqnic.jamie.YONGBAL.DAO;

import com.mqnic.jamie.YONGBAL.MODEL.BOARD;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by jeonjaebum on 2017. 12. 8..
 */
@Repository
public class BoardDaoImpl implements BoardDao{

    private static final String namespace = "com.mqnic.jamie.mapper.BOARDMapper";

    @Inject
    SqlSession session;

    @Override
    public List<BOARD> GET_LIST() {
       return session.selectList(namespace+".GET_LIST");
    }
}

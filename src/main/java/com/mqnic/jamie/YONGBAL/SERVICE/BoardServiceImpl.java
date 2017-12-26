package com.mqnic.jamie.YONGBAL.SERVICE;

import com.mqnic.jamie.YONGBAL.DAO.BoardDao;
import com.mqnic.jamie.YONGBAL.MODEL.BOARD;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by jeonjaebum on 2017. 12. 8..
 */
@Service
public class BoardServiceImpl implements BoardService{

    @Inject
    BoardDao dao;

    @Override
    public List<BOARD> GET_LIST() {
        return dao.GET_LIST();
    }
}

package com.mqnic.jamie.YONGBAL;

import com.mqnic.jamie.YONGBAL.MODEL.BOARD;
import com.mqnic.jamie.YONGBAL.SERVICE.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by jeonjaebum on 2017. 12. 8..
 */
@Controller
public class BoradController {

    private static final Logger logger = LoggerFactory.getLogger(BoradController.class);

    @Inject
    BoardService service;

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String board(Model model) {

        List<BOARD> YONGBAL = service.GET_LIST();

        model.addAttribute(YONGBAL);
        model.addAttribute("list",service.GET_LIST());

        return "list";
    }

}

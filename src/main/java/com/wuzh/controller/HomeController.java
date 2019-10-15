package com.wuzh.controller;

import com.wuzh.model.constant.ResponseCodeEnum;
import com.wuzh.model.response.BaseResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author wuzhuohui
 * @date 2019/10/15
 */
@Controller
public class HomeController {

    @ResponseBody
    @GetMapping(value = "/AA")
    public Object AA() throws Exception{
        System.out.println((Runtime.getRuntime().maxMemory()/ (1024.0 * 1024.0))+"MB");
        String result = "maxMemory为"+(Runtime.getRuntime().maxMemory()/ (1024.0 * 1024.0))+"MB";
        return BaseResponse.response("OK", ResponseCodeEnum.OK, result);
    }
}

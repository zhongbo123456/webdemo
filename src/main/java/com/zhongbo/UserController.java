package com.zhongbo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @BelongProjecet webdemo
 * @BelongPackage com.zhongbo
 * @Description:
 * @Author: zhongbo
 * @Date: 2021/12/25 10:52
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response){
        return "/success.jsp";
    }

}

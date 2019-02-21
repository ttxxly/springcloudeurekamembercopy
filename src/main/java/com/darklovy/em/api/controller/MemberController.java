package com.darklovy.em.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @RequestMapping("/getMember")
    public String getMember() {
        return "this is getMember,我是会员服务。端口：8010";
    }
}

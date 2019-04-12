package com.example.code.company.web;


import com.alibaba.fastjson.JSON;
import com.example.code.company.entity.ShareSysCompanyInfo;
import com.example.code.company.service.IShareSysCompanyInfoService;
import com.mysql.cj.xdevapi.JsonString;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * <p>
 * 企业信息 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-04-09
 */
@RestController
public class ShareSysCompanyInfoController{
    @Resource
    IShareSysCompanyInfoService companyInfoService;

    @RequestMapping(path = "/hi",name = "测试逻辑删除")
    public String hi(String companyId){
        boolean b = companyInfoService.removeById(companyId);
        return JSON.toJSONString(b);
    }

}

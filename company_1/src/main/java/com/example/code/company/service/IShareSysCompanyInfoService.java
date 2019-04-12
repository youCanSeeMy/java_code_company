package com.example.code.company.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.code.company.entity.ShareSysCompanyInfo;

/**
 * <p>
 * 企业信息 服务类
 * </p>
 *
 * @author jobob
 * @since 2019-04-09
 */
public interface IShareSysCompanyInfoService extends IService<ShareSysCompanyInfo> {

    ShareSysCompanyInfo select(String name);
}

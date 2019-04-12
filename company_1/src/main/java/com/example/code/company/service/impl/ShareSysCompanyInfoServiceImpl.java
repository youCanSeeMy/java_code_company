package com.example.code.company.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.code.company.entity.ShareSysCompanyInfo;
import com.example.code.company.mapper.ShareSysCompanyInfoMapper;
import com.example.code.company.service.IShareSysCompanyInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 企业信息 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-04-09
 */
@Service
public class ShareSysCompanyInfoServiceImpl extends ServiceImpl<ShareSysCompanyInfoMapper, ShareSysCompanyInfo> implements IShareSysCompanyInfoService {

    @Override
    public ShareSysCompanyInfo select(String name) {
        return baseMapper.select(name);
    }
}

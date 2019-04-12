package com.example.code.company.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.code.company.entity.ShareSysCompanyInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 企业信息 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-04-09
 */
@Mapper
public interface ShareSysCompanyInfoMapper extends BaseMapper<ShareSysCompanyInfo> {

    ShareSysCompanyInfo select(String name);
}

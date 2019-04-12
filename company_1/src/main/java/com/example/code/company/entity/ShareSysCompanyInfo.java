package com.example.code.company.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * <p>
 * 企业信息
 * </p>
 *
 * @author jobob
 * @since 2019-04-09
 */
@Data
@TableName("share_sys_company_info")
public class ShareSysCompanyInfo<T extends Model> extends Model<T>{

    private static final long serialVersionUID = 1L;

    /**
     * 公司id
     */
    @TableId("COMPANY_ID")
    private String companyId;

    /**
     * 企业名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 简称
     */
    @TableField("SHORT_NAME")
    private String shortName;

    /**
     * 集团企业类型(内部企业还是外部)((字典表))
     */
    @TableField("GROUP_TYPE")
    private String groupType;

    /**
     * 平台职能(管理,执行)(字典表)(多选)
     */
    @TableField("COMPETENCY_TYPE")
    private String competencyType;

    /**
     * 业务类型(集团,工程,建设,其他)(字典表)
     */
    @TableField("BUSSINESS_TYPE")
    private String bussinessType;

    /**
     * 企业角色(供应商,业主,代理机构)(字典表)(多选)
     */
    @TableField("COMPANY_ROLE")
    private String companyRole;

    /**
     * 上级企业id
     */
    @TableField("PARENT_COMPANY")
    private String parentCompany;

    /**
     * 上级企业id的集合
     */
    @TableField("PIDS")
    private String pids;

    /**
     * 企业编码
     */
    @TableField("BIN_CODE")
    private String binCode;

    /**
     * 企业代号
     */
    @TableField("MARK")
    private String mark;

    /**
     * 企业logo
     */
    @TableField("LOGO")
    private String logo;

    /**
     * 企业第二logo
     */
    @TableField("LOGO_PRO")
    private String logoPro;

    /**
     * 企业门户地址
     */
    @TableField("URL")
    private String url;

    /**
     * 企业性质(国有私有等)(字典表)
     */
    @TableField("GOVERN_TYPE")
    private String governType;

    /**
     * 入网日期
     */
    @TableField("NETWORK_DATE")
    private Date networkDate;

    /**
     * 入网有效期
     */
    @TableField("NETWORK_EXPIRED")
    private Date networkExpired;

    /**
     * 入网审核人
     */
    @TableField("NETWORK_SIGN")
    private String networkSign;

    /**
     * 入网状态(1:有效 2:无效)
     */
    @TableField("NETWORK_STATUS")
    private Integer networkStatus;

    /**
     * 排序
     */
    @TableField("ORDERED")
    private Integer ordered;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 创建人
     */
    @TableField("CREATE_USER")
    private String createUser;

    /**
     * 更新时间
     */
    @TableField("UPDATE_TIME")
    private Date updateTime;

    /**
     * 更新人
     */
    @TableField("UPDATE_USER")
    private String updateUser;

    /**
     * 删除标记Y:已删除,N:未删除
     */
    @TableField("DEL_FLAG")
    @TableLogic
    private String delFlag;

    /**
     * 企业法人代表类型（独立法人，非独立法人字典表）
     */
    @TableField("CORP_TYPE")
    private String corpType;

    @Override
    protected Serializable pkVal() {
        return null;
    }
}

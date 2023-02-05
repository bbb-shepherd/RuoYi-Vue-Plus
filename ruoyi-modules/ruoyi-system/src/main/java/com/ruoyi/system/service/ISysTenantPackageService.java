package com.ruoyi.system.service;

import com.ruoyi.system.domain.vo.SysTenantPackageVo;
import com.ruoyi.system.domain.bo.SysTenantPackageBo;
import com.ruoyi.common.mybatis.core.page.TableDataInfo;
import com.ruoyi.common.mybatis.core.page.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 租户套餐Service接口
 *
 * @author ruoyi
 * @date 2023-02-05
 */
public interface ISysTenantPackageService {

    /**
     * 查询租户套餐
     */
    SysTenantPackageVo queryById(Long packageId);

    /**
     * 查询租户套餐列表
     */
    TableDataInfo<SysTenantPackageVo> queryPageList(SysTenantPackageBo bo, PageQuery pageQuery);

    /**
     * 查询租户套餐列表
     */
    List<SysTenantPackageVo> queryList(SysTenantPackageBo bo);

    /**
     * 新增租户套餐
     */
    Boolean insertByBo(SysTenantPackageBo bo);

    /**
     * 修改租户套餐
     */
    Boolean updateByBo(SysTenantPackageBo bo);

    /**
     * 校验并批量删除租户套餐信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}

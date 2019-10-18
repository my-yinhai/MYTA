package com.yinhai.ta404demo.mapper.read;

import com.yinhai.ta404demo.entity.EmpPo;
import com.yinhai.ta404.module.mybatis.mapper.Ta404SupportMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
* (Emp)表数据库访问层
*
* @author default
* @since 2019-09-27 17:36:44
*/
public interface EmpReadMapper extends Ta404SupportMapper{

/**
* 通过ID查询单条数据
*
* @param empno 主键
* @return 实例对象
*/
EmpPo queryById(Integer empno);

/**
* 通过实体作为筛选条件查询
*
* @param emp 实例对象
* @return 对象列表
*/
List<EmpPo> queryAll(EmpPo emp);

}
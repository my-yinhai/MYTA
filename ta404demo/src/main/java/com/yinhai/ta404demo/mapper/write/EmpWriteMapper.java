package com.yinhai.ta404demo.mapper.write;

import com.yinhai.ta404demo.entity.EmpPo;
import java.util.List;

/**
* (Emp)表数据库访问层
*
* @author default
* @since 2019-09-27 17:36:44
*/
public interface EmpWriteMapper {
/**
* 新增数据
*
* @param emp 实例对象
* @return 影响行数
*/
int insert(EmpPo emp);

/**
* 修改数据
*
* @param emp 实例对象
* @return 影响行数
*/
int update(EmpPo emp);

/**
* 通过主键删除数据
*
* @param empno 主键
* @return 影响行数
*/
int deleteById(Integer empno);

}
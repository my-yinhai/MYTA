package com.yinhai.ta404demo.service.write;

import com.yinhai.ta404demo.entity.EmpPo;
import java.util.List;

/**
* (Emp)表服务接口
*
* @author default
* @since 2019-09-27 17:36:47
*/
public interface EmpWriteService {
/**
* 新增数据
*
* @param emp 实例对象
* @return 实例对象
*/
EmpPo insert(EmpPo emp);

/**
* 修改数据
*
* @param emp 实例对象
* @return 实例对象
*/
EmpPo update(EmpPo emp);

/**
* 通过主键删除数据
*
* @param empno 主键
* @return 是否成功
*/
boolean deleteById(Integer empno);

}
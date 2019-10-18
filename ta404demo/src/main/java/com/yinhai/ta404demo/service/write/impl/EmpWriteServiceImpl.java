package com.yinhai.ta404demo.service.write.impl;

import com.yinhai.ta404demo.entity.EmpPo;
import com.yinhai.ta404demo.mapper.write.EmpWriteMapper;
import com.yinhai.ta404demo.service.write.EmpWriteService;
import com.yinhai.ta404.core.transaction.annotation.TaTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* (Emp)表服务实现类
*
* @author default
* @since 2019-09-27 17:36:47
*/
@Service
@TaTransactional
public class EmpWriteServiceImpl implements EmpWriteService {
@Resource
private EmpWriteMapper empWriteMapper;
/**
* 新增数据
*
* @param emp 实例对象
* @return 实例对象
*/
@Override
public EmpPo insert(EmpPo emp) {
this.empWriteMapper.insert(emp);
return emp;
}

/**
* 修改数据
*
* @param emp 实例对象
* @return 实例对象
*/
@Override
public EmpPo update(EmpPo emp) {
return null;
}

/**
* 通过主键删除数据
*
* @param empno 主键
* @return 是否成功
*/
@Override
public boolean deleteById(Integer empno) {
return this.empWriteMapper.deleteById(empno) > 0;
}
}
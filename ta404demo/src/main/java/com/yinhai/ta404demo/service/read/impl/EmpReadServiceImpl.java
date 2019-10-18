package com.yinhai.ta404demo.service.read.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yinhai.ta404.component.org.sysmg.resource.service.read.PageElementReadService;
import com.yinhai.ta404.core.restservice.requestbean.PageParam;
import com.yinhai.ta404.core.restservice.resultbaen.Page;
import com.yinhai.ta404demo.entity.EmpPo;
import com.yinhai.ta404demo.mapper.read.EmpReadMapper;
import com.yinhai.ta404demo.service.read.EmpReadService;
import com.yinhai.ta404.core.transaction.annotation.TaTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* (Emp)表服务实现类
*
* @author default
* @since 2019-09-27 17:36:46
*/
@Service
@TaTransactional(readOnly = true)
public class EmpReadServiceImpl implements EmpReadService {
@Resource
private EmpReadMapper empReadMapper;

/**
* 通过ID查询单条数据
*
* @param empno 主键
* @return 实例对象
*/
@Override
public EmpPo queryById(Integer empno) {
return this.empReadMapper.queryById(empno);
}

@Override
public Page queryAll(EmpPo emp, PageParam pageParam) {
    this.empReadMapper.beginPager(pageParam);
    List<EmpPo> empPos = this.empReadMapper.queryAll(emp);
    return this.empReadMapper.endPager(empPos);
}

}
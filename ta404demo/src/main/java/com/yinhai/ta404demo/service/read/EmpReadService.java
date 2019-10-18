package com.yinhai.ta404demo.service.read;

import com.github.pagehelper.PageInfo;
import com.yinhai.ta404.core.restservice.requestbean.PageParam;
import com.yinhai.ta404.core.restservice.resultbaen.Page;
import com.yinhai.ta404demo.entity.EmpPo;
import java.util.List;

/**
* (Emp)表服务接口
*
* @author default
* @since 2019-09-27 17:36:46
*/
public interface EmpReadService {

/**
* 通过ID查询单条数据
*
* @param empno 主键
* @return 实例对象
*/
EmpPo queryById(Integer empno);
Page queryAll(EmpPo emp, PageParam pageParam);
}
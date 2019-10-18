package com.yinhai.ta404demo.rest;

import com.yinhai.ta404.core.restservice.requestbean.PageParam;
import com.yinhai.ta404demo.entity.EmpPo;
import com.yinhai.ta404demo.service.read.EmpReadService;
import com.yinhai.ta404demo.service.write.EmpWriteService;
import com.yinhai.ta404.core.restservice.BaseRestService;
import org.springframework.web.bind.annotation.*;
import com.yinhai.ta404.core.restservice.annotation.RestService;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
* (Emp)表控制层
*
* @author default
* @since 2019-09-27 17:36:48
*/
@RestService("taresourceurl")
@Valid
public class EmpRestService extends BaseRestService {
/**
* 服务对象
*/
@Resource
private EmpReadService empReadService;
@Resource
private EmpWriteService empWriteService;
/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@PostMapping("selectOne")
public EmpPo selectOne(Integer id) {
return this.empReadService.queryById(id);
}

@PostMapping("queryByPage")
public void select(PageParam pageParam) {
    EmpPo empPo = new EmpPo();
 //   setData("data", this.empReadService.queryAll(empPo,pageParam));
    setPageBean(this.empReadService.queryAll(empPo,pageParam));
}
}




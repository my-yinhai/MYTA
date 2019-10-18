package com.yinhai.ta404demo.entity;

import java.util.Date;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/**
* (Emp)实体类
*
* @author default
* @since 2019-09-27 17:36:43
*/
public class EmpPo implements Serializable {
private static final long serialVersionUID = 651427757424931788L;
    //雇员编号
private Integer empno;
    //雇员姓名
private String ename;
    //职位
private String job;
    //上级领导
private Integer mgr;
    //入职时间
private Date hiredate;
    //工资
private Object sal;
    //奖金
private Object comm;
    //部门编号
private Integer deptno;
    //性别
private String gender;

    
public Integer getEmpno() {
return empno;
}

public void setEmpno(Integer empno) {
this.empno = empno;
}
    
public String getEname() {
return ename;
}

public void setEname(String ename) {
this.ename = ename;
}
    
public String getJob() {
return job;
}

public void setJob(String job) {
this.job = job;
}
    
public Integer getMgr() {
return mgr;
}

public void setMgr(Integer mgr) {
this.mgr = mgr;
}
    
public Date getHiredate() {
return hiredate;
}

public void setHiredate(Date hiredate) {
this.hiredate = hiredate;
}
    
public Object getSal() {
return sal;
}

public void setSal(Object sal) {
this.sal = sal;
}
    
public Object getComm() {
return comm;
}

public void setComm(Object comm) {
this.comm = comm;
}
    
public Integer getDeptno() {
return deptno;
}

public void setDeptno(Integer deptno) {
this.deptno = deptno;
}
    
public String getGender() {
return gender;
}

public void setGender(String gender) {
this.gender = gender;
}
        public Map toMap(){
    Map map = new HashMap();
        map.put("empno",empno);
        map.put("ename",ename);
        map.put("job",job);
        map.put("mgr",mgr);
        map.put("hiredate",hiredate);
        map.put("sal",sal);
        map.put("comm",comm);
        map.put("deptno",deptno);
        map.put("gender",gender);
        return map;
    }
        @Override
    public String toString() {
    return "Emp{" +
               ",empno ='" + empno + '\'' +
               ",ename ='" + ename + '\'' +
               ",job ='" + job + '\'' +
               ",mgr ='" + mgr + '\'' +
               ",hiredate ='" + hiredate + '\'' +
               ",sal ='" + sal + '\'' +
               ",comm ='" + comm + '\'' +
               ",deptno ='" + deptno + '\'' +
               ",gender ='" + gender + '\'' +
            '}';
    }

}
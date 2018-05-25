package com.svr.service;

import java.util.List;
import com.svr.bean.Tdept;

public interface TdeptService {

	// 根据条件查询1.1部门信息
	List<Tdept> queryDept(Integer tuserId, String dept_name, Integer dept_type, Integer currlimig, Integer branches);

	// 查询数据总量 返回分页所必须的参数
	Integer queryCount(Integer tuserId, String dept_name, Integer dept_type);

	// 根据定制游中的原部门id查询1.0部门信息
	List<Tdept> queryDeptById(String deptId, String dept_name);

	// 根据部门类型id查询部门信息
	List<Tdept> queryTdept(Integer dept_type);

	// 得到部门id 查询 t_dept
	List<Tdept> queryTDept(String deptId);
}

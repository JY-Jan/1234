/**
 * Copyrigt (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.cn.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.cn.mappers.Pm_project_bindMapper;
import com.cn.models.Pm_project_bind;
import com.github.tools.annotations.api.FunctionDescriber;
import com.github.webfrk.core.HttpBodyHandler;
import com.github.tools.annotations.ServiceDefinition;

import java.math.BigInteger;

import javax.validation.*;
import javax.validation.constraints.*;

/**
 * This code is auto-generated by <code>ServiceGenerator<code>
 *
 */
@ServiceDefinition
public class Pm_project_bindService extends HttpBodyHandler {

	@Autowired
	private Pm_project_bindMapper pm_project_bindMapper;

	@FunctionDescriber(shortName = "根据Id删除系统的约束与假设", description = "暂无", prerequisite = "暂无")
	public void deleteProjectBind(@Valid Pm_project_bind pm_project_bind) {
		 pm_project_bindMapper.deleteProjectBind(pm_project_bind);
	}

	@FunctionDescriber(shortName = "根据id更新系统的约束和假设", description = "暂无", prerequisite = "暂无")
	public Integer updateProjectBind(@Valid String project_id, String project_bd, String project_sup) {
		Pm_project_bind pm_project_bind=new Pm_project_bind();
		pm_project_bind.setProject_id(Integer.parseInt(project_id));
		pm_project_bind.setProject_bd(project_bd);
		pm_project_bind.setProject_sup(project_sup);
		System.out.println(pm_project_bind);
		return pm_project_bindMapper.updateProjectBind(pm_project_bind);
	}

	@FunctionDescriber(shortName = "根据项目id查询约束和假设", description = "暂无", prerequisite = "暂无")
	public com.cn.models.Pm_project_bind queryById(BigInteger project_id) {
		return pm_project_bindMapper.queryById(project_id);
	}

	@FunctionDescriber(shortName = "添加项目约束和假设", description = "暂无", prerequisite = "暂无")
	public void addProjectBind(@Valid Pm_project_bind pm_project_bind) {
		 int i=pm_project_bind.getProject_id();
		 BigInteger bigInteger=BigInteger.valueOf(pm_project_bind.getProject_id());
		 pm_project_bindMapper.queryById(bigInteger);
		 if(pm_project_bindMapper.queryById(bigInteger)==null) {
			 pm_project_bindMapper.addProjectBind(pm_project_bind);	 
		 }else {
			 pm_project_bindMapper.updateProjectBind(pm_project_bind);
		 }
		 
	}
	@FunctionDescriber(shortName = "展示所有的系统的约束和假设信息", description = "暂无", prerequisite = "暂无")
	public java.util.List<com.cn.models.Pm_project_bind> getPm_project_bind() {
		return pm_project_bindMapper.getPm_project_bind();
	}

}
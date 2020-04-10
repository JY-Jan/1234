/**
 * Copyrigt (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.cn.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.cn.mappers.Pm_versionMapper;
import com.cn.models.Pm_version;
import com.github.tools.annotations.api.FunctionDescriber;
import com.github.webfrk.core.HttpBodyHandler;
import com.github.tools.annotations.ServiceDefinition;
import javax.validation.*;
import javax.validation.constraints.*;

/**
 * This code is auto-generated by <code>ServiceGenerator<code>
 *
 */
@ServiceDefinition
public class Pm_versionService extends HttpBodyHandler {

	@Autowired
	private Pm_versionMapper pm_versionMapper;

	@FunctionDescriber(shortName = "创建发布计划", description = "暂无", prerequisite = "暂无")
	public void addPm_version(@Valid Pm_version pm_version) {
		 pm_versionMapper.addPm_version(pm_version);
	}

	@FunctionDescriber(shortName = "根据id删除发布计划", description = "暂无", prerequisite = "暂无")
	public void deletePm_version(@Valid Pm_version pm_version) {
		 pm_versionMapper.deletePm_version(pm_version);
	}

	@FunctionDescriber(shortName = "根据id获取到发布计划的发布名称、发布备注，发布开始时间，发布时间、发布状态，用户故事内容", description = "暂无", prerequisite = "暂无")
	public Pm_version listPm_version(Integer version_id) throws Exception{
		if(version_id == null){
			throw new Exception("请求参数有问题");
		}
		Pm_version pm_version = pm_versionMapper.listPm_version(version_id);
		return pm_version;
	}

	@FunctionDescriber(shortName = "根据id获取到发布计划的发布名称、预计发布时间、发布状态", description = "暂无", prerequisite = "暂无")
	public Pm_version queryPm_version(Integer version_id) throws Exception{
		if(version_id == null){
			throw new Exception("请求参数有问题");
		}
		Pm_version pm_version = pm_versionMapper.queryPm_version(version_id);
		return pm_version;
	}

	@FunctionDescriber(shortName = "修改发布计划", description = "暂无", prerequisite = "暂无")
	public void updatePm_version(@Valid Pm_version pm_version) {
		 pm_versionMapper.updatePm_version(pm_version);
	}

}
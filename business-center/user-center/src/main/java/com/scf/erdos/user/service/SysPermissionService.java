package com.scf.erdos.user.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.scf.erdos.common.exception.service.ServiceException;
import com.scf.erdos.common.model.SysPermission;
import com.scf.erdos.common.web.PageResult;
import com.scf.erdos.common.web.Result;

/**
* @author 作者 owen 
* @version 创建时间：2017年11月12日 上午22:57:51
 */
public interface SysPermissionService {

	/**
	 * 根绝角色ids获取权限集合
	 * 
	 * @param roleIds
	 * @return
	 */
	Set<SysPermission> findByRoleIds(Set<Long> roleIds)  throws ServiceException;

	/**
	 * 保存权限
	 * @param sysPermission
	 */
	void save(SysPermission sysPermission)  throws ServiceException;

	/**
	 * 修改权限
	 * @param sysPermission
	 */
	void update(SysPermission sysPermission)  throws ServiceException;

	/**
	 * 删除权限
	 * @param id
	 */
	void delete(Long id)  throws ServiceException;

	/**
	 * 权限列表
	 * @param params
	 * @return
	 */
	Result findPermissions(Map<String, Object> params)  throws ServiceException;

	/**
	 * 授权
	 * @param roleId
	 * @param authIds
	 */
	void setAuthToRole(Long roleId, Set<Long> authIds)  throws ServiceException;

	/**
	 * 根据roleId获取对应的权限
	 */
	List<Map<String, Object>> findAuthByRoleId(Long roleId);

}

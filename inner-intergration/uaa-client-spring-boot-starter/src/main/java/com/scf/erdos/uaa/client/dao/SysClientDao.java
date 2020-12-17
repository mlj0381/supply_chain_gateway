package com.scf.erdos.uaa.client.dao;

import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Description : 查询应用绑定的资源权限
 * @author：bao-clm
 * @date: 2020/3/25
 * @version：1.0
 */
@Mapper
@SuppressWarnings("all")
public interface SysClientDao {

	@Select("select * from oauth_client_details t where t.client_id = #{clientId}")
	Map getClient(String clientId);

}

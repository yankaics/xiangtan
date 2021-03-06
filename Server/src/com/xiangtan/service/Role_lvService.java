package com.xiangtan.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.xiangtan.beans.Area;
import com.xiangtan.beans.Role_lv;
import com.xiangtan.beans.Userinfo_lv;

/**
 * @author Shangyidong
 * @date 2014-11-21
 * @version 1.0
 */
//@WebService
public interface Role_lvService {

	/**
	 * 根据id查询角色
	 * @param id 角色id
	 * @return 查询到的Role_lv对象。若查询失败则返回null
	 */
//	@WebMethod
	public Role_lv getRole_lv(int id, String key);
	
	/**
	 * 根据角色名查询角色
	 * @param roleName 角色名称
	 * @return 查询到的Role_lv对象。若查询失败则返回null
	 */
//	@WebMethod
	public Role_lv getByRoleName(String roleName, String key);
	
	/**
	 * 根据角色名删除角色
	 * @param roleName 角色名称
	 * @return 若删除成功则返回true，否则返回false
	 */
//	@WebMethod
	public boolean deleteByRoleName(String roleName, String key);
	
	/**
	 * 根据角色id删除角色
	 * @param id 角色id
	 * @return 若删除成功则返回true，否则返回false
	 */
//	@WebMethod
	public boolean deleteByRoleId(int id, String key);
	
	/**
	 * 添加角色
	 * @param roleName 角色名称
	 * @param type 角色类型
	 * @param desText 角色信息
	 * @return 若添加成功则返回添加成功的Role_lv对象。否则返回null
	 */
//	@WebMethod
	public Role_lv addRole_lv(String roleName, String type, String desText, String key);
	
	/**
	 * 更新角色信息
	 * @param id 角色id
	 * @param roleName 角色名称
	 * @param type 角色类型
	 * @param desText 角色信息
	 * @return 返回更新成功的Role_lv对象。若更新失败则返回null
	 */
//	@WebMethod
	public Role_lv updateRole_lv(int id, String roleName, String type, String desText, String key);
	
	/***
	 * 根据用户ID查询用户所属的角色
	 * @param userid 用户id
	 * @return
	 */
//	@WebMethod
	public List<Role_lv> getRole_lvsByUserid(int userid, String key);
	
	/**
	 * 根据用户名称查询用户所属的角色
	 * @param username 用户名
	 * @param key
	 * @return
	 */
	public List<Role_lv> getRole_lvsByUsername(String username, String key);
	
	/***
	 * 查询所有角色
	 * @return
	 */
//	@WebMethod
	public List<Role_lv> getAll(String key);
	
	/**
	 * @param pageSize 每页记录数
	 * @param currentPage 当前页码
	 * @return
	 */
//	@WebMethod
	public List<Role_lv> getRolesByPager(int pageSize, int currentPage, String key);
	
	/**
	 * 
	 * @param desText 地区权限描述字符串
	 * @return
	 */
//	@WebMethod
	public List<Area> getAreasByDesText(String desText, String key);
}

/*
 * 	private int id;
	private String roleName;
	private String type;
	private String desText;
 */

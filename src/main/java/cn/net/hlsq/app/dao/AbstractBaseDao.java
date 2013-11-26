package cn.net.hlsq.app.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import cn.net.hlsq.app.model.BaseModel;

public abstract class AbstractBaseDao<T> {

	// SPRING JDBC模板接口
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcInsert simpleJdbcInsert;

	public SimpleJdbcInsert getSimpleJdbcInsert() {
		return simpleJdbcInsert;
	}

	@Resource
	public void setSimpleJdbcInsert(SimpleJdbcInsert simpleJdbcInsert) {
		this.simpleJdbcInsert = simpleJdbcInsert;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Resource
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public abstract void execute(T model);

	/**
	 * 保存或更新
	 * 
	 * @author gefangshuai
	 * @param baseModel
	 */
	public abstract void saveOrUpdate(T model);

	/**
	 * 查询对象
	 * 
	 * @author gefangshuai
	 * @param id
	 * @return
	 */
	public abstract BaseModel get(int id);

	/**
	 * 删除
	 * 
	 * @author gefangshuai
	 * @param id
	 */
	public abstract void delete(int id);

}
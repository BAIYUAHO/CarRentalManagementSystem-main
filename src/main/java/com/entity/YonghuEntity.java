package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * User
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
@TableName("yonghu")
public class YonghuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonghuEntity() {
		
	}
	
	public YonghuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * Account
	 */
					
	private String zhanghao;
	
	/**
	 * Password
	 */
					
	private String mima;
	
	/**
	 * Name
	 */
					
	private String xingming;
	
	/**
	 * Gender
	 */
					
	private String xingbie;
	
	/**
	 * Age
	 */
					
	private Integer nianling;
	
	/**
	 * Phone Number
	 */
					
	private String shouji;
	
	/**
	 * E-Mail
	 */
					
	private String youxiang;
	
	/**
	 * Photo
	 */
					
	private String zhaopian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：Account
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：Account
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：Password
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：Password
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：Name
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：Name
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：Gender
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：Gender
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：Age
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：Age
	 */
	public Integer getNianling() {
		return nianling;
	}
	/**
	 * 设置：Phone Number
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：Phone Number
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：E-Mail
	 */
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	/**
	 * 获取：E-Mail
	 */
	public String getYouxiang() {
		return youxiang;
	}
	/**
	 * 设置：Photo
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：Photo
	 */
	public String getZhaopian() {
		return zhaopian;
	}

}

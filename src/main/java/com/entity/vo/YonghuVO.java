package com.entity.vo;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * User
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
public class YonghuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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

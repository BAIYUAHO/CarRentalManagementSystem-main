package com.entity.model;

import com.entity.NewsEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * Announcement
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
public class NewsModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Introduction
	 */
	
	private String introduction;
		
	/**
	 * Picture
	 */
	
	private String picture;
		
	/**
	 * Content
	 */
	
	private String content;
				
	
	/**
	 * 设置：Introduction
	 */
	 
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	/**
	 * 获取：Introduction
	 */
	public String getIntroduction() {
		return introduction;
	}
				
	
	/**
	 * 设置：Picture
	 */
	 
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/**
	 * 获取：Picture
	 */
	public String getPicture() {
		return picture;
	}
				
	
	/**
	 * 设置：Content
	 */
	 
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * 获取：Content
	 */
	public String getContent() {
		return content;
	}
			
}

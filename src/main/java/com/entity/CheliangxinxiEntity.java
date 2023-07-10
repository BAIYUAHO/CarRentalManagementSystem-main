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
 * Information
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
@TableName("cheliangxinxi")
public class CheliangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CheliangxinxiEntity() {
		
	}
	
	public CheliangxinxiEntity(T t) {
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
	 * Vehicle Name
	 */
					
	private String cheliangmingcheng;
	
	/**
	 * License plate number
	 */
					
	private String chepaihaoma;
	
	/**
	 * Vehicle Brand
	 */
					
	private String cheliangpinpai;
	
	/**
	 * Vehicle Type
	 */
					
	private String cheliangleixing;
	
	/**
	 * Vehicle Picture
	 */
					
	private String cheliangzhaopian;
	
	/**
	 * Vehicle Color
	 */
					
	private String cheliangyanse;
	
	/**
	 * Gearshift method
	 */
					
	private String huandangfangshi;
	
	/**
	 * Vehicle sunroof
	 */
					
	private String cheliangtianchuang;
	
	/**
	 * Number of seats
	 */
					
	private String chezuo;
	
	/**
	 * Sales price
	 */
					
	private Integer zulinjiage;
	
	/**
	 * Vehicle Details
	 */
					
	private String cheliangxiangqing;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 倒计结束时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date reversetime;
	
	
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
	 * 设置：Vehicle Name
	 */
	public void setCheliangmingcheng(String cheliangmingcheng) {
		this.cheliangmingcheng = cheliangmingcheng;
	}
	/**
	 * 获取：Vehicle Name
	 */
	public String getCheliangmingcheng() {
		return cheliangmingcheng;
	}
	/**
	 * 设置：License plate number
	 */
	public void setChepaihaoma(String chepaihaoma) {
		this.chepaihaoma = chepaihaoma;
	}
	/**
	 * 获取：License plate number
	 */
	public String getChepaihaoma() {
		return chepaihaoma;
	}
	/**
	 * 设置：Vehicle Brand
	 */
	public void setCheliangpinpai(String cheliangpinpai) {
		this.cheliangpinpai = cheliangpinpai;
	}
	/**
	 * 获取：Vehicle Brand
	 */
	public String getCheliangpinpai() {
		return cheliangpinpai;
	}
	/**
	 * 设置：Vehicle Type
	 */
	public void setCheliangleixing(String cheliangleixing) {
		this.cheliangleixing = cheliangleixing;
	}
	/**
	 * 获取：Vehicle Type
	 */
	public String getCheliangleixing() {
		return cheliangleixing;
	}
	/**
	 * 设置：Vehicle Picture
	 */
	public void setCheliangzhaopian(String cheliangzhaopian) {
		this.cheliangzhaopian = cheliangzhaopian;
	}
	/**
	 * 获取：Vehicle Picture
	 */
	public String getCheliangzhaopian() {
		return cheliangzhaopian;
	}
	/**
	 * 设置：Vehicle Color
	 */
	public void setCheliangyanse(String cheliangyanse) {
		this.cheliangyanse = cheliangyanse;
	}
	/**
	 * 获取：Vehicle Color
	 */
	public String getCheliangyanse() {
		return cheliangyanse;
	}
	/**
	 * 设置：Gearshift method
	 */
	public void setHuandangfangshi(String huandangfangshi) {
		this.huandangfangshi = huandangfangshi;
	}
	/**
	 * 获取：Gearshift method
	 */
	public String getHuandangfangshi() {
		return huandangfangshi;
	}
	/**
	 * 设置：Vehicle sunroof
	 */
	public void setCheliangtianchuang(String cheliangtianchuang) {
		this.cheliangtianchuang = cheliangtianchuang;
	}
	/**
	 * 获取：Vehicle sunroof
	 */
	public String getCheliangtianchuang() {
		return cheliangtianchuang;
	}
	/**
	 * 设置：Number of seats
	 */
	public void setChezuo(String chezuo) {
		this.chezuo = chezuo;
	}
	/**
	 * 获取：Number of seats
	 */
	public String getChezuo() {
		return chezuo;
	}
	/**
	 * 设置：Sales price
	 */
	public void setZulinjiage(Integer zulinjiage) {
		this.zulinjiage = zulinjiage;
	}
	/**
	 * 获取：Sales price
	 */
	public Integer getZulinjiage() {
		return zulinjiage;
	}
	/**
	 * 设置：Vehicle Details
	 */
	public void setCheliangxiangqing(String cheliangxiangqing) {
		this.cheliangxiangqing = cheliangxiangqing;
	}
	/**
	 * 获取：Vehicle Details
	 */
	public String getCheliangxiangqing() {
		return cheliangxiangqing;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：倒计结束时间
	 */
	public void setReversetime(Date reversetime) {
		this.reversetime = reversetime;
	}
	/**
	 * 获取：倒计结束时间
	 */
	public Date getReversetime() {
		return reversetime;
	}

}

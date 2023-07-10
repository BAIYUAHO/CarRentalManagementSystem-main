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
 * Delivery Record
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
@TableName("haichejilu")
public class HaichejiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HaichejiluEntity() {
		
	}
	
	public HaichejiluEntity(T t) {
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
	 * Name
	 */
					
	private String xingming;
	
	/**
	 * Phone Number
	 */
					
	private String shouji;
	
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
	 * Gearshift method
	 */
					
	private String huandangfangshi;
	
	/**
	 * Sales price
	 */
					
	private String zulinjiage;
	
	/**
	 * Delivery date
	 */
					
	private String haicheriqi;
	
	/**
	 * Quantity
	 */
					
	private Integer zulintianshu;
	
	/**
	 * Remark
	 */
					
	private String qiyushixiang;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * Review reply
	 */
					
	private String shhf;
	
	
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
	 * 设置：Sales price
	 */
	public void setZulinjiage(String zulinjiage) {
		this.zulinjiage = zulinjiage;
	}
	/**
	 * 获取：Sales price
	 */
	public String getZulinjiage() {
		return zulinjiage;
	}
	/**
	 * 设置：Delivery date
	 */
	public void setHaicheriqi(String haicheriqi) {
		this.haicheriqi = haicheriqi;
	}
	/**
	 * 获取：Delivery date
	 */
	public String getHaicheriqi() {
		return haicheriqi;
	}
	/**
	 * 设置：Quantity
	 */
	public void setZulintianshu(Integer zulintianshu) {
		this.zulintianshu = zulintianshu;
	}
	/**
	 * 获取：Quantity
	 */
	public Integer getZulintianshu() {
		return zulintianshu;
	}
	/**
	 * 设置：Remark
	 */
	public void setQiyushixiang(String qiyushixiang) {
		this.qiyushixiang = qiyushixiang;
	}
	/**
	 * 获取：Remark
	 */
	public String getQiyushixiang() {
		return qiyushixiang;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：Review reply
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：Review reply
	 */
	public String getShhf() {
		return shhf;
	}

}

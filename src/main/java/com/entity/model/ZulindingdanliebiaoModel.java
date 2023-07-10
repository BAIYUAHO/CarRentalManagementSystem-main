package com.entity.model;

import com.entity.ZulindingdanliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * Sales orders
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
public class ZulindingdanliebiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * Quantity
	 */
	
	private Integer zulintianshu;
		
	/**
	 * Pick-up date
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ticheriqi;
		
	/**
	 * Actual amount paid
	 */
	
	private String shifujine;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * Review reply
	 */
	
	private String shhf;
		
	/**
	 * Payment State
	 */
	
	private String ispay;
				
	
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
	 * 设置：Pick-up date
	 */
	 
	public void setTicheriqi(Date ticheriqi) {
		this.ticheriqi = ticheriqi;
	}
	
	/**
	 * 获取：Pick-up date
	 */
	public Date getTicheriqi() {
		return ticheriqi;
	}
				
	
	/**
	 * 设置：Actual amount paid
	 */
	 
	public void setShifujine(String shifujine) {
		this.shifujine = shifujine;
	}
	
	/**
	 * 获取：Actual amount paid
	 */
	public String getShifujine() {
		return shifujine;
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
				
	
	/**
	 * 设置：Payment State
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：Payment State
	 */
	public String getIspay() {
		return ispay;
	}
			
}

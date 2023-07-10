package com.entity.model;

import com.entity.CheliangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * Information
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
public class CheliangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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

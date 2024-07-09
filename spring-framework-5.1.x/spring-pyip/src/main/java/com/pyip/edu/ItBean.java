package com.pyip.edu;

/**
 * @ClassName: ItBean
 * @version: 1.0
 * @Author: pyipXt
 * @Description: TODO
 **/
public class ItBean {

	private LagouBean lagouBean;

	public void setLagouBean(LagouBean lagouBean) {
		this.lagouBean = lagouBean;
	}

	/**
	 * 构造函数
	 */
	public ItBean(){
		System.out.println("ItBean 构造器...");
	}
}

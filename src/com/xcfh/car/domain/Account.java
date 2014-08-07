package com.xcfh.car.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***********************************************************************
 * Module:  tb_car_account.java
 * Author:  xcfh
 * Purpose: Defines the Class tb_car_account
 ***********************************************************************/

/**
 * 车的账目总表
 * 
 * @pdOid 4e2a6c6a-5eba-4fbb-bfae-f5e6339454fa
 */
@ Entity
@ Table(name = "tb_car_account")
public class Account {
	/**
	 * 账目ID
	 * 
	 * 
	 * @pdOid ec24ab94-0f12-4355-88f6-5cc636887de0
	 */
	private java.lang.String car_acc_id;
	/**
	 * 车ID
	 */
	private java.lang.String car_id;
	/**
	 * 多选
	 * 
	 * @pdOid 17ba10fc-918f-4f55-9377-2dc1291600f5
	 */
	private java.lang.String car_acctyp_id;
	/**
	 * 起始时间
	 * 
	 * @pdOid 0f1e5a4d-164b-4ed6-b509-05ea2fd94f93
	 */
	private java.lang.String car_acc_statim;
	/**
	 * 截止时间
	 * 
	 * @pdOid 7401f30d-a1b6-4cd3-bfea-85b99a5b4483
	 */
	private java.lang.String car_acc_endtim;
	/**
	 * 金额
	 * 
	 * @pdOid 0920da19-9384-4cdf-ba28-1a70cbc9eb1b
	 */
	private java.lang.String car_acc_pri;
	/**
	 * 里程
	 * 
	 * @pdOid 2c6b0f19-46bf-4fae-812e-556b8ff45f20
	 */
	private java.lang.String car_acc_mil;
	/**
	 * 地理位置
	 * 
	 * @pdOid 7c3a066a-26a1-4d6b-8baf-3cc04ab62a36
	 */
	private java.lang.String car_acc_pos;
	/**
	 * 商家名称
	 * 
	 * @pdOid 56131759-8c7d-4f8f-8f2f-abd007879c0f
	 */
	private java.lang.String car_acc_busi;
	/**
	 * 商家电话
	 * 
	 * @pdOid 1ef49caf-b2bf-47a4-9a55-8bb74d1f6b9e
	 */
	private java.lang.String car_acc_ph;
	/**
	 * 支付类型
	 * 
	 * @pdOid a8d72ea0-6679-411e-8f04-d51a44c634de
	 */
	private java.lang.String car_acc_paytyp;
	/**
	 * 备注
	 * 
	 * @pdOid 56f6dbc7-763e-4df9-b197-3ede32308a3a
	 */
	private java.lang.String car_acc_rem;
	/**
	 * 时间戳
	 * 
	 * @pdOid deeaec0c-4f2f-4067-8f22-7e08f907d904
	 */
	private java.util.Date car_timsta;
	/**
	 * 有无图片
	 * 
	 * @pdOid 28184f33-2bc7-43a5-b9a0-7eee4b238bb4
	 */
	private java.lang.String car_imgflg;

	@ Id
	@ Column(name = "car_acc_id")
	public java.lang.String getCar_acc_id() {

		return car_acc_id;
	}

	public void setCar_acc_id(java.lang.String car_acc_id) {

		this.car_acc_id = car_acc_id;
	}

	@ Column(name = "car_id")
	public java.lang.String getCar_id() {

		return car_id;
	}

	public void setCar_id(java.lang.String car_id) {

		this.car_id = car_id;
	}

	@ Column(name = "car_acctyp_id")
	public java.lang.String getCar_acctyp_id() {

		return car_acctyp_id;
	}

	public void setCar_acctyp_id(java.lang.String car_acctyp_id) {

		this.car_acctyp_id = car_acctyp_id;
	}

	@ Column(name = "car_acc_statim")
	public java.lang.String getCar_acc_statim() {

		return car_acc_statim;
	}

	public void setCar_acc_statim(java.lang.String car_acc_statim) {

		this.car_acc_statim = car_acc_statim;
	}

	@ Column(name = "car_acc_endtim")
	public java.lang.String getCar_acc_endtim() {

		return car_acc_endtim;
	}

	public void setCar_acc_endtim(java.lang.String car_acc_endtim) {

		this.car_acc_endtim = car_acc_endtim;
	}

	@ Column(name = "car_acc_pri")
	public java.lang.String getCar_acc_pri() {

		return car_acc_pri;
	}

	public void setCar_acc_pri(java.lang.String car_acc_pri) {

		this.car_acc_pri = car_acc_pri;
	}

	@ Column(name = "car_acc_mil")
	public java.lang.String getCar_acc_mil() {

		return car_acc_mil;
	}

	public void setCar_acc_mil(java.lang.String car_acc_mil) {

		this.car_acc_mil = car_acc_mil;
	}

	@ Column(name = "car_acc_pos")
	public java.lang.String getCar_acc_pos() {

		return car_acc_pos;
	}

	public void setCar_acc_pos(java.lang.String car_acc_pos) {

		this.car_acc_pos = car_acc_pos;
	}

	@ Column(name = "car_acc_busi")
	public java.lang.String getCar_acc_busi() {

		return car_acc_busi;
	}

	public void setCar_acc_busi(java.lang.String car_acc_busi) {

		this.car_acc_busi = car_acc_busi;
	}

	@ Column(name = "car_acc_ph")
	public java.lang.String getCar_acc_ph() {

		return car_acc_ph;
	}

	public void setCar_acc_ph(java.lang.String car_acc_ph) {

		this.car_acc_ph = car_acc_ph;
	}

	@ Column(name = "car_acc_paytyp")
	public java.lang.String getCar_acc_paytyp() {

		return car_acc_paytyp;
	}

	public void setCar_acc_paytyp(java.lang.String car_acc_paytyp) {

		this.car_acc_paytyp = car_acc_paytyp;
	}

	@ Column(name = "car_acc_rem")
	public java.lang.String getCar_acc_rem() {

		return car_acc_rem;
	}

	public void setCar_acc_rem(java.lang.String car_acc_rem) {

		this.car_acc_rem = car_acc_rem;
	}

	@ Column
	public java.util.Date getCar_timsta() {

		return car_timsta;
	}

	public void setCar_timsta(java.util.Date car_timsta) {

		this.car_timsta = car_timsta;
	}

	@ Column(name = "car_imgflg")
	public java.lang.String getCar_imgflg() {

		return car_imgflg;
	}

	public void setCar_imgflg(java.lang.String car_imgflg) {

		this.car_imgflg = car_imgflg;
	}

}
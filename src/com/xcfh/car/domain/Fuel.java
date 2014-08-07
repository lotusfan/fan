package com.xcfh.car.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***********************************************************************
 * Module:  tb_car_fuelnew.java
 * Author:  xcfh
 * Purpose: Defines the Class tb_car_fuelnew
 ***********************************************************************/

/** @pdOid 4e6f4c8a-cc85-4dca-b443-9da768740015 */
@ Entity
@ Table(name = "tb_car_fuel")
public class Fuel {
	/**
	 * 加油信息ID
	 * 
	 * @pdOid faf386aa-c77c-43bd-bc94-7074ca1d855d
	 */
	private java.lang.String car_fue_id;

	/**
	 * 车ID
	 */
	private java.lang.String car_id;
	/**
	 * 加油状态
	 * 
	 * @pdOid 3bfba0d4-3227-4cf9-bc9d-1579a53e1f39
	 */
	private java.lang.String car_fue_flg;
	/**
	 * 加油量
	 * 
	 * @pdOid 12327ae7-4926-4eee-9af4-b1dcae99c673
	 */
	private java.lang.String car_fue_vol;
	/**
	 * 燃油规格
	 * 
	 * @pdOid 0179f27f-e8ee-4b84-af1f-004dfefa27c7
	 */
	private java.lang.String car_fue_sta;
	/**
	 * 油耗
	 * 
	 * @pdOid ded564d9-543c-4056-b7b6-74cd5bd2038f
	 */
	private java.lang.String car_fue_eco;
	/**
	 * 图片标志位
	 * 
	 * @pdOid 1d9ec37c-ab89-4be3-ae12-3f0b9ab79453
	 */
	private java.lang.String car_imgflg;
	/**
	 * 价格
	 * 
	 * @pdOid 194ea839-ea9b-4495-8be3-e560a459d132
	 */
	private java.lang.String car_fue_pri;
	/**
	 * 总价
	 * 
	 * @pdOid 2e00eb5a-b9c6-4172-bdf7-2295a191f92e
	 */
	private java.lang.String car_fue_tot;
	/**
	 * 地理位置
	 * 
	 * @pdOid 14db9650-9215-4689-8d38-e02d4b7de96d
	 */
	private java.lang.String car_fue_pos;
	/**
	 * 加油时间
	 * 
	 * @pdOid a5bf9a82-9c6c-4e47-a8c6-c759789c4ef4
	 */
	private java.lang.String car_fue_tim;
	/**
	 * 时间戳
	 * 
	 * @pdOid f594e183-cb57-4cfe-94dc-0091190636ae
	 */
	private java.util.Date car_fue_statim;
	/**
	 * 电话
	 * 
	 * @pdOid e5324ef9-3338-46e4-beb8-c9502b14688b
	 */
	private java.lang.String car_fue_ph;
	/**
	 * 燃油品牌
	 * 
	 * @pdOid 4761091e-3e4b-4f81-b146-74e34825bfa3
	 */
	private java.lang.String car_fue_brd;
	/**
	 * 支付类型
	 * 
	 * @pdOid 9b7f26fc-b55c-4792-9c51-d87607bf23cf
	 */
	private java.lang.String car_fue_paytyp;

	@ Id
	@ Column(name = "car_fue_id")
	public java.lang.String getCar_fue_id() {

		return car_fue_id;
	}

	public void setCar_fue_id(java.lang.String car_fue_id) {

		this.car_fue_id = car_fue_id;
	}

	@ Column(name = "car_id")
	public java.lang.String getCar_id() {

		return car_id;
	}

	public void setCar_id(java.lang.String car_id) {

		this.car_id = car_id;
	}

	@ Column(name = "car_fue_flg")
	public java.lang.String getCar_fue_flg() {

		return car_fue_flg;
	}

	public void setCar_fue_flg(java.lang.String car_fue_flg) {

		this.car_fue_flg = car_fue_flg;
	}

	@ Column(name = "car_fue_vol")
	public java.lang.String getCar_fue_vol() {

		return car_fue_vol;
	}

	public void setCar_fue_vol(java.lang.String car_fue_vol) {

		this.car_fue_vol = car_fue_vol;
	}

	@ Column(name = "car_fue_sta")
	public java.lang.String getCar_fue_sta() {

		return car_fue_sta;
	}

	public void setCar_fue_sta(java.lang.String car_fue_sta) {

		this.car_fue_sta = car_fue_sta;
	}

	@ Column(name = "car_fue_eco")
	public java.lang.String getCar_fue_eco() {

		return car_fue_eco;
	}

	public void setCar_fue_eco(java.lang.String car_fue_eco) {

		this.car_fue_eco = car_fue_eco;
	}

	@ Column(name = "car_imgflg")
	public java.lang.String getCar_imgflg() {

		return car_imgflg;
	}

	public void setCar_imgflg(java.lang.String car_imgflg) {

		this.car_imgflg = car_imgflg;
	}

	@ Column(name = "car_fue_pri")
	public java.lang.String getCar_fue_pri() {

		return car_fue_pri;
	}

	public void setCar_fue_pri(java.lang.String car_fue_pri) {

		this.car_fue_pri = car_fue_pri;
	}

	@ Column(name = "car_fue_tot")
	public java.lang.String getCar_fue_tot() {

		return car_fue_tot;
	}

	public void setCar_fue_tot(java.lang.String car_fue_tot) {

		this.car_fue_tot = car_fue_tot;
	}

	@ Column(name = "car_fue_pos")
	public java.lang.String getCar_fue_pos() {

		return car_fue_pos;
	}

	public void setCar_fue_pos(java.lang.String car_fue_pos) {

		this.car_fue_pos = car_fue_pos;
	}

	@ Column(name = "car_fue_tim")
	public java.lang.String getCar_fue_tim() {

		return car_fue_tim;
	}

	public void setCar_fue_tim(java.lang.String car_fue_tim) {

		this.car_fue_tim = car_fue_tim;
	}

	@ Column
	public java.util.Date getCar_fue_statim() {

		return car_fue_statim;
	}

	public void setCar_fue_statim(java.util.Date car_fue_statim) {

		this.car_fue_statim = car_fue_statim;
	}

	@ Column(name = "car_fue_ph")
	public java.lang.String getCar_fue_ph() {

		return car_fue_ph;
	}

	public void setCar_fue_ph(java.lang.String car_fue_ph) {

		this.car_fue_ph = car_fue_ph;
	}

	@ Column(name = "car_fue_brd")
	public java.lang.String getCar_fue_brd() {

		return car_fue_brd;
	}

	public void setCar_fue_brd(java.lang.String car_fue_brd) {

		this.car_fue_brd = car_fue_brd;
	}

	@ Column(name = "car_fue_paytyp")
	public java.lang.String getCar_fue_paytyp() {

		return car_fue_paytyp;
	}

	public void setCar_fue_paytyp(java.lang.String car_fue_paytyp) {

		this.car_fue_paytyp = car_fue_paytyp;
	}

}
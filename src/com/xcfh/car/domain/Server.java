package com.xcfh.car.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***********************************************************************
 * Module:  tb_car_ser.java
 * Author:  xcfh
 * Purpose: Defines the Class tb_car_ser
 ***********************************************************************/

/** @pdOid 5f833446-3808-457e-848d-d6f32f7af665 */
@ Entity
@ Table(name = "tb_car_ser")
public class Server {
	/**
	 * 服务信息ID
	 * 
	 * @pdOid a491aa26-48bc-4c4e-b3a9-33e0935b9e87
	 */
	private java.lang.String car_ser_id;
	/**
	 * 车ID
	 */
	private java.lang.String car_id;

	/**
	 * 里程
	 * 
	 * @pdOid 74a6d648-2127-4214-adde-7a3373e65278
	 */
	private java.lang.String car_ser_mil;
	/**
	 * 金额
	 * 
	 * @pdOid a76a7b78-4b24-42fc-b6d6-fe48ffdf7e76
	 */
	private java.lang.String car_ser_pri;
	/**
	 * 时间
	 * 
	 * @pdOid 485aedb5-d972-4019-9bc9-36c72fba237e
	 */
	private java.lang.String car_ser_tim;
	/**
	 * 电话
	 * 
	 * @pdOid c468d793-8029-4bf1-af36-85d37b7c2fed
	 */
	private java.lang.String car_ser_ph;
	/**
	 * 品牌
	 * 
	 * @pdOid a2b5d03a-f4ce-47a2-a3bf-3aacb7936b7a
	 */
	private java.lang.String car_ser_brd;
	/**
	 * 服务类型
	 * 
	 * @pdOid aa83775b-a468-485c-9bbd-7f08d43ca938
	 */
	private java.lang.String car_ser_typ;
	/**
	 * 支付类型
	 * 
	 * @pdOid 6ee1768e-cb04-4f6b-b079-1155997e427e
	 */
	private java.lang.String car_ser_paytyp;
	/**
	 * 地点
	 * 
	 * @pdOid 8984a88d-b1bd-4159-a3b8-6ce8511c0ce6
	 */
	private java.lang.String car_ser_pos;
	/**
	 * 备注
	 * 
	 * @pdOid 7a8114cd-9ab4-45a9-9ae9-723c3fdf555b
	 */
	private java.lang.String car_ser_rem;
	/**
	 * 时间戳
	 * 
	 * @pdOid 96d9c388-c732-4102-a0a8-9973c0289843
	 */
	private java.util.Date car_timsta;
	/**
	 * 图片标志位
	 * 
	 * @pdOid c8af5b67-0341-48ca-a9fa-4971a5e0d30a
	 */
	private java.lang.String car_imgflg;

	@ Id
	@ Column
	public java.lang.String getCar_ser_id() {

		return car_ser_id;
	}

	public void setCar_ser_id(java.lang.String car_ser_id) {

		this.car_ser_id = car_ser_id;
	}

	@ Column
	public java.lang.String getCar_id() {

		return car_id;
	}

	public void setCar_id(java.lang.String car_id) {

		this.car_id = car_id;
	}

	@ Column
	public java.lang.String getCar_ser_mil() {

		return car_ser_mil;
	}

	public void setCar_ser_mil(java.lang.String car_ser_mil) {

		this.car_ser_mil = car_ser_mil;
	}

	@ Column
	public java.lang.String getCar_ser_pri() {

		return car_ser_pri;
	}

	public void setCar_ser_pri(java.lang.String car_ser_pri) {

		this.car_ser_pri = car_ser_pri;
	}

	@ Column
	public java.lang.String getCar_ser_tim() {

		return car_ser_tim;
	}

	public void setCar_ser_tim(java.lang.String car_ser_tim) {

		this.car_ser_tim = car_ser_tim;
	}

	@ Column
	public java.lang.String getCar_ser_ph() {

		return car_ser_ph;
	}

	public void setCar_ser_ph(java.lang.String car_ser_ph) {

		this.car_ser_ph = car_ser_ph;
	}

	@ Column
	public java.lang.String getCar_ser_brd() {

		return car_ser_brd;
	}

	public void setCar_ser_brd(java.lang.String car_ser_brd) {

		this.car_ser_brd = car_ser_brd;
	}

	@ Column
	public java.lang.String getCar_ser_typ() {

		return car_ser_typ;
	}

	public void setCar_ser_typ(java.lang.String car_ser_typ) {

		this.car_ser_typ = car_ser_typ;
	}

	@ Column
	public java.lang.String getCar_ser_paytyp() {

		return car_ser_paytyp;
	}

	public void setCar_ser_paytyp(java.lang.String car_ser_paytyp) {

		this.car_ser_paytyp = car_ser_paytyp;
	}

	@ Column
	public java.lang.String getCar_ser_pos() {

		return car_ser_pos;
	}

	public void setCar_ser_pos(java.lang.String car_ser_pos) {

		this.car_ser_pos = car_ser_pos;
	}

	@ Column
	public java.lang.String getCar_ser_rem() {

		return car_ser_rem;
	}

	public void setCar_ser_rem(java.lang.String car_ser_rem) {

		this.car_ser_rem = car_ser_rem;
	}

	@ Column
	public java.util.Date getCar_timsta() {

		return car_timsta;
	}

	public void setCar_timsta(java.util.Date car_timsta) {

		this.car_timsta = car_timsta;
	}

	@ Column
	public java.lang.String getCar_imgflg() {

		return car_imgflg;
	}

	public void setCar_imgflg(java.lang.String car_imgflg) {

		this.car_imgflg = car_imgflg;
	}

}
package com.xcfh.car.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***********************************************************************
 * Module:  tb_car_insucomnew.java
 * Author:  xcfh
 * Purpose: Defines the Class tb_car_insucomnew
 ***********************************************************************/

/** @pdOid a7d742e7-3926-4269-87ce-2ecaa3220886 */
@ Entity
@ Table(name = "tb_car_insucom")
public class Insucom {
	/**
	 * 保险信息ID
	 * 
	 * @pdOid 166e4fd6-10d2-4f4f-a29b-23e7867c04f3
	 */
	private java.lang.String car_ins_id;
	/**
	 * 车ID
	 */
	private java.lang.String car_id;
	/**
	 * 保险公司
	 * 
	 * @pdOid 5d88ca19-8b1e-443b-86ca-433492b4eba0
	 */
	private java.lang.String car_ins_com;
	/**
	 * 险别ID
	 * 
	 * @pdOid 6f008726-0a90-452f-be0d-f6f065c77ed9
	 */
	private java.lang.String car_ins_levID;
	/**
	 * 购买时间
	 * 
	 * @pdOid 25750a6b-5151-41dc-908d-539617dd7927
	 */
	private java.lang.String car_ins_purtim;
	/**
	 * 起始时间
	 * 
	 * @pdOid a168016e-8f11-4be0-9533-25a2a33513e6
	 */
	private java.lang.String car_ins_statim;
	/**
	 * 结束时间
	 * 
	 * @pdOid cd0d7e54-c6ea-4bdb-940d-1f503b63693f
	 */
	private java.lang.String car_ins_endtim;
	/**
	 * 电话
	 * 
	 * @pdOid b1c3805e-0f45-47d5-a20d-edef8eb3accb
	 */
	private java.lang.String car_ins_ph;
	/**
	 * 时间戳
	 * 
	 * @pdOid 371e480b-2b58-40e7-a04d-0db9d8db6f72
	 */
	private java.util.Date car_timsta;

	@ Id
	@ Column(name = "car_ins_id")
	public java.lang.String getCar_ins_id() {

		return car_ins_id;
	}

	public void setCar_ins_id(java.lang.String car_ins_id) {

		this.car_ins_id = car_ins_id;
	}

	@ Column(name = "car_id")
	public java.lang.String getCar_id() {

		return car_id;
	}

	public void setCar_id(java.lang.String car_id) {

		this.car_id = car_id;
	}

	@ Column(name = "car_ins_com")
	public java.lang.String getCar_ins_com() {

		return car_ins_com;
	}

	public void setCar_ins_com(java.lang.String car_ins_com) {

		this.car_ins_com = car_ins_com;
	}

	@ Column(name = "car_ins_levID")
	public java.lang.String getCar_ins_levID() {

		return car_ins_levID;
	}

	public void setCar_ins_levID(java.lang.String car_ins_levID) {

		this.car_ins_levID = car_ins_levID;
	}

	@ Column(name = "car_ins_purtim")
	public java.lang.String getCar_ins_purtim() {

		return car_ins_purtim;
	}

	public void setCar_ins_purtim(java.lang.String car_ins_purtim) {

		this.car_ins_purtim = car_ins_purtim;
	}

	@ Column(name = "car_ins_statim")
	public java.lang.String getCar_ins_statim() {

		return car_ins_statim;
	}

	public void setCar_ins_statim(java.lang.String car_ins_statim) {

		this.car_ins_statim = car_ins_statim;
	}

	@ Column(name = "car_ins_endtim")
	public java.lang.String getCar_ins_endtim() {

		return car_ins_endtim;
	}

	public void setCar_ins_endtim(java.lang.String car_ins_endtim) {

		this.car_ins_endtim = car_ins_endtim;
	}

	@ Column(name = "car_ins_ph")
	public java.lang.String getCar_ins_ph() {

		return car_ins_ph;
	}

	public void setCar_ins_ph(java.lang.String car_ins_ph) {

		this.car_ins_ph = car_ins_ph;
	}

	@ Column
	public java.util.Date getCar_timsta() {

		return car_timsta;
	}

	public void setCar_timsta(java.util.Date car_timsta) {

		this.car_timsta = car_timsta;
	}

}
package com.xcfh.car.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***********************************************************************
 * Module:  tb_car_mil.java
 * Author:  xcfh
 * Purpose: Defines the Class tb_car_mil
 ***********************************************************************/

/** @pdOid 81a28f6c-247b-4d9c-8a67-d682f67a8443 */
@ Entity
@ Table(name = "tb_car_mil")
public class Mil {
	/**
	 * 里程ID
	 * 
	 * @pdOid 9b41560e-0718-4035-bae5-9e826c122364
	 */
	private java.lang.String car_mil_id;
	/**
	 * 里程数
	 * 
	 * @pdOid 2e4ecdb9-90c3-48e1-8196-bfeb48d902cd
	 */
	private java.lang.String car_mil_num;
	/**
	 * 消费类型
	 * 
	 * @pdOid d7a005ef-1659-4bd8-a2fc-a7596b557472
	 */
	private java.lang.String car_mil_typ;
	/**
	 * 时间
	 * 
	 * @pdOid 0c72720e-c24e-4ce2-9c37-17b263dcce81
	 */
	private java.lang.String car_mil_tim;
	/**
	 * 时间戳
	 * 
	 * @pdOid 8f998a44-ca65-4113-8aae-0c3c55ab9308
	 */
	private java.util.Date car_statim;
	/**
	 * 金额
	 * 
	 * @pdOid a0663e5c-5006-470a-b54a-cd3a8b05ef29
	 */
	private java.lang.String car_mil_pri;

	@ Id
	@ Column(name = "car_mil_id")
	public java.lang.String getCar_mil_id() {

		return car_mil_id;
	}

	public void setCar_mil_id(java.lang.String car_mil_id) {

		this.car_mil_id = car_mil_id;
	}

	@ Column(name = "car_mil_num")
	public java.lang.String getCar_mil_num() {

		return car_mil_num;
	}

	public void setCar_mil_num(java.lang.String car_mil_num) {

		this.car_mil_num = car_mil_num;
	}

	@ Column(name = "car_mil_typ")
	public java.lang.String getCar_mil_typ() {

		return car_mil_typ;
	}

	public void setCar_mil_typ(java.lang.String car_mil_typ) {

		this.car_mil_typ = car_mil_typ;
	}

	@ Column(name = "car_mil_tim")
	public java.lang.String getCar_mil_tim() {

		return car_mil_tim;
	}

	public void setCar_mil_tim(java.lang.String car_mil_tim) {

		this.car_mil_tim = car_mil_tim;
	}

	public java.util.Date getCar_statim() {

		return car_statim;
	}

	@ Column
	public void setCar_statim(java.util.Date car_statim) {

		this.car_statim = car_statim;
	}

	@ Column(name = "car_mil_pri")
	public java.lang.String getCar_mil_pri() {

		return car_mil_pri;
	}

	public void setCar_mil_pri(java.lang.String car_mil_pri) {

		this.car_mil_pri = car_mil_pri;
	}

}
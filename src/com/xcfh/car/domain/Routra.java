package com.xcfh.car.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***********************************************************************
 * Module:  tb_car_routra.java
 * Author:  xcfh
 * Purpose: Defines the Class tb_car_routra
 ***********************************************************************/

/** @pdOid c91a9b2d-9d0a-4cef-8aaf-988459ea2c37 */
@ Entity
@ Table(name = "tb_car_routra")
public class Routra {
	/**
	 * 行程ID
	 * 
	 * @pdOid c89d794c-3668-41a7-b03a-417d6fd4a237
	 */
	private java.lang.String car_routra_id;
	/**
	 * 车ID
	 */
	private java.lang.String car_id;
	/**
	 * 目的地
	 * 
	 * @pdOid a6decba7-7bbf-4b8d-b21f-ee0d92958926
	 */
	private java.lang.String car_routra_des;
	/**
	 * 人数
	 * 
	 * @pdOid 49fb9549-7feb-4ed7-9435-6da9d9007a98
	 */
	private java.lang.String car_routra_peonum;
	/**
	 * 出发时间
	 * 
	 * @pdOid d390eef2-1262-4828-88c1-f1cf7e7b599d
	 */
	private java.lang.String car_routra_statim;
	/**
	 * 出发前里程
	 * 
	 * @pdOid 1cbc7821-4a71-4b26-93a5-430570270ef8
	 */
	private java.lang.String car_routra_stamil;
	/**
	 * 出发位置
	 * 
	 * @pdOid e8070bd6-9922-4dd9-901d-c404149603fe
	 */
	private java.lang.String car_routra_stapos;
	/**
	 * 抵达时间
	 * 
	 * @pdOid 85cb912e-a2ae-4d05-9be2-c8deea93e9bb
	 */
	private java.lang.String car_routra_arrtim;
	/**
	 * 抵达后里程
	 * 
	 * @pdOid fb85ff16-d028-4f7d-b617-ae6b97efb8e3
	 */
	private java.lang.String car_routra_arrmil;
	/**
	 * 抵达后位置
	 * 
	 * @pdOid ee1801ac-ff1e-4afb-94c8-fa0f6185fe4d
	 */
	private java.lang.String car_routra_arrpos;
	/**
	 * 时间戳
	 * 
	 * @pdOid 4996e5d4-8702-4f24-a993-fce8cf1c20ce
	 */
	private java.util.Date car_routra_timsta;
	/**
	 * 备注
	 * 
	 * @pdOid 23c8b627-80cb-46f3-99af-614f39a7a1ee
	 */
	private java.lang.String car_routra_rem;
	/**
	 * 行驶类型
	 * 
	 * @pdOid 54250f34-f188-4969-b3f0-506f7be354e2
	 */
	private java.lang.String car_routra_typ;

	@ Id
	@ Column
	public java.lang.String getCar_routra_id() {

		return car_routra_id;
	}

	public void setCar_routra_id(java.lang.String car_routra_id) {

		this.car_routra_id = car_routra_id;
	}

	@ Column
	public java.lang.String getCar_id() {

		return car_id;
	}

	public void setCar_id(java.lang.String car_id) {

		this.car_id = car_id;
	}

	@ Column
	public java.lang.String getCar_routra_des() {

		return car_routra_des;
	}

	public void setCar_routra_des(java.lang.String car_routra_des) {

		this.car_routra_des = car_routra_des;
	}

	@ Column
	public java.lang.String getCar_routra_peonum() {

		return car_routra_peonum;
	}

	public void setCar_routra_peonum(java.lang.String car_routra_peonum) {

		this.car_routra_peonum = car_routra_peonum;
	}

	@ Column
	public java.lang.String getCar_routra_statim() {

		return car_routra_statim;
	}

	public void setCar_routra_statim(java.lang.String car_routra_statim) {

		this.car_routra_statim = car_routra_statim;
	}

	@ Column
	public java.lang.String getCar_routra_stamil() {

		return car_routra_stamil;
	}

	public void setCar_routra_stamil(java.lang.String car_routra_stamil) {

		this.car_routra_stamil = car_routra_stamil;
	}

	@ Column
	public java.lang.String getCar_routra_stapos() {

		return car_routra_stapos;
	}

	public void setCar_routra_stapos(java.lang.String car_routra_stapos) {

		this.car_routra_stapos = car_routra_stapos;
	}

	@ Column
	public java.lang.String getCar_routra_arrtim() {

		return car_routra_arrtim;
	}

	public void setCar_routra_arrtim(java.lang.String car_routra_arrtim) {

		this.car_routra_arrtim = car_routra_arrtim;
	}

	@ Column
	public java.lang.String getCar_routra_arrmil() {

		return car_routra_arrmil;
	}

	public void setCar_routra_arrmil(java.lang.String car_routra_arrmil) {

		this.car_routra_arrmil = car_routra_arrmil;
	}

	@ Column
	public java.lang.String getCar_routra_arrpos() {

		return car_routra_arrpos;
	}

	public void setCar_routra_arrpos(java.lang.String car_routra_arrpos) {

		this.car_routra_arrpos = car_routra_arrpos;
	}

	@ Column
	public java.util.Date getCar_routra_timsta() {

		return car_routra_timsta;
	}

	public void setCar_routra_timsta(java.util.Date car_routra_timsta) {

		this.car_routra_timsta = car_routra_timsta;
	}

	@ Column
	public java.lang.String getCar_routra_rem() {

		return car_routra_rem;
	}

	public void setCar_routra_rem(java.lang.String car_routra_rem) {

		this.car_routra_rem = car_routra_rem;
	}

	@ Column
	public java.lang.String getCar_routra_typ() {

		return car_routra_typ;
	}

	public void setCar_routra_typ(java.lang.String car_routra_typ) {

		this.car_routra_typ = car_routra_typ;
	}

}
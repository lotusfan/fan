package com.xcfh.car.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***********************************************************************
 * Module:  tb_car_vl.java
 * Author:  xcfh
 * Purpose: Defines the Class tb_car_vl
 ***********************************************************************/

/** @pdOid 4be6c492-bf7a-4859-bc21-056c32118e07 */
@ Entity
@ Table(name = "tb_car_vl")
public class VehicleLicense {
	/**
	 * 行驶本ID
	 * 
	 * @pdOid d052fc5a-1148-4a7f-b3e9-c44eeffe4852
	 */
	private java.lang.String car_vl_id;
	/**
	 * 车ID
	 */
	private java.lang.String car_id;
	/**
	 * 号牌号码
	 * 
	 * @pdOid 6f6b8c76-b867-49fa-b3d1-dad8a3cfe9f9
	 */
	private java.lang.String car_num;
	/**
	 * 档案编号
	 * 
	 * @pdOid 22bc6d5f-f634-4ac6-a278-866758bae862
	 */
	private java.lang.String car_vl_recnum;
	/**
	 * 车辆类型
	 * 
	 * @pdOid d3080f41-5f86-4ddf-a419-450296c5a07d
	 */
	private java.lang.String car_vl_type;
	/**
	 * 所有人
	 * 
	 * @pdOid 6a938ce1-82a4-4363-a75e-2e19568e193f
	 */
	private java.lang.String car_vl_name;
	/**
	 * 品牌型号
	 * 
	 * @pdOid 51efdd66-d8b5-4c0c-9b34-8ec180671e43
	 */
	private java.lang.String car_vl_mod;
	/**
	 * 发动机号码
	 * 
	 * @pdOid 7c48673b-d2c0-4e09-81bf-d71d456e11de
	 */
	private java.lang.String car_vl_engnum;
	/**
	 * 发证日期
	 * 
	 * @pdOid 149c6020-25de-4107-ad09-60340288769f
	 */
	private java.lang.String car_vl_dat;
	/**
	 * VIN号
	 * 
	 * @pdOid d33733fc-d889-4f90-86ec-3c2c796fd72b
	 */
	private java.lang.String car_vl_vin;
	/**
	 * 图片标志位
	 * 
	 * @pdOid 0bf929b6-0b30-46e7-bbd9-39f68e915025
	 */
	private java.lang.String car_imgflg;
	/**
	 * 性别
	 * 
	 * @pdOid c157309a-0638-4f01-9520-b3705ce28af9
	 */
	private java.lang.String car_vl_sex;
	/**
	 * 车驾号
	 * 
	 * @pdOid e1d138d6-8d53-486b-a1c8-c40dcc1f508c
	 */
	private java.lang.String car_vl_dri;
	/**
	 * 时间戳
	 * 
	 * @pdOid 96d9c388-c732-4102-a0a8-9973c0289843
	 */
	private java.util.Date car_timsta;

	@ Id
	@ Column
	public java.lang.String getCar_vl_id() {

		return car_vl_id;
	}

	public void setCar_vl_id(java.lang.String car_vl_id) {

		this.car_vl_id = car_vl_id;
	}

	@ Column
	public java.lang.String getCar_id() {

		return car_id;
	}

	public void setCar_id(java.lang.String car_id) {

		this.car_id = car_id;
	}

	@ Column
	public java.lang.String getCar_num() {

		return car_num;
	}

	public void setCar_num(java.lang.String car_num) {

		this.car_num = car_num;
	}

	@ Column
	public java.lang.String getCar_vl_recnum() {

		return car_vl_recnum;
	}

	public void setCar_vl_recnum(java.lang.String car_vl_recnum) {

		this.car_vl_recnum = car_vl_recnum;
	}

	@ Column
	public java.lang.String getCar_vl_type() {

		return car_vl_type;
	}

	public void setCar_vl_type(java.lang.String car_vl_type) {

		this.car_vl_type = car_vl_type;
	}

	@ Column
	public java.lang.String getCar_vl_name() {

		return car_vl_name;
	}

	public void setCar_vl_name(java.lang.String car_vl_name) {

		this.car_vl_name = car_vl_name;
	}

	@ Column
	public java.lang.String getCar_vl_mod() {

		return car_vl_mod;
	}

	public void setCar_vl_mod(java.lang.String car_vl_mod) {

		this.car_vl_mod = car_vl_mod;
	}

	@ Column
	public java.lang.String getCar_vl_engnum() {

		return car_vl_engnum;
	}

	public void setCar_vl_engnum(java.lang.String car_vl_engnum) {

		this.car_vl_engnum = car_vl_engnum;
	}

	@ Column
	public java.lang.String getCar_vl_dat() {

		return car_vl_dat;
	}

	public void setCar_vl_dat(java.lang.String car_vl_dat) {

		this.car_vl_dat = car_vl_dat;
	}

	@ Column
	public java.lang.String getCar_vl_vin() {

		return car_vl_vin;
	}

	public void setCar_vl_vin(java.lang.String car_vl_vin) {

		this.car_vl_vin = car_vl_vin;
	}

	@ Column
	public java.lang.String getCar_imgflg() {

		return car_imgflg;
	}

	public void setCar_imgflg(java.lang.String car_imgflg) {

		this.car_imgflg = car_imgflg;
	}

	@ Column
	public java.lang.String getCar_vl_sex() {

		return car_vl_sex;
	}

	public void setCar_vl_sex(java.lang.String car_vl_sex) {

		this.car_vl_sex = car_vl_sex;
	}

	@ Column
	public java.lang.String getCar_vl_dri() {

		return car_vl_dri;
	}

	public void setCar_vl_dri(java.lang.String car_vl_dri) {

		this.car_vl_dri = car_vl_dri;
	}

	@ Column
	public java.util.Date getCar_timsta() {

		return car_timsta;
	}

	public void setCar_timsta(java.util.Date car_timsta) {

		this.car_timsta = car_timsta;
	}

}
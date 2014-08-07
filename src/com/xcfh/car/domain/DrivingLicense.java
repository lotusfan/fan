package com.xcfh.car.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***********************************************************************
 * Module:  tb_car_dl.java
 * Author:  xcfh
 * Purpose: Defines the Class tb_car_dl
 ***********************************************************************/

/** @pdOid cf116d6a-3f8c-4404-9369-baa73a620b26 */
@ Entity
@ Table(name = "tb_car_dl")
public class DrivingLicense {
	/**
	 * 驾驶证信息ID
	 * 
	 * @pdOid 498bb083-baab-4aea-99e6-72c753a17c57
	 */
	private java.lang.String car_dl_id;
	/**
	 * 用户ID
	 */
	private java.lang.String com_u_id;
	/**
	 * 驾驶证号码
	 * 
	 * @pdOid fc3a3ee1-b3e4-4726-add2-a3f8b6695d2b
	 */
	private java.lang.String car_dl_num;
	/**
	 * 档案编号
	 * 
	 * @pdOid 6e7d8cfe-53a9-44e7-8a59-bf035f0b734f
	 */
	private java.lang.String car_dl_recnum;
	/**
	 * 驾驶本代号
	 * 
	 * @pdOid 44473eb6-c6b7-4658-a211-51e2bba049e1
	 */
	private java.lang.String car_dl_typ;
	/**
	 * 姓名
	 * 
	 * @pdOid cd497bd2-cc1b-4142-90d5-d61d89248295
	 */
	private java.lang.String car_dl_nam;
	/**
	 * 起始有效期
	 * 
	 * @pdOid 9fa313b9-63fe-4c01-914a-71ba0afe5b73
	 */
	private java.lang.String car_dl_valsta;
	/**
	 * 结束有效期
	 * 
	 * @pdOid 9b0186ef-b542-40b4-8997-aee0a19fa79c
	 */
	private java.lang.String car_dl_valend;
	/**
	 * 有效期限
	 * 
	 * @pdOid 25f3db29-cdc7-45f4-8d6a-f7e0aca01a7d
	 */
	private java.lang.String car_dl_val;
	/**
	 * 时间戳
	 * 
	 * @pdOid c4603fc7-5bf5-46ac-8e38-0633d9ed7178
	 */
	private java.util.Date car_dl_statim;
	/**
	 * 有无图片
	 * 
	 * @pdOid 815f956d-f03b-4461-aa31-5580e85fed0d
	 */
	private java.lang.String car_dl_imgflg;
	/**
	 * 性别
	 * 
	 * @pdOid 3ab216fd-f8cd-4cb7-a30b-fcead0c8732c
	 */
	private java.lang.String car_dl_sex;

	@ Id
	@ Column(name = "car_dl_id")
	public java.lang.String getCar_dl_id() {

		return car_dl_id;
	}

	public void setCar_dl_id(java.lang.String car_dl_id) {

		this.car_dl_id = car_dl_id;
	}

	@ Column(name = "com_u_id")
	public java.lang.String getCom_u_id() {

		return com_u_id;
	}

	public void setCom_u_id(java.lang.String com_u_id) {

		this.com_u_id = com_u_id;
	}

	@ Column(name = "car_dl_num")
	public java.lang.String getCar_dl_num() {

		return car_dl_num;
	}

	public void setCar_dl_num(java.lang.String car_dl_num) {

		this.car_dl_num = car_dl_num;
	}

	@ Column(name = "car_dl_recnum")
	public java.lang.String getCar_dl_recnum() {

		return car_dl_recnum;
	}

	public void setCar_dl_recnum(java.lang.String car_dl_recnum) {

		this.car_dl_recnum = car_dl_recnum;
	}

	@ Column(name = "car_dl_typ")
	public java.lang.String getCar_dl_typ() {

		return car_dl_typ;
	}

	public void setCar_dl_typ(java.lang.String car_dl_typ) {

		this.car_dl_typ = car_dl_typ;
	}

	@ Column(name = "car_dl_nam")
	public java.lang.String getCar_dl_nam() {

		return car_dl_nam;
	}

	public void setCar_dl_nam(java.lang.String car_dl_nam) {

		this.car_dl_nam = car_dl_nam;
	}

	@ Column(name = "car_dl_valsta")
	public java.lang.String getCar_dl_valsta() {

		return car_dl_valsta;
	}

	public void setCar_dl_valsta(java.lang.String car_dl_valsta) {

		this.car_dl_valsta = car_dl_valsta;
	}

	@ Column(name = "car_dl_valend")
	public java.lang.String getCar_dl_valend() {

		return car_dl_valend;
	}

	public void setCar_dl_valend(java.lang.String car_dl_valend) {

		this.car_dl_valend = car_dl_valend;
	}

	@ Column(name = "car_dl_val")
	public java.lang.String getCar_dl_val() {

		return car_dl_val;
	}

	public void setCar_dl_val(java.lang.String car_dl_val) {

		this.car_dl_val = car_dl_val;
	}

	@ Column(name = "car_dl_statim")
	public java.util.Date getCar_dl_statim() {

		return car_dl_statim;
	}

	public void setCar_dl_statim(java.util.Date car_dl_statim) {

		this.car_dl_statim = car_dl_statim;
	}

	@ Column(name = "car_dl_imgflg")
	public java.lang.String getCar_dl_imgflg() {

		return car_dl_imgflg;
	}

	public void setCar_dl_imgflg(java.lang.String car_dl_imgflg) {

		this.car_dl_imgflg = car_dl_imgflg;
	}

	@ Column(name = "car_dl_sex")
	public java.lang.String getCar_dl_sex() {

		return car_dl_sex;
	}

	public void setCar_dl_sex(java.lang.String car_dl_sex) {

		this.car_dl_sex = car_dl_sex;
	}

}
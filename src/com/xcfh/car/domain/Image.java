package com.xcfh.car.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***********************************************************************
 * Module:  tb_car_image.java
 * Author:  xcfh
 * Purpose: Defines the Class tb_car_image
 ***********************************************************************/

/** @pdOid b25b1454-e7df-41c2-9992-b8ea7c8a785c */
@ Entity
@ Table(name = "tb_car_image")
public class Image {
	/**
	 * 图片ID
	 * 
	 * @pdOid cfe42b04-9838-4026-a677-2aa844ccc46c
	 */
	private java.lang.String car_img_id;
	/**
	 * 图片路径
	 * 
	 * @pdOid b960c41d-c855-4fd4-ab7b-46996ae78d61
	 */
	private java.lang.String car_img_pat;
	/**
	 * 图片大小
	 * 
	 * @pdOid 900fe469-63ff-4580-8260-5039b9513499
	 */
	private java.lang.String car_img_siz;
	/**
	 * 时间戳
	 * 
	 * @pdOid cfb4aedf-e9b3-4452-a0c0-88d6b9d79f09
	 */
	private java.util.Date car_img_statim;
	/**
	 * 标签组
	 * 
	 * @pdOid 48b8ba37-566b-49e7-b69a-03c5fc8137b1
	 */
	private java.lang.String car_img_tag;
	/**
	 * 用户ID
	 */
	private java.lang.String com_u_id;
	/**
	 * 关联ID
	 */
	private java.lang.String car_img_relid;

	@ Id
	@ Column(name = "car_img_id")
	public java.lang.String getCar_img_id() {

		return car_img_id;
	}

	public void setCar_img_id(java.lang.String car_img_id) {

		this.car_img_id = car_img_id;
	}

	@ Column(name = "car_img_pat")
	public java.lang.String getCar_img_pat() {

		return car_img_pat;
	}

	public void setCar_img_pat(java.lang.String car_img_pat) {

		this.car_img_pat = car_img_pat;
	}

	@ Column(name = "car_img_siz")
	public java.lang.String getCar_img_siz() {

		return car_img_siz;
	}

	public void setCar_img_siz(java.lang.String car_img_siz) {

		this.car_img_siz = car_img_siz;
	}

	@ Column
	public java.util.Date getCar_img_statim() {

		return car_img_statim;
	}

	public void setCar_img_statim(java.util.Date car_img_statim) {

		this.car_img_statim = car_img_statim;
	}

	@ Column(name = "car_img_tag")
	public java.lang.String getCar_img_tag() {

		return car_img_tag;
	}

	public void setCar_img_tag(java.lang.String car_img_tag) {

		this.car_img_tag = car_img_tag;
	}

	@ Column(name = "car_img_relid")
	public java.lang.String getCar_img_relid() {

		return car_img_relid;
	}

	public void setCar_img_relid(java.lang.String car_img_relid) {

		this.car_img_relid = car_img_relid;
	}

	@ Column(name = "com_u_id")
	public java.lang.String getCom_u_id() {

		return com_u_id;
	}

	public void setCom_u_id(java.lang.String com_u_id) {

		this.com_u_id = com_u_id;
	}

}
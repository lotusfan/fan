package com.xcfh.car.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***********************************************************************
 * Module:  tb_carnew.java
 * Author:  xcfh
 * Purpose: Defines the Class tb_carnew
 ***********************************************************************/

/** @pdOid 253f9784-5774-407c-963f-9740c2796bdf */

@ Entity
@ Table(name = "tb_car")
public class Car {
	/**
	 * 车ID
	 * 
	 * @pdOid e9413921-b499-4716-b2ae-7b593bee1553
	 */
	private java.lang.String car_id;
	/**
	 * 用户ID
	 * 
	 */
	private java.lang.String com_u_id;
	/**
	 * 车牌号
	 * 
	 * @pdOid 46fd9a05-7e96-48db-b3dd-4762ec9335ea
	 */
	private java.lang.String car_num;
	/**
	 * 车身样式
	 * 
	 * @pdOid 39ffbf44-fafa-4209-bb53-7f91f2cc7528
	 */
	private java.lang.String car_style;
	/**
	 * 颜色
	 * 
	 * @pdOid be549430-c95e-447a-b491-420ea15e3926
	 */
	private java.lang.String car_col;
	/**
	 * 发动机排量
	 * 
	 * @pdOid 9420c473-db45-43c9-a7a9-780414fc664a
	 */
	private java.lang.String car_cc;
	/**
	 * 年份
	 * 
	 * @pdOid 8fd2eebc-d7f8-4484-b07c-da6308a8aff6
	 */
	private java.lang.String car_yea;
	/**
	 * 型号
	 * 
	 * @pdOid 7492a189-f29c-425a-907e-307dadf58fb1
	 */
	private java.lang.String car_mod;
	/**
	 * 品牌
	 * 
	 * @pdOid a19c69e6-b120-49bb-a6a0-cbc57a76610f
	 */
	private java.lang.String car_brd;
	/**
	 * 昵称
	 * 
	 * @pdOid 8913374a-aad3-4ed5-af38-4889d9b5b495
	 */
	private java.lang.String car_nicnam;
	/**
	 * 油箱容量
	 * 
	 * @pdOid 77362935-72f2-4c9a-a190-c7f6799b33b2
	 */
	private java.lang.String car_fuetan;
	/**
	 * 时间戳
	 * 
	 * @pdOid 1f5ff441-0de1-4f87-b427-6e7636df33bd
	 */
	private java.util.Date car_timsta;
	/**
	 * 有无图片
	 * 
	 * @pdOid e5d158ca-270b-4789-9e0e-7a91e05a891d
	 */
	private java.lang.String car_imgflg;
	/**
	 * 购买价格
	 * 
	 * @pdOid fe0f70d0-a4c3-4e23-8c53-fab87d03275a
	 */
	private java.lang.String car_pri;
	/**
	 * 轮胎参数
	 * 
	 * @pdOid 1ca0a5ea-830b-4065-ba91-5fb9324e3dfb
	 */
	private java.lang.String car_tyrpar;
	/**
	 * 轮胎品牌
	 * 
	 * @pdOid 520c4b8e-1265-4f9b-b0a2-db1cfb94680f
	 */
	private java.lang.String car_tyrbrd;
	/**
	 * 轮胎胎压
	 * 
	 * @pdOid 938ba6f7-e729-4687-8079-a1ba57147d01
	 */
	private java.lang.String car_tyrpre;
	/**
	 * 商家电话
	 * 
	 * @pdOid 8e2e20c1-963b-474a-91c3-a00f922dc838
	 */
	private java.lang.String car_selph;

	@ Id
	@ Column(name = "car_id")
	public java.lang.String getCar_id() {

		return car_id;
	}

	public void setCar_id(java.lang.String car_id) {

		this.car_id = car_id;
	}

	@ Column(name = "com_u_id")
	public java.lang.String getCom_u_id() {

		return com_u_id;
	}

	public void setCom_u_id(java.lang.String com_u_id) {

		this.com_u_id = com_u_id;
	}

	@ Column(name = "car_num")
	public java.lang.String getCar_num() {

		return car_num;
	}

	public void setCar_num(java.lang.String car_num) {

		this.car_num = car_num;
	}

	@ Column(name = "car_style")
	public java.lang.String getCar_style() {

		return car_style;
	}

	public void setCar_style(java.lang.String car_style) {

		this.car_style = car_style;
	}

	@ Column(name = "car_col")
	public java.lang.String getCar_col() {

		return car_col;
	}

	public void setCar_col(java.lang.String car_col) {

		this.car_col = car_col;
	}

	@ Column(name = "car_cc")
	public java.lang.String getCar_cc() {

		return car_cc;
	}

	public void setCar_cc(java.lang.String car_cc) {

		this.car_cc = car_cc;
	}

	@ Column(name = "car_yea")
	public java.lang.String getCar_yea() {

		return car_yea;
	}

	public void setCar_yea(java.lang.String car_yea) {

		this.car_yea = car_yea;
	}

	@ Column(name = "car_mod")
	public java.lang.String getCar_mod() {

		return car_mod;
	}

	public void setCar_mod(java.lang.String car_mod) {

		this.car_mod = car_mod;
	}

	@ Column(name = "car_brd")
	public java.lang.String getCar_brd() {

		return car_brd;
	}

	public void setCar_brd(java.lang.String car_brd) {

		this.car_brd = car_brd;
	}

	@ Column(name = "car_nicnam")
	public java.lang.String getCar_nicnam() {

		return car_nicnam;
	}

	public void setCar_nicnam(java.lang.String car_nicnam) {

		this.car_nicnam = car_nicnam;
	}

	@ Column(name = "car_fuetan")
	public java.lang.String getCar_fuetan() {

		return car_fuetan;
	}

	public void setCar_fuetan(java.lang.String car_fuetan) {

		this.car_fuetan = car_fuetan;
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

	@ Column(name = "car_pri")
	public java.lang.String getCar_pri() {

		return car_pri;
	}

	public void setCar_pri(java.lang.String car_pri) {

		this.car_pri = car_pri;
	}

	@ Column(name = "car_tyrpar")
	public java.lang.String getCar_tyrpar() {

		return car_tyrpar;
	}

	public void setCar_tyrpar(java.lang.String car_tyrpar) {

		this.car_tyrpar = car_tyrpar;
	}

	@ Column(name = "car_tyrbrd")
	public java.lang.String getCar_tyrbrd() {

		return car_tyrbrd;
	}

	public void setCar_tyrbrd(java.lang.String car_tyrbrd) {

		this.car_tyrbrd = car_tyrbrd;
	}

	@ Column(name = "car_tyrpre")
	public java.lang.String getCar_tyrpre() {

		return car_tyrpre;
	}

	public void setCar_tyrpre(java.lang.String car_tyrpre) {

		this.car_tyrpre = car_tyrpre;
	}

	@ Column(name = "car_selph")
	public java.lang.String getCar_selph() {

		return car_selph;
	}

	public void setCar_selph(java.lang.String car_selph) {

		this.car_selph = car_selph;
	}

}
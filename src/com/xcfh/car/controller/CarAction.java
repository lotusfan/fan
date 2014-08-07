package com.xcfh.car.controller;

import java.io.InputStream;
import java.io.OutputStream;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;

import com.opensymphony.xwork2.ActionSupport;
import com.xcfh.car.service.CarService;

@ Namespace("/carser")
public class CarAction extends ActionSupport {

	private CarService carservice;

	public CarService getCarservice() {

		return carservice;
	}

	@ Resource(name = "CarService")
	public void setCarservice(CarService carservice) {

		this.carservice = carservice;
	}

	@ Action(value = "addcarinfo")
	public void addCarInfo() {

		System.out.println("-------------------------------------");
		try {
			InputStream in = ServletActionContext.getRequest().getInputStream();
			OutputStream out = ServletActionContext.getResponse().getOutputStream();

			carservice.addCarInfo(in, out);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@ Action(value = "alertcarinfo")
	public void alertCarInfo() {

		try {
			InputStream in = ServletActionContext.getRequest().getInputStream();
			OutputStream out = ServletActionContext.getResponse().getOutputStream();
			carservice.alertCarInfo(in, out);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@ Action(value = "deletecarinfo")
	public void deleteCarInfo() {

		try {
			InputStream in = ServletActionContext.getRequest().getInputStream();
			OutputStream out = ServletActionContext.getResponse().getOutputStream();
			carservice.deleteCarInfo(in, out);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@ Action(value = "selectcarinfo")
	public void selectCarInfo() {

		try {
			System.out.println("oooooooooooooooooooooo");
			InputStream in = ServletActionContext.getRequest().getInputStream();
			OutputStream out = ServletActionContext.getResponse().getOutputStream();
			carservice.selectCarInfo(in, out);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

package com.xcfh.car.service;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.springframework.stereotype.Service;

import com.xcfh.car.dao.CarDao;
import com.xcfh.car.domain.Car;
import com.xcfh.car.util.CONSTANTPROPERTY;
import com.xcfh.car.util.FIRSTUUPER;
import com.xcfh.car.util.INPUTTOJSON;
import com.xcfh.car.util.JSONOUTPUT;

@ Service("CarService")
public class CarService {

	private CarDao cardao;

	public CarDao getCardao() {

		return cardao;
	}

	@ Resource(name = "CarDao")
	public void setCardao(CarDao cardao) {

		this.cardao = cardao;
	}

	/**
	 * 车信息添加
	 * 
	 * @param in
	 * @param out
	 */
	public void addCarInfo(InputStream in, OutputStream out) {

		JSONObject jsonre = new JSONObject();
		String flg = "F";
		String rea = "unknow";
		try {
			Object oo = getObjectData(in);
			cardao.addCarInfo(oo);
			flg = "T";
			rea = "add success";

		} catch (Exception e) {
			// TODO: handle exception
			flg = "F";
			rea = "add error";
			e.printStackTrace();
		} finally {
			jsonre.put("result", flg);
			jsonre.put("reason", rea);
			JSONOUTPUT.send(out, jsonre);
		}
	}

	/**
	 * 车信息修改
	 * 
	 * @param in
	 * @param out
	 */
	public void alertCarInfo(InputStream in, OutputStream out) {

		JSONObject jsonre = new JSONObject();
		String flg = "F";
		String rea = "unknow";
		try {
			Object oo = getObjectData(in);
			cardao.alertCarInfo(oo);
			flg = "T";
			rea = "update success";

		} catch (Exception e) {
			// TODO: handle exception
			flg = "F";
			rea = "update error";
			e.printStackTrace();
		} finally {
			jsonre.put("result", flg);
			jsonre.put("reason", rea);
			JSONOUTPUT.send(out, jsonre);
		}
	}

	/**
	 * 车信息删除
	 * 
	 * @param in
	 * @param out
	 */

	public void deleteCarInfo(InputStream in, OutputStream out) {

		JSONObject jsonre = new JSONObject();
		String flg = "F";
		String rea = "unknow";
		try {
			JSONObject indata = INPUTTOJSON.getJSON(in);
			//			String classname = CONSTANTPROPERTY.ENTITYCLASS.getString(indata.getString("table_name"));
			//			String foreignkey = CONSTANTPROPERTY.ENTITYFOREIGNKEY.getString(indata.getString("table_name"));
			//			String foreignval = indata.getString("cause");
			deleteObject(indata.getString("table_name"), CONSTANTPROPERTY.ENTITYPRKEY.getString(indata.getString("table_name")),
					indata.getString("cause"));
			flg = "T";
			rea = "delete success";
		} catch (Exception e) {
			// TODO: handle exception
			flg = "F";
			rea = "delete error";
			e.printStackTrace();
		} finally {
			jsonre.put("result", flg);
			jsonre.put("reason", rea);
			JSONOUTPUT.send(out, jsonre);
		}
	}

	/**
	 * 车信息删除递归方法
	 * 
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 */
	public void deleteObject(String tablename, String key, String value) throws Exception {

		JSONArray jsonarray = CONSTANTPROPERTY.ENTITYRELTABLE.getJSONArray(tablename);
		if (jsonarray == null || jsonarray.size() < 1) {
			cardao.deleteCarInfo(CONSTANTPROPERTY.ENTITYCLASS.getString(tablename), key, value);
			return;
		}
		List objlist = cardao.selectCarInfo(CONSTANTPROPERTY.ENTITYCLASS.getString(tablename), key, value);
		cardao.deleteCarInfo(CONSTANTPROPERTY.ENTITYCLASS.getString(tablename), key, value);

		for (int i = 0; i < jsonarray.size(); i++) {
			for (Object objsub : objlist) {
				Method method = objsub.getClass().getMethod("get" + FIRSTUUPER.make(CONSTANTPROPERTY.ENTITYPRKEY.getString(tablename)), null);
				String foreignval = (String) method.invoke(objsub, null);
				String reltable = jsonarray.getString(i);
				if (reltable.equals("tb_car_image") && "F".equals(getImageFlag(objsub))) continue;
				deleteObject(reltable, CONSTANTPROPERTY.ENTITYFOREIGNKEY.getString(reltable), foreignval);
			}
		}

	}

	/**
	 * 返回实体类里是否有图片信息
	 * 
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 */
	public String getImageFlag(Object obj) throws Exception {

		Method[] methods = obj.getClass().getMethods();
		String flg = null;
		JSONArray jsoa = new JSONArray();
		for (Method method : methods) {
			jsoa.add(method.getName());
		}
		if (jsoa.contains("getCar_imgflg")) {
			Method methodflg = obj.getClass().getMethod("getCar_imgflg", null);
			flg = (String) methodflg.invoke(obj, null);
		}

		return ("F".equals(flg)) ? "F" : "T";
	}

	/**
	 * 车信息恢复数据
	 * 
	 * @param in
	 * @param out
	 */
	public void selectCarInfo(InputStream in, OutputStream out) {

		JSONObject jsonre = new JSONObject();
		String flg = "F";
		String rea = "unknow";
		try {
			JSONObject indata = INPUTTOJSON.getJSON(in);
			//			String classname = CONSTANTPROPERTY.ENTITYCLASS.getString(indata.getString("table_name"));
			//			String primarykey = CONSTANTPROPERTY.ENTITYPRKEY.getString(indata.getString("table_name"));
			String classname = CONSTANTPROPERTY.ENTITYCLASS.getString("tb_car");
			String primarykey = CONSTANTPROPERTY.ENTITYPRKEY.getString("tb_user_info");
			String primaryval = indata.getString("cause");
			/**
			 * 查询和用户关联的实体类(没有车信息)
			 */
			for (String userel : CONSTANTPROPERTY.ENTITYRELUSR) {
				List userellist = cardao.selectCarInfo(CONSTANTPROPERTY.ENTITYCLASS.getString(userel), primarykey, primaryval);
				jsonre.accumulate(userel, JSONSerializer.toJSON(userellist));
			}
			/**
			 * 查询车和其关联的实体类
			 */
			List<Car> carList = cardao.selectCarInfo("Car", primarykey, primaryval);
			List carrellist = new ArrayList();
			for (String carrel : CONSTANTPROPERTY.ENTITYRELCAR) {
				for (Car carinfo : carList) {
					String car_id = carinfo.getCar_id();
					List sublist = cardao.selectCarInfo(CONSTANTPROPERTY.ENTITYCLASS.getString(carrel),
							CONSTANTPROPERTY.ENTITYPRKEY.getString("tb_car"), car_id);
					if (sublist != null && sublist.size() > 0) carrellist.addAll(sublist);
				}
				jsonre.accumulate(carrel, JSONSerializer.toJSON(carrellist));
			}
			flg = "T";
			rea = "recover success";
			System.out.println(jsonre);
		} catch (Exception e) {
			// TODO: handle exception
			flg = "F";
			rea = "recover error";
			e.printStackTrace();
		} finally {
			jsonre.put("result", flg);
			jsonre.put("reason", rea);
			JSONOUTPUT.send(out, jsonre);
		}
	}

	public Object getObjectData(InputStream in) throws Exception {

		JSONObject indata = INPUTTOJSON.getJSON(in);
		String classname = CONSTANTPROPERTY.ENTITYCLASS.getString(indata.getString("table_name"));
		Class entityclass = Class.forName("com.xcfh.car.domain." + classname);
		Object oo = entityclass.newInstance();
		/**
		 * 遍历JSONG生成实体类
		 */
		Set jsoset = indata.getJSONObject("row").entrySet();
		Iterator jsoit = jsoset.iterator();
		while (jsoit.hasNext()) {
			Entry jsoen = (Entry) jsoit.next();
			Method jsometh = entityclass.getMethod("set" + FIRSTUUPER.make((String) jsoen.getKey()), String.class);
			jsometh.invoke(oo, jsoen.getValue());
		}
		return oo;
	}
}

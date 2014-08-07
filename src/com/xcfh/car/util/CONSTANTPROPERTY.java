package com.xcfh.car.util;

import net.sf.json.JSONObject;

public class CONSTANTPROPERTY {

	public static JSONObject ENTITYCLASS = JSONObject.fromObject("{'tb_car_image':'Image', 'tb_car' : 'Car', 'tb_car_fuel' : 'Fuel'}");
	public static JSONObject ENTITYPRKEY = JSONObject
			.fromObject("{'tb_car':'car_id','tb_car_fuel':'car_fue_id', 'tb_car_image':'car_img_id','tb_user_info':'com_u_id'}");
	public static JSONObject ENTITYFOREIGNKEY = JSONObject.fromObject("{'tb_car':'com_u_id','tb_car_fuel':'car_id','tb_car_image':'car_img_relid'}");
	public static String[] ENTITYRELCAR = {"tb_car_fuel"};
	public static String[] ENTITYRELUSR = {"tb_car", "tb_car_image"};
	public static JSONObject ENTITYRELTABLE = JSONObject
			.fromObject("{'tb_car':['tb_car_image','tb_car_fuel'],'tb_car_fuel':['tb_car_image'],'tb_car_image':[]}");
}

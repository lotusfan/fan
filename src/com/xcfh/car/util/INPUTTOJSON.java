package com.xcfh.car.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import net.sf.json.JSONObject;

public class INPUTTOJSON {
	public static JSONObject getJSON(InputStream in) {

		JSONObject js = null;
		BufferedReader reader = null;
		try {
			StringBuffer sb = new StringBuffer();
			reader = new BufferedReader(new InputStreamReader(in, Charset.forName("utf-8")));
			String line = "";
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			js = JSONObject.fromObject(sb.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return js;
	}
}

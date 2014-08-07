package com.xcfh.car.util;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

import net.sf.json.JSONObject;

public class JSONOUTPUT {

	public static void send(OutputStream out, JSONObject json) {

		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(out, Charset.forName("utf-8")));
			bw.write(json.toString());
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}

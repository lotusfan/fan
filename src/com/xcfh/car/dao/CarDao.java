package com.xcfh.car.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@ Repository("CarDao")
public class CarDao extends BaseDao {

	public void addCarInfo(Object oo) {

		try {
			getCurrentSession().save(oo);
			sessionFlush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sessionClose();
		}
	}

	public void alertCarInfo(Object oo) {

		try {
			getCurrentSession().update(oo);
			sessionFlush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sessionClose();
		}
	}

	public void deleteCarInfo(String classname, String attrkey, String attrval) {

		try {
			String hql = "delete from " + classname + " where " + attrkey + "='" + attrval + "'";
			Query query = getCurrentSession().createQuery(hql);
			query.executeUpdate();
			sessionFlush();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sessionClose();
		}

	}

	public List selectCarInfo(String classname, String attrkey, String attrval) {

		try {
			String hql = "from " + classname + " where " + attrkey + "='" + attrval + "'";
			Query query = getCurrentSession().createQuery(hql);
			List requltli = query.list();
			return requltli;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;

	}
}

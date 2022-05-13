package com.edubridge.hibernate.annotation;
import org.hibernate.Session;



public class UserSession {
	public static Session getSession() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		return session;


}
}

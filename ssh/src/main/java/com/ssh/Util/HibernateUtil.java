/**
 * 
 */
package com.ssh.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**Hibernate工具类
 * @author yl
 *
 */
public class HibernateUtil {
	
	private final static SessionFactory sessionFactory = buildSessionFactory();
	
	
	public static SessionFactory buildSessionFactory(){
		
		return new Configuration().configure().buildSessionFactory();
	}


	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
	public static void closeSessionFactory(){
		getSessionfactory().close();
	}

}

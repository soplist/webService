package com.wangkang.test;

import com.wangkang.client.*;
/**
 * <p>Title: ServiceTest.java</p>
 * <p>Description: information management software platform</p>
 * <p>Copyright: Copyright (c) 2011-2012 JinRui Information Technology Co., Ltd.</p>
 * <p>Company: JinRui Information Technology Co., Ltd.</p>
 * @author wangkang
 * @version 1.0 creation time£º2017-6-8 ÏÂÎç2:50:52
 */

public class ServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Service service = new ServiceService().getServicePort();
        //String name = service.getValue("wangkang");
        Person p = new Person();
        p.setName("haha");
        service.transmitObject(p);
        //System.out.println(name);
	}
	//set java_home=D:\wangkang\jdk1.7.0_80
	//set classpath=%JAVA_HOME%\lib\tools.jar;%JAVA_HOME%\lib\dt.jar;
	//set path=%JAVA_HOME%\bin;
	//wsimport -s "D:\\wangkang\\Workspaces\\MyEclipse 10\\TheClient\\src" -p com.wangkang.client -keep //http://localhost:9001/Service/Hello?wsdl

	//The project was not built since its build path is incomplete. Cannot find the class file for //java.lang.CharSequence. Fix the build path then try building this project

	//The constructor Service(URL, QName, WebServiceFeature[]) is undefined

	//The type java.lang.CharSequence cannot be resolved. It is indirectly referenced from required .class files


}

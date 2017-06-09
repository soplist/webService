package com.wangkang.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * <p>Title: Service.java</p>
 * <p>Description: information management software platform</p>
 * <p>Copyright: Copyright (c) 2011-2012 JinRui Information Technology Co., Ltd.</p>
 * <p>Company: JinRui Information Technology Co., Ltd.</p>
 * @author wangkang
 * @version 1.0 creation time：2017-6-8 上午11:34:13
 */

@WebService
public class Service {

	/**
	 * @param args
	 */
	public String getValue(String name){
		return "my name is "+name;
	}
	
	public void transmitObject(Person p){
		System.out.println(p.getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:9001/Service/Hello", new Service());
	    System.out.println("service success!");
	}
	//WebService runtime modeler error: Wrapper class XXX is not found. Have you run APT to generate them
	//update jdk
    //Exception in thread "main" com.sun.xml.internal.ws.server.ServerRtException: 服务器运行时错误: java.io.IOException: Unable to establish loopback connection
	//关闭防火墙
	
	//http://localhost:9001/Service/Hello?wsdl
}

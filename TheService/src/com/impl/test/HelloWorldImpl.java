package com.impl.test;

import javax.jws.WebService;

import com.itf.test.IHelloWorld;

/**
 * <p>Title: HelloWorldImpl.java</p>
 * <p>Description: information management software platform</p>
 * <p>Copyright: Copyright (c) 2011-2012 JinRui Information Technology Co., Ltd.</p>
 * <p>Company: JinRui Information Technology Co., Ltd.</p>
 * @author wangkang
 * @version 1.0 creation time£º2017-6-9 ÉÏÎç9:42:00
 */

@WebService(targetNamespace="http://demo.webservice",name="Hello")
public class HelloWorldImpl implements IHelloWorld {
	@Override
    public String sayHelloWorld() {
        return "Hello World";
    }
}

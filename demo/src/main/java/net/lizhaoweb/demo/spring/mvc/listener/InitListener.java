/**
 * Copyright (c) 2016, Stupid Bird and/or its affiliates. All rights reserved.
 * STUPID BIRD PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 * @Project : LiZhao Demo Spring MVC
 * @Title : InitListener.java
 * @Package : net.lizhaoweb.demo.spring.mvc.listener
 * @author <a href="http://www.lizhaoweb.net">李召(Jhon.Lee)</a>
 * @Date : 2016年4月26日
 * @Time : 下午6:23:34
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package net.lizhaoweb.demo.spring.mvc.listener;

import javax.servlet.ServletContext;

import net.lizhaoweb.spring.mvc.config.PropertyConfigurer;
import net.lizhaoweb.spring.mvc.core.listener.AbstractListener;
import net.lizhaoweb.spring.mvc.util.Constant;

import org.springframework.context.ApplicationEvent;
import org.springframework.web.context.WebApplicationContext;

/**
 * 
 * @author <a href="http://www.lizhaoweb.cn">李召(Jhon.Lee)</a>
 * @version
 * @notes Created on 2016年4月26日<br>
 *        Revision of last commit:$Revision$<br>
 *        Author of last commit:$Author$<br>
 *        Date of last commit:$Date$<br>
 *        <p />
 * 
 */
public class InitListener extends AbstractListener {

	@Override
	protected void onApplicationLoad(ApplicationEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void onApplicationLoad(WebApplicationContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void onApplicationLoad(ServletContext context) {
		context.setAttribute(Constant.Application.ServletContext.Key.PAGE_SIZE_LIST, PropertyConfigurer.getPropertyValue(Constant.Application.System.Page.SIZE_CONFIG_KEY));
	}
}

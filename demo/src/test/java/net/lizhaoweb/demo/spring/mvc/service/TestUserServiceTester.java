/**
 * Copyright (c) 2016, Stupid Bird and/or its affiliates. All rights reserved.
 * STUPID BIRD PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @Project : LiZhao Demo Spring MVC
 * @Title : TestUserServiceTester.java
 * @Package : net.lizhaoweb.demo.spring.mvc.service
 * @author <a href="http://www.lizhaoweb.net">李召(Jhon.Lee)</a>
 * @Date : 2016年4月22日
 * @Time : 下午8:46:33
 */
package net.lizhaoweb.demo.spring.mvc.service;

import lombok.Setter;
import net.lizhaoweb.demo.spring.mvc.bean.TotalData;
import net.lizhaoweb.demo.spring.mvc.search.SearchTotalData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 *
 * @author <a href="http://www.lizhaoweb.cn">李召(Jhon.Lee)</a>
 * @version
 * @notes Created on 2016年4月22日<br>
 *        Revision of last commit:$Revision$<br>
 *        Author of last commit:$Author$<br>
 *        Date of last commit:$Date$<br>
 *        <p />
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
// @WebAppConfiguration
@ContextConfiguration({"classpath*:/schema/spring/spring-app-model.xml", "classpath*:/schema/spring/spring-app-mapper.xml", "classpath*:/schema/spring/spring-app-service.xml", "classpath*:/schema/spring/spring-mvc-dispatcher.xml"})
public class TestUserServiceTester {

    @Setter
    @Resource(name = "totalDataService")
    private TotalDataService service;

    @Test
    public void get() {
        SearchTotalData search = new SearchTotalData("YYZX03810");
        TotalData bean = service.get(search);
        System.out.println(bean);
    }
}

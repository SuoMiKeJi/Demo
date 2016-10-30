/**
 * Copyright (c) 2016, Stupid Bird and/or its affiliates. All rights reserved.
 * STUPID BIRD PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @Project : parent
 * @Package : net.lizhaoweb.demo.spring.mvc.service.impl
 * @author <a href="http://www.lizhaoweb.net">李召(John.Lee)</a>
 * @EMAIL 404644381@qq.com
 * @Time : 23:30
 */
package net.lizhaoweb.demo.spring.mvc.service.impl;

import net.lizhaoweb.demo.spring.mvc.bean.TotalData;
import net.lizhaoweb.demo.spring.mvc.mapper.read.TotalDataReadMapper;
import net.lizhaoweb.demo.spring.mvc.search.SearchTotalData;
import net.lizhaoweb.demo.spring.mvc.service.TotalDataService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="http://www.lizhaoweb.cn">李召(John.Lee)</a>
 * @version 1.0.0.0.1
 * @notes Created on 2016年09月20日<br>
 * Revision of last commit:$Revision$<br>
 * Author of last commit:$Author$<br>
 * Date of last commit:$Date$<br>
 */
public class TotalDataServiceImpl implements TotalDataService {

    // 读持久操作对象。
    @Autowired
    private TotalDataReadMapper readMapper;

    @Override
    public TotalData get(SearchTotalData search) {
        return readMapper.getByGPSID(search);
    }
}

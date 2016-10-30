/**
 * Copyright (c) 2016, Stupid Bird and/or its affiliates. All rights reserved.
 * STUPID BIRD PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @Project : parent
 * @Package : net.lizhaoweb.demo.spring.mvc.controller
 * @author <a href="http://www.lizhaoweb.net">李召(John.Lee)</a>
 * @EMAIL 404644381@qq.com
 * @Time : 23:36
 */
package net.lizhaoweb.demo.spring.mvc.controller;

import lombok.Setter;
import net.lizhaoweb.demo.spring.mvc.bean.TotalData;
import net.lizhaoweb.demo.spring.mvc.search.SearchTotalData;
import net.lizhaoweb.demo.spring.mvc.service.TotalDataService;
import net.lizhaoweb.spring.plugin.mybatis.bean.Page;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author <a href="http://www.lizhaoweb.cn">李召(John.Lee)</a>
 * @version 1.0.0.0.1
 * @notes Created on 2016年09月20日<br>
 * Revision of last commit:$Revision$<br>
 * Author of last commit:$Author$<br>
 * Date of last commit:$Date$<br>
 */
@RequestMapping("/smkj")
public class TotalDataController {

    private final static String MODEL = "demo";

    @Setter
    private TotalDataService service;


    /**
     *
     */
    @RequestMapping(value = "/{forward}", method = {RequestMethod.GET})
    public String forward(HttpServletRequest request, HttpServletResponse response, ModelMap model, @PathVariable("forward") String forward) {
        return String.format("/%s/%s", MODEL, forward);
    }


    /**
     * 驾驶行为分析。
     */
    @RequestMapping(value = "/jsxwfx/{gpsId}", method = {RequestMethod.GET})
    public String list(HttpServletRequest request, HttpServletResponse response, ModelMap model, @PathVariable("gpsId") String gpsId) {
        SearchTotalData search = new SearchTotalData(gpsId);
        if (search.getPage() == null) {
            search.setPage(new Page(1));
        }
        TotalData bean = service.get(search);
        model.addAttribute("bean", bean);
        return String.format("/%s/jsxwfx", MODEL);
    }
}

/**
 * Copyright (c) 2016, Stupid Bird and/or its affiliates. All rights reserved.
 * STUPID BIRD PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @Project : parent
 * @Package : net.lizhaoweb.smkj.datasource.mysql.dao.model
 * @author <a href="http://www.lizhaoweb.net">李召(John.Lee)</a>
 * @EMAIL 404644381@qq.com
 * @Time : 17:44
 */
package net.lizhaoweb.smkj.datasource.mysql.dao.model;

import lombok.Data;

/**
 * <h1>汽车月度数据统计</h1>
 *
 * @author <a href="http://www.lizhaoweb.cn">李召(John.Lee)</a>
 * @version 1.0.0.0.1
 * @notes Created on 2016年09月20日<br>
 * Revision of last commit:$Revision$<br>
 * Author of last commit:$Author$<br>
 * Date of last commit:$Date$<br>
 */
@Data
public class CarStatisticsDataMonthly extends AbstractStatisticsData {

    /**
     *
     */
    private String date;

    /**
     * 行驶里程数
     */
    private double mileage;

    /**
     * 行驶时长
     */
    private double time;

    /**
     * 平均速度
     */
    private double averageSpeed;

    /**
     * 平均加速度
     */
    private double averageAcceleration;

    /**
     * 平均减速度
     */
    private double averageDeceleration;
}

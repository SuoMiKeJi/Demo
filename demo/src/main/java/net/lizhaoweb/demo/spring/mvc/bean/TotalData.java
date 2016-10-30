/**
 * Copyright (c) 2016, Stupid Bird and/or its affiliates. All rights reserved.
 * STUPID BIRD PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @Project : parent
 * @Package : net.lizhaoweb.demo.spring.mvc.bean
 * @author <a href="http://www.lizhaoweb.net">李召(John.Lee)</a>
 * @EMAIL 404644381@qq.com
 * @Time : 23:09
 */
package net.lizhaoweb.demo.spring.mvc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.lizhaoweb.spring.mvc.core.bean.AbstractEntity;

/**
 * @author <a href="http://www.lizhaoweb.cn">李召(John.Lee)</a>
 * @version 1.0.0.0.1
 * @notes Created on 2016年09月20日<br>
 * Revision of last commit:$Revision$<br>
 * Author of last commit:$Author$<br>
 * Date of last commit:$Date$<br>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TotalData extends AbstractEntity {

    /**
     * GPS ID
     */
    private String gpsId;

    /**
     * 月平均驾驶时间(单位：小时)
     */
    private double monthAvgTime;

    /**
     * 月平均驾驶时间比例
     */
    private double monthAvgTimePercentage;

    /**
     * 月平均驾驶里程(单位：公里)
     */
    private double monthAvgMileage;

    /**
     * 月平均驾驶时间比例
     */
    private double monthAvgMileagePercentage;

    /**
     * 疲劳驾驶概率
     */
    private double fatigueDrivingProbability;

    /**
     * 疲劳驾驶概率比例
     */
    private double fatigueDrivingProbabilityPercentage;

    /**
     * 最高速度
     */
    private double maxSpeed;

    /**
     * 平均速度
     */
    private double avgSpeed;

    /**
     * 平均速度比例
     */
    private double avgSpeedPercentage;

    /**
     * 最高加速度
     */
    private double maxAcceleration;

    /**
     * 平均加速度
     */
    private double avgAcceleration;

    /**
     * 平均加速度比例
     */
    private double avgAccelerationPercentage;

    /**
     * 最高减速度
     */
    private double maxDeceleration;

    /**
     * 平均减速度
     */
    private double avgDeceleration;

    /**
     * 平均减速度比例
     */
    private double avgDecelerationPercentage;

    /**
     * 清晨（5-6）比例
     */
    private double earlyMorningPercentage;

    /**
     * 早高峰（7-10）比例
     */
    private double morningPeakPercentage;

    /**
     * 白天（11-16）比例
     */
    private double dayPercentage;

    /**
     * 晚高峰（17-20）比例
     */
    private double evenignPeakPercentage;

    /**
     * 深夜（21-4）比例
     */
    private double nightPercentage;
}

/**
 * Copyright (c) 2016, Stupid Bird and/or its affiliates. All rights reserved.
 * STUPID BIRD PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @Project : parent
 * @Package : net.lizhaoweb.smkj.module.database
 * @author <a href="http://www.lizhaoweb.net">李召(John.Lee)</a>
 * @EMAIL 404644381@qq.com
 * @Time : 21:45
 */
package net.lizhaoweb.smkj.model.database;

import lombok.Data;
import net.lizhaoweb.smkj.model.AbstractModel;

import java.util.Date;

/**
 * <h1>数据模型 - 月统计数据(原)</h1>
 *
 * @author <a href="http://www.lizhaoweb.cn">李召(John.Lee)</a>
 * @version 1.0.0.0.1
 * @notes Created on 2016年10月24日<br>
 * Revision of last commit:$Revision$<br>
 * Author of last commit:$Author$<br>
 * Date of last commit:$Date$<br>
 * <p/>
 */
@Data
public class Monthly extends AbstractModel {

    /**
     * 车辆标识。
     */
    private String voitureId;

    /**
     * 月份
     */
    private Date month;

    /**
     * 行驶量程数。
     */
    private double mileage;

    /**
     * 行驶时长。
     */
    private double duration;

    /**
     * 平均速度。
     */
    private double avgSpeed;

    /**
     * 平均加速度。
     */
    private double avgAcceleration;

    /**
     * 平均减速度。
     */
    private double avgDeceleration;
}

/**
 * Copyright (c) 2016, Stupid Bird and/or its affiliates. All rights reserved.
 * STUPID BIRD PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @Project : parent
 * @Package : net.lizhaoweb.smkj.model.database
 * @author <a href="http://www.lizhaoweb.net">李召(John.Lee)</a>
 * @EMAIL 404644381@qq.com
 * @Time : 23:34
 */
package net.lizhaoweb.smkj.model.database;

import lombok.Data;
import net.lizhaoweb.smkj.model.AbstractModel;

/**
 * @author <a href="http://www.lizhaoweb.cn">李召(John.Lee)</a>
 * @version 1.0.0.0.1
 * @notes Created on 2016年10月24日<br>
 * Revision of last commit:$Revision$<br>
 * Author of last commit:$Author$<br>
 * Date of last commit:$Date$<br>
 * <p/>
 */
@Data
public class Total extends AbstractModel {

    /**
     * 车辆标识。
     */
    private String voitureId;

    /**
     * 行程次数。
     */
    private double travelTimes;

    /**
     * 行驶量程数。
     */
    private double mileage;

    /**
     * 行驶时长。
     */
    private double duration;

    /**
     * 风险评级
     */
    private double riskRating;

    /**
     *超过比例
     */

    /**
     * 建议折扣
     */
    private double suggestedDiscount;

    /**
     * 欺骗风险
     */
    private double fraudRisk;

    /**
     * 月平均时间
     */
    private double monthlyAvgDuration;

    /**
     * 月平均里程
     */
    private double monthlyAvgMileage;

    
}

 package com.andy.design.pattern.methodfactroy;

import com.andy.design.pattern.IAirLine;

/**
 * 子工厂创建，扩展很方便，新增类
 * 缺点：类很多
 * @author Administrator
 * @date 2019/03/12
 */
public interface IAirLineFactory {
    
    IAirLine createAirLine();
}

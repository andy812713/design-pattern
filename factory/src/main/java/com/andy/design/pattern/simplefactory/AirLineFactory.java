 package com.andy.design.pattern.simplefactory;

 import com.andy.design.pattern.IAirLine;

 /**
 * 使用newInstance   不方便扩展其他产品线    违背开闭原则
 * @author andy
 * @date 2019年3月11日
 */
public class AirLineFactory {
    
    public IAirLine createAirLine(Class<? extends IAirLine> iAirLine){
        try {
            if (iAirLine != null) {
                return iAirLine.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

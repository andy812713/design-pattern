 package com.andy.design.pattern.methodfactroy;

import com.andy.design.pattern.IAirLine;
import com.andy.design.pattern.ShandongAirLine;
/**
 * 
 * @author Administrator
 * @date 2019/03/12
 */
public class ShandongAirLineFactory implements IAirLineFactory{

    public IAirLine createAirLine() {
         return new ShandongAirLine();
    }
    
  
}

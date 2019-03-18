 package com.andy.design.pattern.methodfactroy;

import com.andy.design.pattern.IAirLine;
import com.andy.design.pattern.ShandongAirLine;

public class GuohangAirLineFactory implements IAirLineFactory{

    public IAirLine createAirLine() {
         return new ShandongAirLine();
    }
    
  
}

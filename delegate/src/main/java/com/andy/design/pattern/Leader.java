package com.andy.design.pattern;

import java.util.HashMap;
import java.util.Map;

public class Leader implements  Employee {

    private Map<String,Employee> targets = new HashMap<String,Employee>();

    public Leader() {
        targets.put("前端",new EmployeeA());
        targets.put("后端",new EmployeeB());
    }

    public void doing(String command){
        targets.get(command).doing(command);
    }

}

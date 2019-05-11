package com.andy.design.pattern;


public class EmployeeA implements Employee {

    @Override
    public void doing(String command) {

        System.out.println("我是员工A，我现在开始干【" + command + "】工作");
    }
}

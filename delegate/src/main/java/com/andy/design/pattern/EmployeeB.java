package com.andy.design.pattern;


public class EmployeeB implements  Employee {

    @Override
    public void doing(String command) {

        System.out.println("我是员工B，我现在开始干【" + command + "】工作");
    }
}

package com.andy.design.pattern;

/**
 * <p>用户类</p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/4 0004 19:54
 */
public class User {

    private String userName;
    private String password;
    private String address;
    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

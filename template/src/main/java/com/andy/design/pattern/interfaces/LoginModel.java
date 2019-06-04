package com.andy.design.pattern.interfaces;

/**
 * <p>登录模型</p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/4 0004 20:38
 */
public class LoginModel {

    private String loginId;
    /**
     * 登录的密码
     */
    private String pwd;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}

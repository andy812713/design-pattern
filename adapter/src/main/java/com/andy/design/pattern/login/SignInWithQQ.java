package com.andy.design.pattern.login;

import com.andy.design.pattern.Result;


/**
 * <p>QQ登录，使用继承，不改变原有逻辑</p>
 * @author AndyWang QQ:295268319
 * @date 2019/6/4 0004 20:10
 */
public class SignInWithQQ extends SignInService {

    /**
     * QQ登录
     *
     * @param openId
     * @return
     */
    public Result loginForQQ(String openId) {

        return loginForRegist(openId, null);
    }

    /**
     * 登录
     *
     * @param userName
     * @param password
     * @return
     */
    public Result loginForRegist(String userName, String password) {
        super.regist(userName, null);
        return super.login(userName, null);
    }
}

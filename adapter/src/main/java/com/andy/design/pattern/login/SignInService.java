package com.andy.design.pattern.login;

import com.andy.design.pattern.Result;
import com.andy.design.pattern.User;

/**
 * <p>注册登录流程</p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/4 0004 20:02
 */
public class SignInService {

    /**
     * 注册
     *
     * @param userName
     * @param password
     * @return
     */
    public Result regist(String userName, String password) {
        return new Result(200, "注册成功", new User());
    }


    /**
     * 登录
     *
     * @param userName
     * @param password
     * @return
     */
    public Result login(String userName, String password) {
        return new Result(200, "登录成功", new User());
    }
}

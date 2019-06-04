package com.andy.design.pattern.login;

import com.andy.design.pattern.Result;

/**
 * <p>登录适配</p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/4 0004 20:17
 */
public class LoginForQQAdapter {

    private SignInService signInService;

    public Result login4QQ(String openId){
        signInService.regist(openId,null);
        return signInService.login(openId,null);
    }

    public SignInService getSignInService() {
        return signInService;
    }

    public void setSignInService(SignInService signInService) {
        this.signInService = signInService;
    }
}

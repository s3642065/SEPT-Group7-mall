package com.teemo.sprinboot06mybatiscrud;

import com.teemo.sprinboot06mybatiscrud.controller.LoginController;
import com.teemo.sprinboot06mybatiscrud.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@SpringBootTest
class MallSprinbootApplicationTests {
    private HttpSession httpSession;

    @Resource
    private LoginController loginController;

    @Test
    void contextLoads() {
    }


    // 登录
    @Test
    public String login() {
        String admin = loginController.login("admin", "123456", "", httpSession);
        return admin;
    }

    // 登出
    @Test
    public String logout() {
        String logout = loginController.logout(httpSession);
        return logout;
    }

    // 注册
    @Test
    public String regist() {
        User user = new User();
        user.setUsername("Nick");
        user.setPassword("123456");
        user.setUser_role("user");
        return loginController.registered(user);
    }

}

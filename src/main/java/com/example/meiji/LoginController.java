package com.example.meiji;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(String username, String password, Model model, HttpSession session) throws Exception {
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/companydata?characterEncoding=UTF-8&serverTimezone=Asia/Tokyo",
                "root", "root"); Statement s = c.createStatement();) {
        }

        return "redirect:index";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }
}

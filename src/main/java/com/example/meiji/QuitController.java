package com.example.meiji;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.*;

@Controller
public class QuitController {
    @GetMapping("/quit")
    public String quit(@RequestParam("empID") String id,
                       @RequestParam(name = "work", required = false) String work,
                       Model model) {
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/companydata?characterEncoding=UTF-8",
                "root", "root"); Statement s = c.createStatement()) {

            String sql = "update information set work=? where empID='" + id + "'";

            PreparedStatement preparedStatement = c.prepareStatement(sql);

            preparedStatement.setString(1, "さよなら");

            int result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "redirect:index";
    }
}

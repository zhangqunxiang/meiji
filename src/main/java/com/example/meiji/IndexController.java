package com.example.meiji;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(Model model) throws Exception {
       // model.addAttribute("title", "社員情報");
        //model.addAttribute("subtitle", "社員情報一覧表");

        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/companydata?characterEncoding=UTF-8&serverTimezone=Asia/Tokyo",
                "root", "root"); Statement s = c.createStatement();) {

            String sql = "select * from information  where  delected=0";
            ResultSet rs = s.executeQuery(sql);
            List<HashMap> list = new ArrayList<>();
            while (rs.next()) {
                String empID = rs.getString("empID");
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                String tel = rs.getString("tel");
                String work = rs.getString("work");
                String blacklist = rs.getString("blacklist");
                HashMap<String, String> emp = new HashMap<String, String>();
                emp.put("empID", empID);
                emp.put("name", name);
                emp.put("sex", sex);
                emp.put("tel", tel);
                emp.put("work", work);
                emp.put("blacklist", blacklist);
                list.add(emp);
            }
            model.addAttribute("userList", list);
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
        return "index";
    }

}

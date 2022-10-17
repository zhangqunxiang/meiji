package com.example.meiji;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.sql.*;

@Controller
public class AddController {
   @GetMapping("/add")
   public String add(HttpServletRequest request,
                     @RequestParam(name = "empID", required = false) String empID,
                     @RequestParam(name = "name", required = false) String name,
                     @RequestParam(name = "namePinyin", required = false) String namePinyin,
                     @RequestParam(name = "hiragana", required = false) String hiragana,
                     @RequestParam(name = "kaTaGaNa", required = false) String kaTaGaNa,
                     @RequestParam(name = "sex", required = false) String sex,
                     @RequestParam(name = "tall", required = false) String tall,
                     @RequestParam(name = "weight", required = false) String weight,
                     @RequestParam(name = "tel", required = false) String tel,
                     Model model) throws Exception {

       PreparedStatement preparedStatement = null;

       try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/companydata?characterEncoding=UTF-8&serverTimezone=Asia/Tokyo",
               "root", "root"); Statement s = c.createStatement()) {

           String sql = "insert into information values (?,?,?,?,?,?,?,?,?,?,?,?);";

           preparedStatement = c.prepareStatement(sql);

           preparedStatement.setString(1, empID);
           preparedStatement.setString(2, name);
           preparedStatement.setString(3, namePinyin);
           preparedStatement.setString(4, hiragana);
           preparedStatement.setString(5, kaTaGaNa);
           preparedStatement.setString(6, sex);
           preparedStatement.setString(7, tall);
           preparedStatement.setString(8, weight);
           preparedStatement.setString(9, tel);
           preparedStatement.setString(10, "在职");
           preparedStatement.setString(11, "否");
           preparedStatement.setString(12, "0");

           int result = preparedStatement.executeUpdate();

       } catch (SQLException e) {
           e.printStackTrace();
       }

       return "redirect:index";


   }
}

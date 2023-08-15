package src.main.java.com.example.basicconfiguration.controller;

import com.example.basicconfiguration.domain.User;
import com.example.basicconfiguration.service.UserService;
import com.example.basicconfiguration.tuils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
    @RequestMapping("/login")
public class Login {

@Autowired
private UserService userService;


    @PostMapping("/adminLogin")
    public CommonResult adminLogin(@RequestBody User user){

        return userService.adminLogin(user);
    }

}

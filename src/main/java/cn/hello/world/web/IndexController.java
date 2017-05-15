package cn.hello.world.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "/index.html";
    }

    @RequestMapping("/manage")
    public String manage() {
        return "base/manage";
    }

    @ResponseBody
    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    public User login(@RequestBody  Map<String,String> map){
        String email = map.get("username");
        String password = map.get("password");
        User user = new User();
        user.setEmail(email);
        user.setUsername(email);
        user.setPassword(password);
        return user;
    }
}
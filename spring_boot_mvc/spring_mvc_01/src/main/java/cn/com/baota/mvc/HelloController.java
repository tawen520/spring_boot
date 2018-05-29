package cn.com.baota.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Description: </p>
 * <p>Date: 2018-05-29</p>
 * <p>Time: 08:34</p>
 * <p>Author: sunbaota</p>
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}

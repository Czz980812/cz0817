package cn.kgc.web;

import cn.kgc.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello(Model model){
        ArrayList<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student(700,"贺搏翰牛逼",21));
        stuList.add(new Student(800,"严祥哥牛逼",22));
        stuList.add(new Student(900,"刘永祥牛逼",19));

        model.addAttribute("stuList",stuList);

        return "hello";
    }
}

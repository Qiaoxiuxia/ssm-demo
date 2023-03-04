package com.itqiao.controller;

import com.itqiao.domain.Student;
import com.itqiao.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author qiaoxiuxia  15680879850@163.com
 * @version 2023/2/27 7:15
 * @since Java17
 */
@Controller
@RequestMapping("/student/v2")
public class StudentControllerV2 {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/all")
    public String all(Model model) {
        List<Student> allStudent = studentService.findAllStudent();
        model.addAttribute("students", allStudent);
        return "allStudent";
    }

    @RequestMapping("/add")
    public String add(Student student) {
        studentService.addStudent(student);
        //重定向到查询所有学生
        return "redirect:/student/all";
    }

    @RequestMapping("/delete")
    public String add(Long id) {
        return "redirect:/student/delete";
    }


}

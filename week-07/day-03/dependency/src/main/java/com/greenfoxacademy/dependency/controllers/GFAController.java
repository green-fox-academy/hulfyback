package com.greenfoxacademy.dependency.controllers;

import com.greenfoxacademy.dependency.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GFAController {
  @Autowired
  StudentService studentService;

  @RequestMapping("/gfa")
  public String index() {
    return "gfa_index";
  }

  @GetMapping(value= "/gfa/list")
  public String listStudents(Model model, @RequestParam("studentName") String studentName) {
    studentService.save(studentName);
    return "add_student_form";
  }

  @PostMapping(value= "/gfa/add")
  public String addStudent(Model model) {
    model.addAttribute("students", studentService.findAll());
    return "gfa_list";
  }
}

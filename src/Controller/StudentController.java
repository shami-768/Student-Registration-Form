package com.training.Controller;

import com.training.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {
    @GetMapping("/stuForm")
    public String getStudent(){
        return "Validate";
    }
    @PostMapping("/save")
    public String saveStudent(@Valid @ModelAttribute Student student, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("errors",result.getAllErrors());
            return "Failure";
        }
        return "Success";

    }

}

package com.example.exam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExamController {

    @Autowired
    private StudentRepository repository;

    @Autowired
    private UserRepository userRepository;

    // ================= LOGIN PAGE =================

    @GetMapping("/")
    public String login() {

        return "login";

    }

    // ================= DASHBOARD =================

    @GetMapping("/dashboard")
    public String dashboard() {

        return "dashboard";

    }

        // ================= ADMIN PAGE =================
    @GetMapping("/admin")
public String admin() {

    return "admin";

}

    // ================= EXAM PAGE =================

    @GetMapping("/exam")
    public String exam() {

        return "exam";

    }

    // ================= RESULT PAGE =================

    @GetMapping("/result")
    public String result() {

        return "result";

    }


     // ================= CERTIFICATE PAGE =================
    @GetMapping("/certificate")
public String certificate() {

    return "certificate";

}


    // ================= REGISTER PAGE =================

    @GetMapping("/register")
    public String registerPage() {

        return "register";

    }

    // ================= REGISTER USER =================

    @PostMapping("/register")
    public String registerUser(

            @RequestParam String name,

            @RequestParam String email,

            @RequestParam String password) {

        // Check existing email

        User existingUser = userRepository.findByEmail(email);

        if (existingUser != null) {

            return "redirect:/register?error=true";

        }

        User user = new User();

        user.setName(name);

        user.setEmail(email);

        user.setPassword(password);

        user.setRole("STUDENT");

        userRepository.save(user);

        return "redirect:/";

    }

    // ================= SAVE EXAM RESULT =================

    @PostMapping("/save")
    @ResponseBody
    public String saveStudent(

            @RequestParam String name,

            @RequestParam String email,

            @RequestParam int score) {

        Student student = new Student();

        student.setName(name);

        student.setEmail(email);

        student.setScore(score);

        repository.save(student);

        return "Saved Successfully";

    }

    // ================= LEADERBOARD PAGE =================

    @GetMapping("/leaderboard")
    public String leaderboard(Model model) {

        List<Student> students = repository.findAll();

        model.addAttribute("students", students);

        return "leaderboard";

    }

}
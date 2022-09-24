package com.patientregistrationservice.demo.Controller;

//import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.patientregistrationservice.demo.Entity.Patient;
import com.patientregistrationservice.demo.Repository.PatientRepo;

@Controller
public class PatientController {

    @Autowired
    private PatientRepo repo;

    @GetMapping("/home")
    public String home() {

        return "home";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/register")
    public String RegPatient(@ModelAttribute Patient PD, HttpSession session) {

        System.out.println(PD);
          // Logic for generating the username
          String first2chars_firstname = PD.getFirstname().substring(0, Math.min(PD.getFirstname().length(), 4));
          String first2chars_lastname = PD.getLastname().substring(0, Math.min(PD.getLastname().length(), 2));
          String username_generator = first2chars_firstname + (int)(Math.random()*10000) + first2chars_lastname;
          
          // setting the username for database
          PD.setUsername(username_generator);

        repo.save(PD);

        session.setAttribute("message", "Patient Registration Completed and USERNAME generated");
        return "redirect:/";

    }

    /*
     * @GetMapping("/AllData")
     * public List<Patient> getPatient(@ModelAttribute Patient P) {
     * (List<Patient>) repo.findAll(P);
     * return
     * }
     */
}

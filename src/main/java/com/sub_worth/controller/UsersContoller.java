package com.sub_worth.controller;

import com.sub_worth.ApiQueries.ProcessStarlingData;


import com.sub_worth.model.HoursOnSub;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

@Controller
public class UsersContoller {

    //TODO should ideally be @Autowired need to figure out the configuration of outside packages
    // refer to https://stackoverflow.com/questions/40384056/consider-defining-a-bean-of-type-package-in-your-configuration-spring-boot
    private final ProcessStarlingData processStarlingData = new ProcessStarlingData();

    public UsersContoller() throws NoSuchAlgorithmException, IOException, InvalidKeySpecException {
    }

//    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/")
    public String getClientName(Model model, HoursOnSub hoursOnSub)
    {
            model.addAttribute("clientName", processStarlingData.getAccountHolderName());
            model.addAttribute("subs", processStarlingData.getDirectDebitMandate());
            model.addAttribute("hoursOnSub", hoursOnSub);
        return "home";
    }

    @PostMapping
    public String save(HoursOnSub hoursOnSub, Model model){
        model.addAttribute("hoursOnSub", hoursOnSub);
        return "saved";
    }


}

package com.example.configclient.controller;

import com.example.configclient.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProfileController {

    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;

  //  @RequestMapping(value = "profile",method = RequestMethod.GET)
 //   public MemberProfileConfiguration getConfig(){
   //     return memberProfileConfiguration;
  //  }

    @RequestMapping(value = "profile",method = RequestMethod.GET)
    public String getProfile(Model model){

        model.addAttribute("model",memberProfileConfiguration.getDefaultModel());
        model.addAttribute("min",memberProfileConfiguration.getRentPeriod());
        return "myprofile";
    }

}

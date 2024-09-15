package com.teleusko.JopApp.controller;

import com.teleusko.JopApp.entity.JobPost;
import com.teleusko.JopApp.service.JobService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {



    @Autowired
    private JobService service;

    @RequestMapping({"/home","/"})
    public  String hello(Model model){

        return "home.html";
    }

    @RequestMapping("/addjob")
    public String addJobPost(Model model){
        model.addAttribute("jobPost", new JobPost());
        return "addjob.html";
    }




    @RequestMapping("/handleForm")
    public String addJobPost(JobPost jobPost , Model model){

        service.addJob(jobPost);
        List<JobPost> jobPosts=new ArrayList<>();
        jobPosts.add(jobPost);
        model.addAttribute("jobPosts",jobPosts);
        model.addAttribute("jobPost",jobPost);

        return "success.html";
    }


    @RequestMapping("/viewalljobs")
    public String viewAllJobs( Model model){
      List<JobPost> jobPosts=  service.getAllJobs();
        System.out.println(jobPosts);
        model.addAttribute("jobPosts",jobPosts);

        return "viewalljobs.html";
    }

}


package com.teleusko.JopApp.service;

import com.teleusko.JopApp.entity.JobPost;
import com.teleusko.JopApp.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost){

        jobRepo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){

        return jobRepo.getAllJobs();
    }


}

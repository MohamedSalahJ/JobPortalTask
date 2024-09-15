package com.teleusko.JopApp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Controller;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
public class JobPost {

    private int postId;

    private String postProfile;

    private String postDesc;

    private List<String> postTechStack;

    private int reqExperience;

    public JobPost(int postId, String postProfile, String postDesc, int reqExperience, List<String> postTechStack) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.postTechStack = postTechStack;
        this.reqExperience = reqExperience;
    }
}

package com.l_p_solutions.demo.model;

public class Solution {

    private final String email;
    private final String name;
    private final String urlRepo;

    public Solution(String email, String name, String urlRepo) {
        this.email = email;
        this.name = name;
        this.urlRepo = urlRepo;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getUrlRepo() {
        return urlRepo;
    }
}

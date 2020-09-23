package com.company.Lambda;
import  java.util.List;
import java.util.Arrays;

public class Developer {
    private String name;
    private List<String> languages;
    Developer(String name, List<String> languages){
        this.name = name;
        this.languages = languages;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}

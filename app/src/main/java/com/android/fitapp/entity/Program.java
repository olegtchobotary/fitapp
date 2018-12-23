package com.android.fitapp.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Program extends Article implements Serializable {
    private List<String> tags;
    private List<Exercise> exercises;

    public Program(){
        tags = new ArrayList();
        title = "Default title";
        desc = "Description of current program";
    }

    @Override
    public String toString(){
        return "\nTitle: " + title + "\nDescription: " + desc + "\nTags: " + tags;
    }

}
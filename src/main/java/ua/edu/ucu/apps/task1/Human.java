package ua.edu.ucu.apps.task1;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Human {
    
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
    private List<String> courses;
}
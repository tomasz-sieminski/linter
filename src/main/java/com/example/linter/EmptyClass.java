package com.example.linter;


import org.springframework.boot.admin.*;

public class EmptyClass {
    private String wrong_cases = "test";
    EmptyClass() {
        if(wrong_cases.length()!=0) System.out.println("test");
    }
}

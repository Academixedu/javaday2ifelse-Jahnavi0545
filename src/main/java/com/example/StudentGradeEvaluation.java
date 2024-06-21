package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name :");
        String name=scanner.nextLine();
        System.out.print("Enter age :");
        int age=scanner.nextInt();
        System.out.print("Enter score :");
        int score=scanner.nextInt();
        
        
    
    
    System.out.println("Name :"+name);
    System.out.println("Age :"+age);
    System.out.println("Score :"+score);
    
    String grade;
    if (score>=90){
        grade="A";
    }
    else if (score>=80 && score<90){
        grade="B";
    }
    else if (score>=70 && score<80){
        grade="C";
    }
    else if (score>=60 && score<70){
        grade="D";
    }
    else {
        grade="F";
    }
    
    
    System.out.println("Grade :"+grade);
       
        

    }
    
}

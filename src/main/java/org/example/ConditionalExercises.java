package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        if (x < 5) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }

    public void getAgeGroup(int age) {
       if (age < 13) {
           System.out.println("You are a child.");
       } else if(age < 20){
                System.out.println("You are a teen");
            }else {
                System.out.println("You are an adult");
                   }
        }


    public void isValidPassword(String password){
            if (password.length() >= 8) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }


        }

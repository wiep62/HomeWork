package org.example;


public class Person {
    private String name;
    private String email;
    private int number;

    public Person(String name, String email) {



         this.name = name;
        this.email = email;


    }




    public String toString()
    {
        return " Имя : " + name + ", email : " + email + "]";
    }

}

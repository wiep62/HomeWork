package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


      CustomerList cust = new CustomerList();



     while (true){

           System.out.println("Введите команду:");
           String input = new Scanner(System.in).nextLine();

           if (input.equals("list")){
              cust.getList();
           }
           try {
               if (input.equals("add")) {
                   cust.addCustomer();
               }

           }
           catch (MyException e){
               System.out.println(e.getMessage());
           }


           if (input.equals("delete")){
              cust.rmCustomer();
                 }
         if (input.equals(("help"))){
             System.out.println("add - добавить объект;" + "\n" +
                     "delete - удалить объект"+ "\n" +
                     "list - отоброзить список");
         }
    }


    }
}
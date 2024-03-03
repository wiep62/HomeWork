import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
               if (input.equals(("help"))){
               System.out.println("add - добавить объект;" + "\n" +
                                  "delete - удалить объект"+ "\n" +
                                    "list - отоброзить список");

           }



       }

    }
}}
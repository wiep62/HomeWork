package org.example;

import org.example.MyException;
import org.example.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;

public class CustomerList {

    /**
    при некорректном количестве компонентов в переданной строке с данными;
    при неверном формате номера телефона;
    при неправильном формате email. */

    TreeMap<Integer, Person> map = new TreeMap<>();
    Logger logger = LoggerFactory.getLogger(CustomerList.class);

    //    Защитите программу от преждевременного завершения метода addCustomer() — напишите код,
    //    который будет «отлавливать» исключения и выводить эту информацию в консоль
    //    в понятном пользователю виде и в лог (см. ниже).


    public void addCustomer() throws MyException {

        System.out.println("Введите number:");

        String numberStr = new Scanner(System.in).nextLine();
        String regexNum = "[0-9]{9}";
        System.out.println(numberStr.matches(regexNum));
        if (!numberStr.matches(regexNum)){
            logger.error("Не корректный номер телефона  пользователя!");
            throw new MyException("Не корректный номер телефона пользователя!");
        }
Integer number = Integer.valueOf(numberStr);


        System.out.println("Введите name:");
                String name = new Scanner(System.in).nextLine();

        String regex = "[A-z]{1,10}";
        System.out.println(name.matches(regex));
        if (!name.matches(regex)){
            logger.error("Не корректное имя пользователя!");
            throw new MyException("Не корректное имя пользователя!");
        }

        System.out.println("Введите email:");
        String email = new Scanner(System.in).nextLine();
        String regexEmail = "[A-Za-z0-9]{4,10}@[a-z0-9]{2,6}.[a-z]{2}";
        System.out.println(email.matches(regexEmail));
        if (!email.matches(regexEmail)){
            logger.error("Не корректный email!");
            throw new MyException("Не корректный email!");
        }

                map.put(number, new Person(name, email));

        logger.info("Add person " + number);

    }


    public void rmCustomer(){
        System.out.println("Введите номер удаляемого абонента : ");
        Integer number = new Scanner(System.in).nextInt();
        map.remove(number);
        logger.info("delete" + number);

    }
    public TreeMap<Integer, Person> getList(){ // выводит список элементов
        logger.info("Show List");

        for (Integer s : map.keySet()){
            System.out.println("Номер телефона : " + s+ map.get(s));
        }
        return map;
    }



}

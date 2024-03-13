package org.example;

public class MyException extends Exception {
    public MyException(String message){
        super(message);
    }


}
/**
 *  Напишите в классе CustomerStorage проекта ConsoleCustomerList все варианты защиты
 *  от некорректных данных, которые вам удастся придумать и обнаружить.
 *  Создайте собственные классы исключений, которые должны выбрасываться:
 *    при некорректном количестве компонентов в переданной строке с данными;
 *    при неверном формате номера телефона;
 *    при неправильном формате email.
 * */
import java.io.IOException;
import java.util.*;

public class CustomerList {

    /**
    при некорректном количестве компонентов в переданной строке с данными;
    при неверном формате номера телефона;
    при неправильном формате email. */

    TreeMap<Integer, Person> map = new TreeMap<>();

    //    Защитите программу от преждевременного завершения метода addCustomer() — напишите код,
    //    который будет «отлавливать» исключения и выводить эту информацию в консоль
    //    в понятном пользователю виде и в лог (см. ниже).

    public void addCustomer() throws MyException {
          /*  try {
           System.out.println("Введите number:");
                 number = new Scanner(System.in).nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Введеное значение не является Integer!");
            }*/

        System.out.println("Введите number:");

        String numberStr = new Scanner(System.in).nextLine();
        String regexNum = "[0-9]{9}";
        System.out.println(numberStr.matches(regexNum));
        if (!numberStr.matches(regexNum)){
            throw new MyException("Не корректный номер телефона имя пользователя!");
        }
Integer number = Integer.valueOf(numberStr);


        System.out.println("Введите name:");
                String name = new Scanner(System.in).nextLine();

        String regex = "[A-z]{1,10}";
        System.out.println(name.matches(regex));
        if (!name.matches(regex)){
            throw new MyException("Не корректное имя пользователя!");
        }

        System.out.println("Введите email:");
        String email = new Scanner(System.in).nextLine();
        String regexEmail = "[A-Za-z0-9]{4,10}@[a-z0-9]{2,6}.[a-z]{2}";
        System.out.println(email.matches(regexEmail));
        if (!email.matches(regexEmail)){
            throw new MyException("Не корректнsq email!");
        }

                map.put(number, new Person(name, email));


    }


    public void rmCustomer(){
        System.out.println("Введите number удоляемого абонента : ");
        Integer number = new Scanner(System.in).nextInt();
        map.remove(number);
    }
    public TreeMap<Integer, Person> getList(){ // выводит список элементов
        for (Integer s : map.keySet()){
            System.out.println("Номер телефона : " + s+ map.get(s));
        }
        return map;

    }



}

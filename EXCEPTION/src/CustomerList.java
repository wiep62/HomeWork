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

    public void addCustomer()  {

            System.out.println("Введите number:");
            try {
                Integer number = new Scanner(System.in).nextInt();
                System.out.println("Введите name:");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Введите email:");
                String email = new Scanner(System.in).nextLine();

                map.put(number, new Person(name, email));
            }
            catch (InputMismatchException e) {
                System.out.println("Введеное значение не является Integer!");
            }
            catch (InvalidInputException e){
                if (name == null || input.isEmpty()) {
                    throw new InvalidInputException("Input cannot be null or empty");
                }
            }

        public static void validateInput(String input) throws InvalidInputException {
            if (input == null || input.isEmpty()) {
                throw new InvalidInputException("Input cannot be null or empty");
            }
        }
    }

    https://habr.com/ru/articles/746218/
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

import java.util.Scanner;
/**

можно как то доработать код, чтобы нумерация этажей начиналась с 1 а не с 2 (не меняя : public int currentFloor = 1;)?
*/

public class Main {
    public static void main(String[] args) {

 // задание 1
       Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("\n" + "Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }

     /*     *//*  Напишите в методе main класса Main дополнительный код, который будет создавать
    экземпляр класса (объект) груза и его копии при изменении тех или иный полей.
    Напишите также код, который позволит проверить, что копирование действительно происходит.*//*

        *//** Задание 2*//*

        CargoInformation cargo = new CargoInformation();
        CargoInformation cargo1 = new CargoInformation( 12, 12, "21", "2323", true, true);
        Dimensions dimensions = new Dimensions(2,2,2);
        dimensions = dimensions.setWidth(12);
        dimensions = dimensions.setHeight(4);
        dimensions = dimensions.setLength(10);



      CargoInformation copy = new CargoInformation();

                copy = copy.setDimensions(222);
                copy = copy.setWeight(12);
                copy = copy.setAddress("Polotsk");
                copy = copy.setRegistrationNumber("qwwwwwww");
                copy = copy.setIsCargoFragile(false);
                copy = copy.setProperty(false);

        System.out.println("Габариты груза (вручную): " + copy.getDimensions());
        System.out.println("Габариты груза (через копирование метода): " + dimensions.volume());
        System.out.println("Вес груза: " + copy.getWeight());
        System.out.println("Адресс груза: " + copy.getAddress());
        System.out.println("Регитрационный номер груза: " + copy.getRegistrationNumber());
        System.out.println("Свойство груза: " + copy.isProperty());
        System.out.println("Хрупкий груз: " + copy.isCargoFragile());



*/





    }
}
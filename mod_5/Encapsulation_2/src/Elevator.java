public class Elevator {
    public int currentFloor = 1;
    public int minFloor;
    public int maxFloor;
    private String items = "";

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;

    }

    // Метод moveDown, перемещающий лифт на один этаж вниз
    // (уменьшающий значение переменной currentFloor на единицу)
    public void moveDown() {

        currentFloor = currentFloor - 1;
    }

    //Метод moveUp, перемещающий лифт на один этаж вверх
    public void moveUp() {

        currentFloor = currentFloor + 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
public void clear(){
        currentFloor = 1;
        items = "";
}


    /*   Метод move(int floor), перемещающий лифт на заданный в параметре этаж, если он задан верно.
    Если параметр у метода задан неверно, ничего не делать и выводить в консоль сообщение об ошибке.
    Этот метод может перемещать лифт только последовательно, по одному этажу, с помощью циклов и
    методов moveUp и moveDown, и он должен выводить в консоль текущий этаж после каждого перемещения между этажами
   */

    public void move(int floor) {

        if (minFloor > floor || maxFloor < floor) {
            items = "неверно задан этаж: " + floor;
             System.out.println(items);
           //  clear();
        } else if (currentFloor > floor) {

            while (currentFloor != floor) {
                moveDown();
                items = "\n" + " этаж: " + currentFloor;
                if (currentFloor == floor) {
                    items = "\n" + "текущий этаж: " + currentFloor;
                }
                System.out.println(items);

            }
        } else if (currentFloor < floor) {
            while (currentFloor != floor) {
                moveUp();
                items = "\n" + " этаж: " + currentFloor;
                if (currentFloor == floor) {
                    items = "\n" + "текущий этаж: " + currentFloor;

                }
                System.out.println(items);

            }

        }

        clear();
        //break;
        //System.out.println(items);
    }


}


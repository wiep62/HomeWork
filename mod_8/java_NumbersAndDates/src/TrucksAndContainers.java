public class TrucksAndContainers {
    /**Представьте, что вы доставляете груз в ящиках одинакового размера.
     * У вас есть грузовики и контейнеры. В каждый грузовик помещается максимум
     * 12 контейнеров. В каждый контейнер — не более 27 ящиков.
     * Ящики, контейнеры и грузовики пронумерованы.
     */

    private static int box; //ящик
    private static int container; //количество ящиков в контейнере
    private static int truck; //колич контейнеров в грузовике

    public void calculateTruckCount(int box) {

        //рассчет контейнеров:
        if (box % 27 == 0) {
            container = box / 27;

        } else {
            double a = Math.ceil(box / 27);
            container = (int) (a + 1);

        }
//расчет грузовиков:
        if (container % 12 == 0) {
            truck = container / 12;

        } else {
            double b = Math.ceil(container / 12);
            truck = (int) (b + 1);
        }

        int j = 1; //количество контейнеров
        int k = 1; //количество ящиков
        //нумерация грузовиков:
        for (int i = 1; i <= truck; i++){//количество ящиков в 1 грузовике
            System.out.println("Грузовик: " + i);

            for (int l=12; (j <= container) && (l>0); j++, l--) { //количество коробок в 1 ящике
                System.out.println("\t Контейнер " + j);

                int m = 27;
                while (k <= box && m > 0) {
                    System.out.println("\t\t Ящик " + k);
                    k++;
                    m--;
                }
            }

        }



        /*
        int containerCount = box / container +
                (box % container == 0 ? 0 : 1);
        // Код расчёта количества кассет напишите аналогичным образом:
        int truckCount = containerCount / truck +
                (containerCount % truck == 0 ? 0 : 1); //в 1-ом грузовике = 27 контейнеров
       // return truckCount;

        for (int i = 1; i <= truckCount; i++){
            System.out.println("Грузовик № " + i);
            for (int j = 1; j <= containerCount; j++){
                System.out.println("Контейнер № " + j);
            }

        }


       System.out.println(
                "Грузовик: " + i +
                        System.lineSeparator()+
                        "\t" + "Контейнер: " + i +
                        System.lineSeparator() + "\t" + "\t" + "Ящик: " + box +
                        System.lineSeparator() +
                        System.lineSeparator() +
                "Необходимо: " +
                        System.lineSeparator() +
                        System.lineSeparator() +
                        "грузовиков - " + truckCount + "шт." +
                        System.lineSeparator() + "контейнеров - " + containerCount + "шт."
        );*/
        System.out.println("Грузовиков: " + truck);
        System.out.println("Контейнеров: " + container);

    }






}

public class Main {
    public static void main(String[] args) {
        int box  = 58;
        int container;
        int cargo ;
        if (box%27 == 0) {
            container =  box/27;
            System.out.println("Container - " + container);
        }
        else {
            double a = Math.ceil(box/27);
            container = (int) (a+1);
            System.out.println("Container - " + container);
        }

        if (container%12 == 0) {
            cargo = container/12;
            System.out.println("Cargo - " + cargo);
        }
        else {
            double b = Math.ceil(container/12);
            cargo = (int) b + 1;
            System.out.println("Cargo - " + cargo);
        }
        int k = 1; // для счетчика ящиков
        int j = 1; // для счетчика контейнеров

        for (int i = 1; i <= cargo; i++) {
            System.out.println("Грузовик  " + i);

            for (int l=12; (j <= container) && (l>0); j++, l--) {
                System.out.println("\t Контейнер " + j);

                int m = 27;
                while (k <= box && m > 0){
                    System.out.println("\t\t Ящик " + k);
                    k++;
                    m--;
                }
            }
        }
    }
}
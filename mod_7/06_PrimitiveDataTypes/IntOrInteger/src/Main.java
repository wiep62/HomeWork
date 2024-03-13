public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(65536);
        //System.out.println(container.getCount());


        for (int i = 0; i < container.getCount(); i++) {
            char c = (char) i;

            if ((char) i >= 'А' && (char) i <= 'Е') {

                System.out.println(i + " - " + (char) i);
            }

        }
        for (int i = 0; i < container.getCount(); i++) {
            char c = (char) i;

            if ((char) i == 'Ё') {
                System.out.println(i + " - " + (char) i);
            }
        }


        for (int i = 0; i < container.getCount(); i++) {

            if ((char) i >= 'Ж' && (char) i <= 'е') {

                System.out.println(i + " - " + (char) i);
            }
        }
        for (int i = 0; i < container.getCount(); i++) {

            if ((char) i == 'ё') {
                System.out.println(i + " - " + (char) i);
            }
        }
        for (int i = 0; i < container.getCount(); i++) {
             if ((char) i >= 'ж' && (char) i <= 'я') {

                System.out.println(i + " - " + (char) i);
            }
        }

            // TODO: ниже напишите код для выполнения задания:
            //  С помощью цикла и преобразования чисел в символы найдите все коды
            //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        }

    }

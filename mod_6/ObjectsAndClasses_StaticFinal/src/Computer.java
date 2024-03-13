public class Computer {

    /**
     * Создайте новый проект и класс Computer со свойствами-комплектующими.
     * Класс Computer должен иметь методы, позволяющие менять его комплектующие
     * с помощью сеттеров: процессор, оперативную память, накопитель, экран и клавиатуру.
     */

    private final String vendor;
    private final   String name;
    public Processor processor;
    public Ram ram;
    public StoreDev storeDev;
    public Screen screen;
    public Keyboard keyboard;

   // private final RamType type;


    /*
    В классе Computer также создайте текстовые поля vendor (производитель) и name (название),
    задаваемые при создании компьютера (в конструкторе). Они также должны быть final.
    */


    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }



    public Computer setVendor (String vendor) {
            return new Computer(
                    vendor,
                     name,
                     processor,
                     ram,
                     storeDev,
                     screen,
                     keyboard);
        }
    public Computer setName (String name) {
        return new Computer(
                vendor,
                name,
                processor,
                ram,
                storeDev,
                screen,
                keyboard);
    }

    public Computer(String vendor,
                String name,
                Processor processor,
                Ram ram,
                StoreDev storeDev,
                Screen screen,
                Keyboard keyboard) {
            this.vendor = vendor;
            this.name = name;
            this.processor = processor;
            this.ram = ram;
            this.storeDev = storeDev;
            this.screen = screen;
            this.keyboard = keyboard;
        }

/**
 * Для каждого такого свойства создайте классы с перечисленными полями
 * (имена классов и полей, а также типы полей придумайте самостоятельно)
 *  для хранения следующих сущностей:
 Процессор:
 частота;
 количество ядер;
 производитель;
 вес.
 *
 Оперативная память:
 тип;
 объём;
 вес.
 *
 Накопитель информации:
 тип — HDD, SSD;
 объём памяти;
 вес.
 *
 Экран:
 диагональ;
 тип (IPS, TN, VA);
 вес.
 *
 Клавиатура:
 тип;
 наличие подсветки;
 вес.
 * */


/*
* Реализуйте в классе Computer следующие методы:
Метод расчёта общей массы компьютера, возвращающий суммарный вес всех его комплектующих.
Геттеры и сеттеры для всех комплектующих компьютера.
Метод toString, возвращающий в удобочитаемом формате всю информацию о компьютере и его комплектующих.
* */
/**Метод расчёта общей массы компьютера, возвращающий суммарный вес всех его комплектующих.
 * */
        public int totalWeight () {
            return processor.getWeight() + ram.getWeight() + storeDev.getWeight() + screen.getWeight() + keyboard.getWeight();
        }
/**
 * Метод toString, возвращающий в удобочитаемом формате всю информацию о компьютере и его комплектующих:
 */


        public void toString (Computer computer) {

String procText =
        "\n" +
                "\n" +  "Производитель: " + getVendor() +
                "\n" + " Имя компьютера: " + getName() +
                "\n" +"Процессор: " +
                "\n" +"частота: " + processor.getFrequency() +
                "\n" +"количество ядер: " + processor.getNumCores() +
                "\n" + "производитель: " + processor.getManufacturer() +
                "\n" + "вес: " + processor.getWeight() +
        "\n";
String romText =    "\n" + "Оперативная память: " +
        "\n" + "тип: " + ram.getType() +
        "\n" + "объём: " + ram.getVolume() +
        "\n" + "вес: " + ram.getWeight() +
        "\n";
String StoreText = "\n" + "Накопитель информации: " +
        "\n" + "тип — HDD, SSD: " + storeDev.getStoreDevice() +
        "\n" + " объём памяти: " + storeDev.getVolume() +
        "\n" + "вес: " + storeDev.getWeight() +
        "\n";
String ScreenText = "\n" + "      Экран: " +
        "\n" + " диагональ: " + screen.getDiagonal() +
        "\n" + " тип (IPS, TN, VA): " + screen.getScreene() +
        "\n" + " вес: " + screen.getWeight() +
        "\n";
String KeyText =  "\n" + "Клавиатура:" +
        "\n" + "тип: " + keyboard.getKeyBoard() +
        "\n" + "наличие подсветки: " + keyboard.getBacklight() +
        "\n" + " вес: " + keyboard.getWeight();

            System.out.println("Производитель: " + getVendor() +"\n" + "Наименование : " + getName() + procText + romText + StoreText + ScreenText +  KeyText );
        }

    }


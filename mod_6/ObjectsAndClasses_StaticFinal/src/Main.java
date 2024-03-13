public class Main {
    public static void main(String[] args) {
Processor processor = new Processor(2.2, 4, "Intell", 1);
Ram ram = new Ram("DDR3", 8, 1);
StoreDev storeDev = new StoreDev("SSD", 500, 5);
Screen screen = new Screen(16.2, "IPS", 10 );
Keyboard keyboard = new Keyboard("USB", 1, 2);
Computer computer = new Computer("Russia", "MSI", processor, ram, storeDev, screen, keyboard);


        Processor processor1 = new Processor(8.2, 8, "AMD", 15);
        Ram ram1 = new Ram("DDR4", 5, 14);
        StoreDev storeDev1 = new StoreDev("SSD", 5000, 5);
        Screen screen1 = new Screen(16.2, "IPS", 10 );
        Keyboard keyboard1 = new Keyboard("PS2", 12, 2);
        Computer computer1 = new Computer( "USA", "HP", processor1, ram1, storeDev1, screen1, keyboard1);

computer.toString(computer);
System.out.println("Общий вес компьютера: " + computer.totalWeight());

        computer1.toString(computer);
        System.out.println("Общий вес компьютера: " + computer1.totalWeight());
    }
}
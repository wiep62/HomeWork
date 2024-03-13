public class Processor {

    private final double  frequency;
    private final int numCores;
    private final String manufacturer;
    private final int weight;

    public Processor(double frequency, int numCores, String manufacturer, int weight) {
        this.frequency = frequency;
        this.numCores = numCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }
    public Processor() {
        frequency = 0;
        numCores = 0;
        manufacturer = "manufacturer";
        weight = 0;
    }

    public Processor setFrequency(double frequency){
        return new Processor( frequency,  numCores,  manufacturer,  weight);
    }
    public Processor setNumCores(int numCores){
        return new Processor( frequency,  numCores,  manufacturer,  weight);
    }
    public Processor setManufacturer(String manufacturer){
        return new Processor( frequency,  numCores,  manufacturer,  weight);
    }
    public Processor setWeight(int weight){
        return new Processor( frequency,  numCores,  manufacturer,  weight);
    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumCores() {
        return numCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }
}

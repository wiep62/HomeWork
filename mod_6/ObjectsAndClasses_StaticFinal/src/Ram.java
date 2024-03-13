public class Ram {
    private String ramType;
    private final int   volume;
    private final int   weight;

    public Ram(String ramType, int volume, int weight) {
        this.ramType = ramType;
        this.volume = volume;
        this.weight = weight;
    }

    public Ram() {
       ramType = "DDR.x";
       volume = 512;
       weight = 0;
    }

    public Ram setRamType(String ramType){
        return new Ram(ramType, volume, weight);
    }
    public Ram setVolume(int   volume) {
        return new Ram(ramType, volume, weight);
    }

    public Ram setWeight(int   weight) {
        return new Ram(ramType, volume, weight);
    }

        public String getType() {
        return ramType;
    }

    public int getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }
}
